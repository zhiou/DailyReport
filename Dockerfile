FROM registry-dev.excelsecu.com/library/openjdk:8
ENV TZ=Asia/Shanghai \
    DEBIAN_FRONTEND=noninteractive

RUN ln -fs /usr/share/zoneinfo/${TZ} /etc/localtime \
    && echo ${TZ} > /etc/timezone

ADD ./build/libs/daily_report.jar /opt/daily_report/

ENTRYPOINT ["java", "-jar", "/opt/daily_report/daily_report.jar"]