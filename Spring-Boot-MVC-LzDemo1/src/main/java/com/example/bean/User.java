package com.example.bean;

public class User {

	private String name;
	private Integer age;
	private Integer num;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", num=" + num + "]";
	}
	public User(String name, Integer age, Integer num) {
		super();
		this.name = name;
		this.age = age;
		this.num = num;
	}
		
	
}
