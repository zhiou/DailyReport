FROM registry-dev.excelsecu.com/library/openjdk:11-slim
ADD ./build/libs/daily_report.jar /opt/daily_report/

ENTRYPOINT ["java", "-jar", "/opt/daily_report/daily_report.jar"]