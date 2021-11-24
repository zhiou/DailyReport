#!/bin/bash
./gradlew clean && ./gradlew bootJar

if [ "$?" -ne 0 ]; then
  echo -e "\033[31mERROR: Compile Failed! \033[0m\n"
  exit 1
else
  echo -e "\033[32mCompile Successful! \033[0m\n"
fi

docker build -t registry-dev.excelsecu.com/daily_report/manager:latest .
if [ "$?" -ne 0 ]; then
  echo -e "\033[31mERROR: Build Docker Image Failed! \033[0m\n"
  exit 1
else
  echo -e "\033[32mBuild Docker Image Successful! \033[0m\n"
fi

docker push registry-dev.excelsecu.com/daily_report/manager:latest
if [ "$?" -ne 0 ]; then
  echo -e "\033[31mERROR: Push Latest Docker Image Failed! \033[0m\n"
  exit 1
else
  echo -e "\033[32mPush Latest Docker Image Successful! \033[0m\n"
fi

cd ./deploy || exit
helm upgrade manager . -n dailyreport
if [ "$?" -ne 0 ]; then
  echo -e "\033[31mERROR: Upgrade Manager Failed! \033[0m\n"
  exit 1
else
  echo -e "\033[32mUpgrade Manager Successful! \033[0m\n"
fi

