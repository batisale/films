package com.dbg.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbg.dao.user.UserDao;
import com.dbg.model.user.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	public User findById(Integer idUser) {
		return userDao.findOne(idUser);
	}

	@Override
	public User findByName(String name) {
		
		return userDao.findByName(name);
		
	}
	
	

}
