package com.es.daily_report.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author sekfung
 * @date 2021/11/24
 */
@Controller
@RequestMapping
public class HealthController {

    @GetMapping(value="/health")
    public ResponseEntity health() {
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
