package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.User;
import com.example.demo.filter.Myfilter;

@Controller
public class LoginController {

	
	/*@GetMapping("/login")
	@ResponseBody
	public String login(User user,HttpServletRequest request) {
		String msg="";
		System.out.println("user:"+user);
		List<User> list=new ArrayList();
		list.add(new User("user","user"));
		list.add(new User("admin","admin"));
		if((list.get(0).getUsername().equals(user.getUsername())&&list.get(0).getPassword().equals(user.getPassword()))||
				(list.get(1).getUsername().equals(user.getUsername())&&list.get(1).getPassword().equals(user.getPassword()))) {
			request.getSession().setAttribute(Myfilter.User_key, new User(user.getUsername(),user.getPassword()));
			msg="登陆成功";
			return "index";
		}else {
			msg="登陆失败";
			return "login";
		}
		
	}*/
	/*@GetMapping("logout")
	public String loginout(HttpServletRequest request) {
		request.getSession().setAttribute("user", null);
		
		
		return "index";
	}*/
	
	@GetMapping("/jiekou1")
	@ResponseBody
	public String jiekou1() {
		
		return "jiekou1";
	}
	@GetMapping("/jiekou2")
	@ResponseBody
	public String jiekou2() {
		
		return "jiekou2";
	}
	
}
