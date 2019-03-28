package com.home.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.home.domain.User;
import com.home.service.impl.UserServiceImpl;

/*
 * 总控制器
 * */

@RequestMapping(value = "/controller")
public class AllController {
	
	@Autowired
	@Qualifier("userServiceImpl")
	private UserServiceImpl userServiceImpl;
	
	//用户控制区
	@RequestMapping("user/login")
	public String userLogin() {
        return "user/login";
    }
	
	@RequestMapping("user/view")
	public String userView() {
        return "user/showuser";
	}
     
	@RequestMapping("user/tosignin")
	public String toSignin() {
		return "user/signin";
	}
	
	 @RequestMapping(value = "/signin", method = RequestMethod.POST)
	 public ModelAndView signin(ModelAndView mav, HttpServletRequest request) {
		 String username = request.getParameter("username");
		 String password1 = request.getParameter("password1");
		 String password2 = request.getParameter("password2");
		 User user = new User();
		 if(userServiceImpl.findByUserName(username) != null) {
			 mav.addObject("username", username);
			 mav.setViewName("user/signin");
			 return mav;
		 } else if(!password1.equals(password2)){ 
			 mav.setViewName("user/signin");
			 return mav;
		 }else if(username == "" || password1 == "" || password2 == ""){
			 mav.setViewName("user/signin");
			 return mav;
		 }else { 
			 user.setUsername(request.getParameter("username"));
			 user.setPassword((request.getParameter("password1")));
			 userServiceImpl.insertUser(user);
			 mav.setViewName("user/login");
			 return mav;
		 }
		 
	 }
     @RequestMapping(value = "/login", method = RequestMethod.POST)
     public ModelAndView login(ModelAndView mav, HttpSession session, User user) {
         User user1 = userServiceImpl.findByUserName(user.getUsername());

         if (user == null || !user1.getPassword().equals(user.getPassword())) {
             return new ModelAndView("redirect:user/login.jsp");
         } else {
             session.setAttribute("user", user1);
             mav.setViewName("user/showuser");
             return mav;
         }
           
     }
     
     //跳转到requestjson页面
     @RequestMapping("tojson")
     public String toJson() {
    	 return "json/requestjson";
     }
     //请求json数据， 返回json数据
     @RequestMapping(value="/requestjson", method=RequestMethod.POST)
     public @ResponseBody User requestJson(@RequestBody User user){
    	 System.out.println("user");
    	 return user;
     }
     //请求pojo， 返回json数据
     @RequestMapping(value="/requestpojo", method=RequestMethod.POST)
     public @ResponseBody User requestPojo(User user) {
    	 return user;
     }
     
     
}
	


