package com.zcc.test;


import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zcc.domain.Img;
import com.zcc.domain.User;
import com.zcc.service.IImgService;
import com.zcc.service.IUserService;
import com.zcc.service.impl.ImgServiceImpl;
@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类  
@ContextConfiguration(locations = {"classpath:mybatis-spring.xml"})
public class test {
	private static Logger logger = Logger.getLogger(test.class);  
	@Resource  
	private IUserService userService ;
	@Resource
	private IImgService iImgService;
	@Test
	public void test(){
		User user = userService.selectUserById(1);
		logger.info(user);
	}
	
	
	@Test
	public void test1(){
		Img img = iImgService.selectImg("1");
		logger.info(img);
	}
	

	
}
