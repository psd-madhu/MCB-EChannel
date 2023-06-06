package com.mcb.gateway.validator;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.http.server.reactive.ServerHttpRequest;

import java.util.function.*;

@Component	
public class RouteValidator {
	
	public static final List<String> opeApiEndPoints = List.of(
			"/auth/register",
			"/auth/login",
			"/auth/token",
			"/eureka");
	
	public Predicate<ServerHttpRequest> isSecured = 
			request -> opeApiEndPoints
			.stream()
			.noneMatch(uri -> request.getURI().getPath().contains(uri));

}
