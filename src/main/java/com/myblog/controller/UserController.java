package com.myblog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.myblog.domain.User;
import com.myblog.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("list")
	public @ResponseBody List<User> list(){
		List<User> list = userService.findAllUser();
		return list;
		
	}
	

	@RequestMapping("/index")
	public String index(){
		System.out.println("666");
		return "index";
		
	}
}
