package com.mcb.serviceregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class McbServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(McbServiceRegistryApplication.class, args);
	}

}
