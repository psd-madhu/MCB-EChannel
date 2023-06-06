package com.mcb.authentication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.mcb.authentication.model.User;
import com.mcb.authentication.repository.UserRepository;

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
		return userRepository.save(user);
	}
	
	@Override
	public List<User> findAll() {
		//user.setPassword(passwordEncoder.encode(user.getPassword()));
		return userRepository.findAll();
	}
	
	public String generateToken(String userName){
		return jwtService.generateToken(userName);
	}
	
	public void validateToken(final String token, User user){
		jwtService.validateToken(token, user);
	}

}
