package com.lessons.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@RequestMapping(value="/hello")
@SessionAttributes("username")
public class HelloController {
	@GetMapping("/index")
	public String index() {
		
		return "hello";
	}
	
	/*@GetMapping("/findOne")
	public String findOne(User user) {
		
		System.out.println(user.getName());
		System.out.println(user.getAge());
		
		return "hello";
		
	}*/
	
	/*@GetMapping("/findOne/{id}/{age}")*/
	
	/*@GetMapping("/findOne/{id}")
	public String findOne(@PathVariable("id")String id) {
		
		System.out.println(id);
		
		return "hello";
		
	}*/
	
	/*@GetMapping("/findOne/{id}")
	public String findOne(HttpServletRequest request) {
		
		System.out.println(request.getParameter("id"));
		System.out.println(request.getParameterMap());
		
		return "hello";
		
	}*/
	
	/*@GetMapping("/findOne/{id}")
	public String findOne(Model model) {
		
		model.addAttribute("name","lizheng");
		return "hello";
		
	}*/
	
	@GetMapping("/findOne")
	public String findOne(@ModelAttribute("name") String name) {
		System.out.println(name);
		
		return "hello";
		
	}
	
	@GetMapping("Login")
	public String login(@RequestParam("name") String name) {
		
		
		System.out.println(name);
		return "login";
		
	}
	@GetMapping("Join")
	public String join(@ModelAttribute("name")String name,Model model) {
		model.addAttribute("username", name);
		return "join";
	}
	
	@PostMapping("/add")
	public String add(User user,Model model) {
		
		model.addAttribute("username", user.getName());
		System.out.println(user.getName());
		return "hello";
		
	}
	
}
