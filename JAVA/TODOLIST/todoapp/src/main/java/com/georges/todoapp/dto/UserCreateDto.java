package com.georges.todoapp.dto;

import jakarta.validation.constraints.Size;

public class UserCreateDto {
    private String username;
    private String email;
    @Size(min = 8, max = 20)
    private String password;

    public String getUsername() {return username;}

    public String getEmail() {return email;}

    public String getPassword() {return password;}
}