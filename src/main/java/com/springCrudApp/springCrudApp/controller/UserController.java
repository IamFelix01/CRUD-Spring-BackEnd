package com.springCrudApp.springCrudApp.controller;

import com.springCrudApp.springCrudApp.repository.UserRepository;
import com.springCrudApp.springCrudApp.model.User;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.*;

import org.springframework.core.annotation.Order;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@RestController
public class UserController {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    private final int id = 1;
    @GetMapping("/check-database-connection")
    public String checkDatabaseConnection() {
        try {
            jdbcTemplate.queryForObject("SELECT 1", Integer.class);
            return "Database connection is successful";
        } catch (Exception e) {
            return "Database connection failed: " + e.getMessage();
        }
    }
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
    //update function
    //delete function

    //Security


}
