package com.zcc.dao;


import java.util.List;

import com.zcc.domain.User;
public interface UserMapper {
	
	int selecttest(Integer id);
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
    List selectAllUser();
}