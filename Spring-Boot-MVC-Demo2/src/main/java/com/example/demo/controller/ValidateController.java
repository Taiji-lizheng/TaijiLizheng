package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.bean.User;

@Controller
@RequestMapping("/validator")
public class ValidateController {

	@GetMapping("/registry")
	public String index(@ModelAttribute("user") User user) {
		
		return "registry";
	}
	
	@GetMapping("/join")
	public String join(@Validated User user,BindingResult result,Model model) {
		System.out.println(user);
		if(!user.getEmail().contains(user.getUsername())) {
			FieldError error=new FieldError("user","email","邮箱未包含名字");
			result.addError(error);
		}
		if(result.hasErrors()) {
			System.out.println(model);
			return "registry";
		}
		return "success";
	}
	
}
