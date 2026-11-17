package com.alireza.springmicroonly;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringMicroOnlyApplication {

    static void main(String[] args) {
        SpringApplication.run(SpringMicroOnlyApplication.class, args);
    }

}
