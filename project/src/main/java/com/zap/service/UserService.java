package com.zap.service;

import com.zap.entity.User;

public interface UserService {
	
	User queryUserByUserId(int userId);
	
	User queryUserByUsername(String username);
		
	void addUser(User user);

}
