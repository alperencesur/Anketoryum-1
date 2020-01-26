package com.anket.Anketoryum.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anket.Anketoryum.dao.UserDao;
import com.anket.Anketoryum.model.User;

@Transactional
@Service
public class UserService {
	
	@Autowired
	UserDao userDao;
	
	@Autowired
	CommonService commonService;
	
	public String createUser(User user) {
		String registerDate = commonService.getDate();
		user.setRegisterDate(registerDate);
		return userDao.createUser(user);
	}


}
