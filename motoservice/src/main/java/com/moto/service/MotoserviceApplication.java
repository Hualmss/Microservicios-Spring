package com.moto.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MotoserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MotoserviceApplication.class, args);
	}

}
