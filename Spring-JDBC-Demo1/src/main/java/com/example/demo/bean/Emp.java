package com.example.demo.bean;

import java.sql.Date;

public class Emp {
	
	private String ename;
	private Date hiredate;
	private Double sal;
	private Integer deptno;
	private Integer age;
	private Integer id;
	@Override
	public String toString() {
		return "Emp [ename=" + ename + ", hiredate=" + hiredate + ", sal=" + sal + ", deptno=" + deptno + ", age=" + age
				+ ", id=" + id + "]";
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Date getHiredate() {
		return hiredate;
	}
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	public Double getSal() {
		return sal;
	}
	public void setSal(Double sal) {
		this.sal = sal;
	}
	public Integer getDeptno() {
		return deptno;
	}
	public void setDeptno(Integer deptno) {
		this.deptno = deptno;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emp(String ename, Date hiredate, Double sal, Integer deptno, Integer age, Integer id) {
		super();
		this.ename = ename;
		this.hiredate = hiredate;
		this.sal = sal;
		this.deptno = deptno;
		this.age = age;
		this.id = id;
	}
	
	
}
