package com.example.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ExampleBean implements InitializingBean,DisposableBean{
	@Value("buu")
	private String school;
	@Value("0321")
	private Integer snum;
	@Autowired
	private XmlBean xb;
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public Integer getSnum() {
		return snum;
	}
	public void setSnum(Integer snum) {
		this.snum = snum;
	}
	public XmlBean getXb() {
		return xb;
	}
	public void setXb(XmlBean xb) {
		this.xb = xb;
	}
	@Override
	public String toString() {
		return "ExampleBean [school=" + school + ", snum=" + snum + ", xb=" + xb + "]";
	}
	
	public void start() {
		System.out.println("ExampleBean启动了");
		
	}
	
	public void stop() {
		
		System.out.println("ExampleBean销毁了");
	}
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("ExampleBean  Destroy");
	}
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("ExampleBean  AfterPropertiesSet");
	}
	
	
}
