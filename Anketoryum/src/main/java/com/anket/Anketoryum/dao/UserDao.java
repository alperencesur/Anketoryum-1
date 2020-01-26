package com.anket.Anketoryum.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.anket.Anketoryum.model.User;
import com.anket.Anketoryum.repository.UserRepository;

@Component
public class UserDao {
	@Autowired
	public UserRepository repository;
	
	public String createUser(User user) {
		repository.createUser(user.getUsername(),user.getEmail(), user.getRegisterDate(), user.getPassword(), user.getGender(), user.getPlace(), user.getAge());
		return "Succesfull";
	}

}
