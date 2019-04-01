package com.example.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.bean.ExampleBean;
import com.example.bean.XmlBean;
import com.example.service.HelloWorldService;

public class SampleMain {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:META-INF/application-context.xml");
		XmlBean xb=(XmlBean) context.getBean("XmlBean");
		System.out.println(xb.getPname());
		System.out.println(xb.getAge());
		
		ExampleBean eb=(ExampleBean) context.getBean("Example");
		System.out.println(eb.getClass().getName());
		System.out.println("学生学校："+eb.getSchool());
		System.out.println("学生学号："+eb.getSnum());
		System.out.println("学生姓名："+eb.getXb().getPname());
		System.out.println("学生年龄："+eb.getXb().getAge());
		
		HelloWorldService service=(HelloWorldService) context.getBean("HelloWorldService");
		service.sayHello();
	}
}
