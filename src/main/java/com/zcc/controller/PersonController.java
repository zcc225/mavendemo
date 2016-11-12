package com.zcc.controller;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.zcc.domain.User;
import com.zcc.service.IUserService;



@Controller
@RequestMapping("/main")
public class PersonController {
	@Resource 
    private IUserService userService;
    
	/**
	 * 显示对象
	 * @param model
	 * @return
	 */
    @RequestMapping("/front")
    public String showPersons(Model model){
        User user = userService.selectUserById(1);
        model.addAttribute("user", user);
        return "index";
    }
    
    /**
     * 显示列表
     * @param model
     * @return
     */
    @RequestMapping("/showUserlist")
    public String showUserList(Model model){
        List list = userService.selectAllUser();
        model.addAttribute("list", list);
        return "index";
    }
    
    /**
     * 显示图片
     * @param model
     * @return
     */
    @RequestMapping("/showUserlist")
    public String showImg(Model model){
        List list = userService.selectAllUser();
        model.addAttribute("list", list);
        return "index";
    }
    
   
   
}
