package com.mcb.authenticationservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class McbAuthenticationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(McbAuthenticationServiceApplication.class, args);
	}

}
