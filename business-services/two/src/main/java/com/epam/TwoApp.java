package com.epam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author khangndd
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class TwoApp {
    public static void main(String[] args) {
        SpringApplication.run(TwoApp.class, args);
    }
}