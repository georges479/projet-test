package com.georges.todoapp;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.georges.todoapp.dto.UserCreateDto;

@RestController
public class UserRestController {

    private final UserService userService;

    public UserRestController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/users")
    public void subscribe(@RequestBody UserCreateDto userCreateDto) {
        userService.userRegister(userCreateDto);
    }
}