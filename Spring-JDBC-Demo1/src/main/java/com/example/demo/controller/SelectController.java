package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.bean.Emp;
import com.example.demo.dao.SelectDemo1;
import com.example.demo.dao.SelectDemo2;

@Controller
public class SelectController {

	@Autowired
	private SelectDemo1 selectDemo1;
	@Autowired
	private SelectDemo2 selectDemo2;
	
	@RequestMapping("Select1")
	@ResponseBody
	public int selectCount() {
		int i=selectDemo1.selectCount();
		return i;
	}
	@RequestMapping("Select2")
	@ResponseBody
	public int selectCount2() {
		int i=selectDemo1.selectCount2();
		return i;
	}
	
	@RequestMapping("Select3")
	@ResponseBody
	public String selectEname() {
		String ename=selectDemo1.selectEname();
		return ename;
	}
	
	@RequestMapping("Select4")
	@ResponseBody
	public Emp selectEmp() {
		Emp emp=selectDemo1.selectEmp();
		return emp;
	}
	
	@RequestMapping("Select5")
	@ResponseBody
	public List<Emp> selectList() {
		List<Emp> list=selectDemo1.selectEmps();
		return list;
	}
	
	@RequestMapping("Select6")
	@ResponseBody
	public List<Emp> selectList2() {
		List<Emp> list=selectDemo1.selectEmps2();
		return list;
	}
	
	@RequestMapping("Select7")
	@ResponseBody
	public int selectCount3() {
		int count=selectDemo2.countOfActorsByFirstName("lisa");
		
		return count;
		
	}
	
	
}
