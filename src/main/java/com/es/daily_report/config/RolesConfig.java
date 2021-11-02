package com.es.daily_report.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
@Configuration
@ConfigurationProperties(prefix="roles")
public class RolesConfig {
    private List<String> pmos = new ArrayList<>();

    private Map<String, String> managers = new HashMap<>();  //staffnumber -> department
}
