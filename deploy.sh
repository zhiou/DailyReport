#!/bin/bash
source proj.env
next_version=""

usage() {
  echo "
  Usage:
   -r,  Retry Again
  "
}

retry() {
  echo 'retry...'
  git add . && git commit --amend --no-edit && deploy
}

check_local_if_latest() {
  git status | grep "nothing to commit, working tree clean"
  if [ "$?" -ne 0 ]; then
    echo -e "\033[31mERROR: there are tracked files in local workspakce, please commit!! \033[0m\n"
    exit 1
  fi
}

update_container_tag_version() {
  current_version_number="$(cat deploy/Chart.yaml | grep -E "appVersion" | xargs echo | awk -F ':' '{print $2}' | awk '{sub(/^ */, "");sub(/ *$/, "")}1')"
  next_version="$current_version_number""_build_$(git rev-parse --short HEAD)"
  current_tag=$(cat deploy/values.yaml | grep -E "tag:")
  sed -i "" "s/$current_tag/  tag: $next_version/g" deploy/values.yaml
  # 提交修改后的values.yaml文件
  git add . && git commit --amend --no-edit
}

# clean dist folder
clean() {
  if [[ -e 'gradlew' ]]; then
    ./gradlew clean
  fi
  if [[ -e 'package.json' ]] && [[ -d 'dist' ]]; then
    rm -rf ./dist
  fi
}

# compile source
compile() {
  if [[ -e 'gradlew' ]]; then
    ./gradlew bootJar
  fi
  if [[ -e 'package.json' ]]; then
    yarn && yarn deploy
  fi
  if [ "$?" -ne 0 ]; then
    echo -e "\033[31mERROR: Compile Failed! \033[0m\n"
    exit 1
  else
    echo -e "\033[32mCompile Successful! \033[0m\n"
  fi
}

# build docker image
build_image() {
  docker build -t "$registry:$next_version" .
  echo -e "\033[32mBuild Docker Image Version: $registry:$next_version! \033[0m\n"
  if [ "$?" -ne 0 ]; then
    echo -e "\033[31mERROR: Build Docker Image Failed! \033[0m\n"
    exit 1
  else
    echo -e "\033[32mBuild Docker Image Successful! \033[0m\n"
  fi
}

# upload docker image to tencent docker registry
upload_image() {
  docker push "$registry:$next_version"
  if [ "$?" -ne 0 ]; then
    echo -e "\033[31mERROR: Push Latest Docker Image Failed! Retry Again!!! \033[0m\n"
    docker push "$registry:$next_version"
    if [ "$?" -ne 0 ]; then
      echo -e "\033[31mERROR: Push Latest Docker Image Failed!!! \033[0m\n"
      exit 1
    fi
  else
    echo -e "\033[32mPush Latest Docker Image Successful! \033[0m\n"
  fi
}

deploy() {
  check_local_if_latest && clean && compile && update_container_tag_version && build_image && upload_image
}

upgrade_app() {
  cd ./deploy || exit
  helm upgrade "$appname" . -n $namespace
}

while getopts ':r:h:' opt; do
  case $opt in
  r)
    echo 'retry ...'
    retry
    ;;
  h)
    usage && exit 0
    ;;
  \?)
    echo -e "\033[31mERROR: Unknown Argument! \033[0m\n" && usage && exit 1
    ;;
  esac
done

deploy
