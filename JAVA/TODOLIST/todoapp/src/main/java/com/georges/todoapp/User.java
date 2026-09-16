package com.georges.todoapp;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;

/**
 *
 *
 */

@Entity 
public class User {

	@Id
	@GeneratedValue 
	private Long id;

	private String username;
	private String email;
	private String password;


	public User(String username, String email, String password) {
		this.username = username;
		this.email = email;
		this.password = password;
	}

	public User(){
	}

	public String getUsername() {
		return username;
	}

	@Override
	public String toString() {
		return "User [username: " + username + ", email: " + email + "]";
	}
}
