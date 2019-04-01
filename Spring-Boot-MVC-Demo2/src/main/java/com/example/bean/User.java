package com.example.bean;

import org.hibernate.validator.constraints.NotEmpty;

public class User {

	@NotEmpty
	private String username;
	private String password;
	private Integer age;
	private String Email;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", age=" + age + ", Email=" + Email + "]";
	}
	public User(String username, String password, Integer age, String email) {
		super();
		this.username = username;
		this.password = password;
		this.age = age;
		Email = email;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
