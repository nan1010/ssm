package com.home.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.home.dao.UserMapper;
import com.home.domain.User;
import com.home.service.UserService;
@Service
public class UserServiceImpl implements UserService{
	
	@Resource
	private UserMapper userMapper;
	@Override
	public User findByUsername(String username) {
		// TODO Auto-generated method stub
		User user = userMapper.findByUsername(username);
		return user;
	}

}
