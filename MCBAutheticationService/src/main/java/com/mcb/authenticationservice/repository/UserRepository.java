package com.mcb.authenticationservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mcb.authenticationservice.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	
	//void save(User user);

}
