package com.georges.todoapp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 *
 *
 */

@Entity 
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long id;

	private String username;
	private String email;
	private char[] password;


	public User(String username, String email, char[] password) {
		this.username = username;
		this.email = email;
		//this.password = password;
	}

	public User(){
	}

	public String getUsername() {
		return username;
	}

	public String getEmail() {
		return email;
	}



	@Override
	public String toString() {
		return "User [username: " + username + ", email: " + email + "]";
	}
}
