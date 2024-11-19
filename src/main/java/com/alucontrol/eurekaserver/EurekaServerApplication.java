package com.alucontrol.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }

}


// Eureka Server acts as a "address book" for your microservices.
// It allows you to add or remove service instances
// without having to change URLs manually.
// Even in a development environment,
// it offers flexibility and a clear view of your microservices architecture.