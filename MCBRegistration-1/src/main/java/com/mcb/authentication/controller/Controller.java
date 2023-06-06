package com.mcb.authentication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mcb.authentication.model.User;
import com.mcb.authentication.service.AuthenticationService;

import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/user")
public class Controller {

	@Autowired
	private AuthenticationService authenticationService; 
	@PostMapping("/register")
	public User register(@RequestBody User user) {
		return authenticationService.register(user); 
	}
	
	@GetMapping("/all")
	public List<User> findAll() {
		return authenticationService.findAll(); 
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
