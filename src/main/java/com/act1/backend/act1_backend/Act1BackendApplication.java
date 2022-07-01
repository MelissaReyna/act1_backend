package com.act1.backend.act1_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Act1BackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(Act1BackendApplication.class, args);
    }

}
