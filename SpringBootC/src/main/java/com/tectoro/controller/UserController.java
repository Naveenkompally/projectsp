package com.tectoro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tectoro.model.User;
import com.tectoro.service.UserService;

@RestController
public class UserController 
{
	@Autowired
	private UserService service;
	@PostMapping("/add")
public User addUser(@RequestBody User user) {
	return service.createUser(user);
}
	@PostMapping("/addAll")
	public List<User> addUsers(@RequestBody List<User> users){
	return	service.createUsers(users);
	}
	@GetMapping("/user/{id}")
	public  User getUserById(@PathVariable int id) {
		return service.getUsersbyId(id);
	}
	public List<User> getAllUsers(){
	return service.getUsers();	
	}
	@PutMapping("/updateuser")
	public User updateUser(User user) {
		return service.updateUser(user);
	}
	@DeleteMapping("/user/{id}")
	public String deleteUser(@PathVariable int id)
	{
		return service.deleteUserById(id);
	}
}
