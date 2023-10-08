package com.springCrudApp.springCrudApp.controller;

import com.springCrudApp.springCrudApp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/")
public class UserController {
    @Autowired
    public UserRepository userRepository;
    @GetMapping("/users")
    public String getAllUsers(){

        return "userRepository.findAll()";
    }
}
