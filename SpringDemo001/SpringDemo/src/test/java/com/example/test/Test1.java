package com.example.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.example.bean.ExampleBean;
import com.example.service.HelloWorldService;

public class Test1 {
	
	private AbstractApplicationContext context;
	
	public   Test1() {
		
		context = new FileSystemXmlApplicationContext("classpath:/META-INF/application-context.xml");
		context.registerShutdownHook();
	}
	
	@Test
	public void test1() {
		
		ExampleBean eb=(ExampleBean) context.getBean("Example");
		System.out.println("学生学校："+eb.getSchool());
		System.out.println("学生学号："+eb.getSnum());
		System.out.println("学生姓名："+eb.getXb().getPname());
		System.out.println("学生年龄:"+eb.getXb().getAge());
		
	}
	@Test
	public void test2() {
		
		HelloWorldService service=(HelloWorldService)context.getBean("HelloWorldService");
		service.sayHello();
	}

	
}
