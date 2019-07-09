package com.test.jobportal.service;

import com.test.jobportal.pojo.Login;
import com.test.jobportal.pojo.User;

public interface UserService {

	User validateUser(Login login);
	void register(User user);
	
}
