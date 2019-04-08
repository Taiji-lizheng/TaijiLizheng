package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import com.example.demo.dao.SelectDemo1;

@SpringBootApplication
public class SpringJdbcDemo1Application implements CommandLineRunner{
	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;	

	public static void main(String[] args) {
		SpringApplication.run(SpringJdbcDemo1Application.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		countOfActorsByFirstName("lisa");
	}
	public void countOfActorsByFirstName(String firstName) {
		String sql = "select count(*) from emp where ename = :first_name";
		SqlParameterSource namedParameters = new MapSqlParameterSource("first_name", firstName);
		System.out.println(this.namedParameterJdbcTemplate.queryForObject(sql, namedParameters, Integer.class));
	
	}
}
