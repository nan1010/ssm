package com.home.dao;

import org.springframework.stereotype.Repository;

import com.home.domain.User;
@Repository(value="userMapper")
public interface UserMapper {
    int deleteByPrimaryKey(Integer userid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

	User findByUserName(String username);
    
    
}