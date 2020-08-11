package com.staxter.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.staxter.domain.User;
import com.staxter.exception.UserAlreadyExistsException;
import com.staxter.userrepository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public User registerUser(User user) throws UserAlreadyExistsException {
		return userRepository.createUser(user);
	}
}
