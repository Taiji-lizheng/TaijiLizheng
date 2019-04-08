package com.example.demo.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
public class SelectDemo2 {

//	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
//
//	public void setDataSource(DataSource dataSource) {
//		this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
//	}
	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;	
	
	public int countOfActorsByFirstName(String firstName) {
		String sql = "select count(*) from emp where ename = :first_name";
		SqlParameterSource namedParameters = new MapSqlParameterSource("first_name", firstName);
		return this.namedParameterJdbcTemplate.queryForObject(sql, namedParameters, Integer.class);
	
	}

}
