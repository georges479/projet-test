package com.georges.todoapp;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.georges.todoapp.dto.UserCreateDto;
/**
 *
 *
 */

@Service
public class UserService {

	private final UserRepository repository;
	private final PasswordEncoder passwordEncoder;

	public UserService(UserRepository repository, PasswordEncoder passwordEncoder) {
		this.repository = repository;
		this.passwordEncoder = passwordEncoder;
	}

	private User toEntity(UserCreateDto userCreateDto) {
		User user = new User();
		user.setUsername(userCreateDto.getUsername());
		user.setEmail(userCreateDto.getEmail());
		user.setPasswordHash(passwordEncoder.encode(userCreateDto.getPassword()));
		return user;
	}

	public void userRegister(UserCreateDto userCreateDto) {
		User user = toEntity(userCreateDto);
		repository.save(user);
	}

	public void userLogin() {

	}
}
