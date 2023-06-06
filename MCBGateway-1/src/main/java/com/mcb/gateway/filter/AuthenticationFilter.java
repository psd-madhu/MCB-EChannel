package com.mcb.gateway.filter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.mcb.gateway.util.JwtUtil;
import com.mcb.gateway.validator.RouteValidator;


@Component
@CrossOrigin(origins = "http://localhost:4200")
public class AuthenticationFilter extends AbstractGatewayFilterFactory<AuthenticationFilter.Config>{
	
	@Autowired
	private RouteValidator routeValidator;
	@Autowired
	private JwtUtil jwtUtil;
	
	public AuthenticationFilter() {
		super(Config.class);
	}
	public static class Config{
		
	}

	@Override
	public GatewayFilter apply(Config config) {
		// TODO Auto-generated method stub
		return ((exchange, chain) -> {
			if(routeValidator.isSecured.test(exchange.getRequest())) {
				if(!exchange.getRequest().getHeaders().containsKey(HttpHeaders.AUTHORIZATION))
					throw new RuntimeException("Missing Header in Authorization");
				
				String authHeader = exchange.getRequest().getHeaders().get(HttpHeaders.AUTHORIZATION).get(0);
				
				if(authHeader != null && authHeader.startsWith("Bearer "))
					authHeader = authHeader.substring(7);
				
				try {
					jwtUtil.validateToken(authHeader);
				}catch(Exception e) {
					throw new RuntimeException("Unauthorized Access");
				}
			}
			
			return chain.filter(exchange);
		});
	}

}
