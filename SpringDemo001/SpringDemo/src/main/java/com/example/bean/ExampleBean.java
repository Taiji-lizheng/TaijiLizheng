package com.example.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class ExampleBean implements InitializingBean,DisposableBean{
	private String school;
	private Integer snum;
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
		System.out.println("ExampleBean∆Ù”√");
		
	}
	
	public void stop() {
		
		System.out.println("ExampleBeanœ˙ªŸ");
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
