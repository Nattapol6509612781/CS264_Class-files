package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.model.user;
import com.example.demo.repo.UserRepository;

@RestController
@RequestMapping("/api/users")
public class UserController {
		
 @Autowired
 private UserRepository userRepository;
 @GetMapping
 public List<user> getAllUsers() {
 return userRepository.findAll();
	 }
 @PostMapping
 public user createUser(@RequestBody user user) {
 return userRepository.save(user);
 }
	 
}
