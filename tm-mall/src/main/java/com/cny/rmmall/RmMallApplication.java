package com.cny.rmmall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class RmMallApplication {

    public static void main(String[] args) {
        SpringApplication.run(RmMallApplication.class, args);
    }

}
