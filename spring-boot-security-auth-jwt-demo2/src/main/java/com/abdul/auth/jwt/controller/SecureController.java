package com.abdul.auth.jwt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.abdul.auth.jwt.model.User;
import com.abdul.auth.jwt.service.UserService;

@RestController
@RequestMapping("/secure")
public class SecureController {

	@Autowired
	private UserService userService;

	@RequestMapping("/user/users")
	public String loginSuccess() {
		return "Login Successful!";
	}

	@RequestMapping(value = "/user/email", method = RequestMethod.POST)
	public User findByEmail(@RequestBody String email) {
		return userService.findByEmail(email);
	}

	@RequestMapping(value = "/user/update", method = RequestMethod.POST)
	public User updateUser(@RequestBody User user) {
		return userService.save(user);
	}
}
