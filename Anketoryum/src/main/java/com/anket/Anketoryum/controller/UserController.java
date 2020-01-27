package com.anket.Anketoryum.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.anket.Anketoryum.Presenter;
import com.anket.Anketoryum.model.User;
import com.anket.Anketoryum.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public Presenter registerUser(@RequestBody User user) {
		try {
			return new Presenter(200, "Success", userService.createUser(user));
		}
		catch(Exception e) {
			return new Presenter(400, e.getMessage(), null);
		}
	}
}
