package com.exemple.helpdesk.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.exemple.helpdesk.entity.User;
import com.exemple.helpdesk.security.jwt.JwtUserFactory;
import com.exemple.helpdesk.service.UserService;

public class JwtUserDetailsServiceImpl implements UserDetailsService {
	@Autowired
	private UserService userService;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	
		User user= userService.findByEmail(username);
		if(user==null) {
			throw new UsernameNotFoundException(String.format("No user found by %s",username));
		}else {
			return JwtUserFactory.create(user);
		}
	}

}
