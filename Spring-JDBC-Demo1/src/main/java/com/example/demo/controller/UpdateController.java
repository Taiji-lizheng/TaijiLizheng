package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.bean.Emp;
import com.example.demo.dao.UpdateDemo1;

@Controller
public class UpdateController {

	
	@Autowired
	private UpdateDemo1 updateDemo1;
	
	@RequestMapping("Reg")
	@ResponseBody
	public String reg(Emp emp) {
		Object[] objs= {emp.getEname(),emp.getHiredate(),emp.getSal(),emp.getDeptno(),emp.getAge(),emp.getId()};
		updateDemo1.Reg(objs);
		return "注册成功";
	}
	
	
	
}
