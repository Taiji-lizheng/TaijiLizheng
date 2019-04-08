package com.example.demo.util;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.demo.bean.Emp;

public class GetRm implements RowMapper<Emp>{
	public  Emp mapRow(ResultSet rs, int rowNum) throws SQLException {
		Emp emp = new Emp();
       
		 emp.setEname(rs.getString("ename"));
		 emp.setSal((rs.getDouble("sal")));
		 emp.setHiredate((rs.getDate("hiredate")));
		 emp.setDeptno((rs.getInt("deptno")));
		 emp.setAge(rs.getInt("age"));
		 emp.setId(rs.getInt("id"));
        return emp;
    }
}
