package com.dbg.service.user;

import com.dbg.model.user.User;

public interface UserService {
	
	User findById(Integer userId);
	
	User findByName(String name);
	
}
