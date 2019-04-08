package com.example.demo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.demo.bean.Emp;
import com.example.demo.util.GetRm;

@Service
public class SelectDemo1 {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public int selectCount() {
		int rowCount = this.jdbcTemplate.queryForObject("select count(*) from emp", Integer.class);

		System.out.println(rowCount);
		return rowCount;
	}

	public int selectCount2() {
		int countOfActorsNamedJoe = this.jdbcTemplate.queryForObject("select count(*) from emp where ename = ?",
				Integer.class, "lisa");
		System.out.println(countOfActorsNamedJoe);
		return countOfActorsNamedJoe;
	}

	public String selectEname() {

		String ename = this.jdbcTemplate.queryForObject("select ename from emp where id = ? and age= ?",
				new Object[] { 2, 22 }, String.class);
		return ename;
	}

	public Emp selectEmp() {

		Emp emp = this.jdbcTemplate.queryForObject("select * from emp where id = ? and age= ?", new Object[] { 2, 22 },
				new RowMapper<Emp>() {
					public Emp mapRow(ResultSet rs, int rowNum) throws SQLException {
						Emp emp = new Emp();
						emp.setEname(rs.getString("ename"));
						emp.setSal((rs.getDouble("sal")));
						emp.setHiredate((rs.getDate("hiredate")));
						emp.setDeptno((rs.getInt("deptno")));
						emp.setAge(rs.getInt("age"));
						emp.setId(rs.getInt("id"));
						return emp;
					}
				});

		return emp;
	}

	public List<Emp> selectEmps() {

		List<Emp> list = this.jdbcTemplate.query("select * from emp where age= ?", new Object[] { 22 },
				new RowMapper<Emp>() {
					public Emp mapRow(ResultSet rs, int rowNum) throws SQLException {
						Emp emp = new Emp();
						emp.setEname(rs.getString("ename"));
						emp.setSal((rs.getDouble("sal")));
						emp.setHiredate((rs.getDate("hiredate")));
						emp.setDeptno((rs.getInt("deptno")));
						emp.setAge(rs.getInt("age"));
						emp.setId(rs.getInt("id"));
						return emp;
					}
				});

		return list;
	}
	
	public List<Emp> selectEmps2() {
		
		List<Emp> list=this.jdbcTemplate.query(
				 "select * from emp where age= ?",
				 new Object[]{22},new GetRm()
				
				 );

		return list;
	}
	
	
	

}
