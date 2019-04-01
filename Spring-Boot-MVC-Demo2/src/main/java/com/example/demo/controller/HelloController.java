package com.example.demo.controller;

import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.example.bean.User;

@Controller
public class HelloController {

	
	@RequestMapping("/index")
	public String index() {
		
		return "hello";
	}
	
	@RequestMapping("/sayhello")
	@ResponseBody
	public String hello() {
		
		
		return "hello";
			
	}
	@RequestMapping("login")
	public String login(User user) {
		
		return "login";
	}
	@RequestMapping("/loginuser")
	public String LoginUser(@ModelAttribute("user")User user) {
		
		/*model.addAttribute("username", user.getUsername());
		model.addAttribute("password", user.getPassword());*/
		return "success";
	}
	
	/*@GetMapping("/findByPage")
	public String findByPage(@RequestParam(requierd = true)) {
		Class<?> cls = int.class;
		System.out.println(cls.isPrimitive());
		System.out.println(pageNum);
		return "hello";
	}*/
	
	@PostMapping("/fileLoad")
	public String fileLoad(MultipartFile file) throws IllegalStateException, IOException {
		File uploadfile = new File("F://Java/"+file.getOriginalFilename());
		file.transferTo(uploadfile);
		return "success";
	}
}
