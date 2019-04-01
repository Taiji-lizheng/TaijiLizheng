package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

	
	@RequestMapping("/Test1")
	@ResponseBody
	public String test(@RequestParam("name")String name) {
		
		return name;
	}
	
	@RequestMapping("/Test2/{age}")
	@ResponseBody
	public Integer test2(@PathVariable("id")Integer id) {
		
		return id;
	}
	
	@RequestMapping("/Test3/{num}")
	@ResponseBody
	public Integer test3(HttpServletRequest request) {
	
		return (Integer) request.getAttribute("num");
	}
}
