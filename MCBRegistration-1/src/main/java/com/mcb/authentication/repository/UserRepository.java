package com.mcb.authentication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mcb.authentication.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	
	//void save(User user);

}
