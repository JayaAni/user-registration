package com.staxter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.staxter.domain.User;
import com.staxter.service.UserService;

@SpringBootApplication
public class UserRegistrationApplication implements CommandLineRunner{

	@Autowired
	private UserService userservice;
	public static void main(String[] args) {
		SpringApplication.run(UserRegistrationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(userservice.registerUser(new User(null,"Srini","Mudunuri","123","1233","12345")));
	}

}
