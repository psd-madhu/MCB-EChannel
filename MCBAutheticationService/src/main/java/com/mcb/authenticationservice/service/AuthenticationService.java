package com.mcb.authenticationservice.service;

import org.springframework.stereotype.Service;

import com.mcb.authenticationservice.model.User;

@Service
public interface AuthenticationService {

	public void login(User user);
	public User register(User user);
	public String generateToken(String userName);
	public void validateToken(final String token, User user);
}
