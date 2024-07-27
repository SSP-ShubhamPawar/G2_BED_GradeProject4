package com.greatlearning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.greatlearning.entity.Role;
import com.greatlearning.entity.User;
import com.greatlearning.service.RoleService;
import com.greatlearning.service.UserService;

@RestController
public class UserRoleController {

	@Autowired
	RoleService roleservice;
	
	@Autowired
	UserService userservice;
	
	
	@PostMapping("/api/addRole")
	public String addRole(@RequestBody Role name) {

		roleservice.addRole(name);
		return "Role Added successfuly";
	}

	@PostMapping("/api/user")
	public String addUser(@RequestBody User user) {

		return userservice.addUSer(user);
		//return "Role Added successfuly";
	}
	
}
