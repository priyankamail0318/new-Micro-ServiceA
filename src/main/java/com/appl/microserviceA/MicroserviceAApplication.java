package com.appl.microserviceA;


import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication(scanBasePackages = "com.appl.microserviceA")
@Slf4j
public class MicroserviceAApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        log.info("MicroserviceAApplication Started Successfully!");
        SpringApplication.run(MicroserviceAApplication.class, args);
    }
}
