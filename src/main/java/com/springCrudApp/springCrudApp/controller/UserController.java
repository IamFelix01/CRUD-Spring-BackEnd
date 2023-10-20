package com.springCrudApp.springCrudApp.controller;

import com.springCrudApp.springCrudApp.repository.UserRepository;
import com.springCrudApp.springCrudApp.model.User;

import org.apache.coyote.Request;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.*;

import org.springframework.core.annotation.Order;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class UserController {

    public String username;
    private final int id = 1;
    @Autowired
    public UserRepository userRepository;
    @GetMapping("/users")
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
    @GetMapping("/hello")
    public String Greetings() {
        return "Hello spring";
    }

    //insert function
    @RequestMapping("/resource")
    public Map<String,Object> home() {
        Map<String,Object> model = new HashMap<String,Object>();
        model.put("id", UUID.randomUUID().toString());
        model.put("content", "Hello World");
        return model;
    }
    @RequestMapping("/login")
    public User login(@RequestBody User user){

        return user;
    }
    //update function
    //delete function

    //Security


}
