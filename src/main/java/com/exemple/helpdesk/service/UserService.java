package com.exemple.helpdesk.service;

import org.springframework.data.domain.Page;

import com.exemple.helpdesk.entity.User;

public interface UserService {
	
	public User findByEmail(String email) ;
	
	User createOrUpdate(User user);
	
	User findById(String id);
	
	void delete(User id);
	
	Page<User> findAll(int page,int count);

}
