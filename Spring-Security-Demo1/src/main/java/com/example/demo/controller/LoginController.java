package com.example.demo.controller;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
	
	@GetMapping("/loginP")
	public String login() {
		
		return "/Login";
	}
	@GetMapping("/hello")
	public String hello() {
		
		return "/hello";
	}
	@GetMapping("/logoutSuccess")
	@ResponseBody
	public String logoutSuccess() {
		
		return "退出成功";
	}
	
}
