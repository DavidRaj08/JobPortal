package com.test.jobportal.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.test.jobportal.dao.UserDao;
import com.test.jobportal.pojo.Login;
import com.test.jobportal.pojo.User;

public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userDao;
	
	@Override
	public User validateUser(Login login) {
		User user = userDao.validateUser(login);
		return user;
	}

	@Override
	public void register(User user) {
		userDao.register(user);

	}

}
