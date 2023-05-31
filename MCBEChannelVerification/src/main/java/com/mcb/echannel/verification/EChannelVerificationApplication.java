package com.mcb.echannel.verification;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

@SpringBootApplication
//@EnableDiscoveryClient
public class EChannelVerificationApplication {

	public static void main(String[] args) {
		SpringApplication.run(EChannelVerificationApplication.class, args);
	}
	
//	@Bean
//	public CorsConfigurationSource corsConfigurationSource() {
//	    final CorsConfiguration config = new CorsConfiguration();
//
//	    config.setAllowedOrigins(Arrays.asList("http://localhost:4200"));
//	    config.setAllowedMethods(Arrays.asList("GET", "POST", "OPTIONS", "DELETE", "PUT", "PATCH"));
//	    config.setAllowCredentials(true);
//	    config.setAllowedHeaders(Arrays.asList("Authorization", "Cache-Control", "Content-Type"));
//
//	    final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//	    source.registerCorsConfiguration("/**", config);
//
//	    return source;
//	}

}
