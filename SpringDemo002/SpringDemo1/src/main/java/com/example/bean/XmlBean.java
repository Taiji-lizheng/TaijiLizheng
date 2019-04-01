package com.example.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class XmlBean {
	@Value("小明")
	private String pname;
	@Value("21")
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
