package com.zcc.service.impl;


import java.util.List;

import javax.annotation.Resource;

import com.zcc.dao.UserMapper;
import com.zcc.domain.User;
import com.zcc.service.IUserService;

public class UserServiceImpl implements IUserService {
	@Resource
	private UserMapper userMapper;
	@Override
	public User selectUserById(int id) {
		User user = userMapper.selectByPrimaryKey(id);
		System.out.println("service 执行了");
		return user;
	}
	public UserMapper getUserMapper() {
		return userMapper;
	}
	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}
	@Override
	public List selectAllUser() {
		return userMapper.selectAllUser();
	}
	
	
	
}
