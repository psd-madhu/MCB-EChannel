package com.mcb.authentication.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mcb.authentication.model.User;

@Service
public interface AuthenticationService {

	public void login(User user);
	public User register(User user);
	public List<User> findAll();
	public String generateToken(String userName);
	public void validateToken(final String token, User user);
}
