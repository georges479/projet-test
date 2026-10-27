package com.georges.todoapp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * Class User
 *
 */

@Entity 
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long id;
	private String username;
	private String email;
	private String passwordHash;


	public User(String username, String email, String passwordHash) {
		this.username = username;
		this.email = email;
		this.passwordHash = passwordHash;
	}

	public User(){
	}

	public String getUsername() {
		return username;
	}

	public String getEmail() {
		return email;
	}

	public Long getId() {
		return id;
	}

	public String getPasswordHash() {
		return passwordHash;
	}

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

	@Override
	public String toString() {
		return "User [username: " + username + ", email: " + email + "]";
	}
}
