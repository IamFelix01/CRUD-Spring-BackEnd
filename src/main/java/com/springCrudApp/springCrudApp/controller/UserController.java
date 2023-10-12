package com.springCrudApp.springCrudApp.controller;

import com.springCrudApp.springCrudApp.repository.UserRepository;
import com.springCrudApp.springCrudApp.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private JdbcTemplate jdbcTemplate;
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

}
