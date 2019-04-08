package com.example.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UpdateDemo1 {

	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public int Reg(Object[] objs) {
		
		int Count=this.jdbcTemplate.update("insert into emp values(?,?,?,?,?,?)",objs);
		return Count;
	}
}
