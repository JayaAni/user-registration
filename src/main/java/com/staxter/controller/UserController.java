package com.staxter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.staxter.domain.User;
import com.staxter.exception.UserAlreadyExistsException;
import com.staxter.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/userservice/register")
	public User registerUser(@RequestBody User user) throws UserAlreadyExistsException {
		return userService.registerUser(user);
	}

}
