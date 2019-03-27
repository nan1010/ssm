package com.home.service;

import com.home.domain.User;

public interface UserService {
	public abstract User findByUserName(String username);
}
