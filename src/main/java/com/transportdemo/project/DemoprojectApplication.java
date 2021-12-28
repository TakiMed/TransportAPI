package com.transportdemo.project;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoprojectApplication {
    final Logger log = LoggerFactory.getLogger(DemoprojectApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(DemoprojectApplication.class, args);
    }

}