package com.zcc.service;

import java.util.List;

import com.zcc.domain.User;

public interface IUserService {

	User selectUserById(int id);
	
	List selectAllUser();
}
