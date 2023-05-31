package com.mcb.authenticationservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mcb.authenticationservice.model.User;
import com.mcb.authenticationservice.service.AuthenticationServiceImpl;

@RestController
@RequestMapping("/auth")
public class AuthenticationController {
	
	@Autowired(required=true)
	private AuthenticationServiceImpl authenticationService;
	
	@PostMapping("/register")
	public User register(@RequestBody User user){
		return authenticationService.register(user);
	}
	
	@GetMapping("/token")
	public String generateToken(@RequestParam("userName") String userName){
		return authenticationService.generateToken(userName);
	}
	
	@GetMapping("/validateToken")
	public void vaalidateToken(@RequestParam("token") String token, User user){
		authenticationService.validateToken(token, user);
	}
	

}
