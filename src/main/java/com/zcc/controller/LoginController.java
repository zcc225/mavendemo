package com.zcc.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.zcc.domain.User;
import com.zcc.service.IUserService;

@Controller
@RequestMapping("/front")
public class LoginController {

	@Resource 
    private IUserService userService;
	
	
	 @RequestMapping("/showlogin")
    public String showPersons(Model model){
        /*User user = userService.selectUserById(1);
        model.addAttribute("user", user);*/
        return "login";
    }
	 
	 @RequestMapping("/login")
	    public String  showPersons(HttpServletRequest request, HttpServletResponse response,Model model){
		 User user = new User();
		 user.setUserName(request.getParameter("username"));
		 model.addAttribute("user", user);
		 return "index";
	    }
	
}
