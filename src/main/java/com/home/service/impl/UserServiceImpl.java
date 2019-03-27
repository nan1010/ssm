package com.home.service.impl;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.home.dao.UserMapper;
import com.home.domain.User;
import com.home.service.UserService;
@Service("userServiceImpl")
public class UserServiceImpl implements UserService{
	
	@Autowired
    @Qualifier("userMapper")
	private UserMapper userMapper;
	@Override
	public User findByUserName(String username) {
		// TODO Auto-generated method stub
		User user = userMapper.findByUserName(username);
		return user;
	}

}
