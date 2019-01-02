package com.exemple.helpdesk.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.exemple.helpdesk.entity.User;
import com.exemple.helpdesk.repository.UserRepositiry;
import com.exemple.helpdesk.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepositiry userRepository;

	@Override
	public User findByEmail(String email) {
		return userRepository.findByEmail(email);
	}

	@Override
	public User createOrUpdate(User user) {
		return userRepository.save(user);
	}

	@Override
	public User findById(String id) {
		return userRepository.findById(id).orElse(new User());
	}

	@Override
	public void delete(User id) {
		userRepository.delete(id);
	}

	@Override
	public Page<User> findAll(int page, int count) {

		Pageable pages = new PageRequest(page, count);
		return this.userRepository.findAll(pages);

	}

}
