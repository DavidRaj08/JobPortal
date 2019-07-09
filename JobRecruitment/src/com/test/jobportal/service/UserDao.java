package com.test.jobportal.service;

import com.test.jobportal.pojo.Login;
import com.test.jobportal.pojo.User;

public interface UserDao {
	
	void register(User user);

	User validateUser(Login login);
}
