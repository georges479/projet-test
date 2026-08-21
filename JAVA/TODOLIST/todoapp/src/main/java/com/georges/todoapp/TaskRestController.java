package com.georges.todoapp;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class TaskRestController {

    @GetMapping("/test")
    public String helloworld() {
        return "Hello World";
    }

}