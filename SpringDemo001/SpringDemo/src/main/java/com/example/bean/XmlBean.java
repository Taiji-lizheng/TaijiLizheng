package com.example.bean;

public class XmlBean {

	private String pname;
	private Integer age;
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "XmlBean [pname=" + pname + ", age=" + age + "]";
	}
	
	
}
