package com.exemple.helpdesk.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.exemple.helpdesk.entity.User;

public interface UserRepositiry extends MongoRepository<User, String> {
	
   public User findByEmail(String email);

}
