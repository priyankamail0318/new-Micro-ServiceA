package com.appl.microserviceA.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class ServiceAController {

    @GetMapping(value = "/health")
    public ResponseEntity<String> healthCheck() {
        log.info("MicroserviceAApplication is Up and Running Successfully!");
        return ResponseEntity.status(HttpStatus.OK).body("New Service A service is Up and Running ...");
    }

    @GetMapping("/greet")
    public String greet() {
        log.info("MicroserviceAApplication A greet Method() is Called ... ");
        return "Hello from Service A!";
    }
}
