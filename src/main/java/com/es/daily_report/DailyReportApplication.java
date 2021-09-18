package com.es.daily_report;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.es.daily_report.mapper")
@ComponentScan("com.es.daily_report")
public class DailyReportApplication {
    public static void main(String[] args) {
        SpringApplication.run(DailyReportApplication.class, args);
    }
}
