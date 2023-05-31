package com.mcb.authenticationservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.mcb.authenticationservice.model.User;
import com.mcb.authenticationservice.repository.UserRepository;

//import io.jsonwebtoken.Jwts;

@Service
public class AuthenticationServiceImpl implements AuthenticationService{

	@Autowired
	private UserRepository userRepository;
//	@Autowired
//	private PasswordEncoder passwordEncoder;
	@Autowired
	private JwtService jwtService;
	
	@Override
	public void login(User user) {
		
	}

	@Override
	public User register(User user) {
		//user.setPassword(passwordEncoder.encode(user.getPassword()));
		return userRepository.saveAndFlush(user);
	}
	
	public String generateToken(String userName){
		return jwtService.generateToken(userName);
	}
	
	public void validateToken(final String token, User user){
		jwtService.validateToken(token, user);
	}

}
