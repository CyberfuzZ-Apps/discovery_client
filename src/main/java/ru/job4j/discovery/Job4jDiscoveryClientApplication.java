package ru.job4j.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Job4jDiscoveryClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(Job4jDiscoveryClientApplication.class, args);
    }

}
