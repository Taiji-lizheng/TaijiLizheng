package com.example.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.example.bean.ExampleBean;
import com.example.bean.XmlBean;
import com.example.service.HelloWorldService;

public class Test1 {
	
	private AnnotationConfigApplicationContext context;
	
	@Before
	public void InitialContext() {
		
		context = new AnnotationConfigApplicationContext();
		context.scan("com.example");
		context.refresh();
		context.registerShutdownHook();
		
		int count = context.getBeanDefinitionCount();
		System.out.println("Beans注入个数： "+count);
		
		String[] names = context.getBeanDefinitionNames();
		
		for(String name : names) {
			
			System.out.println(name+"----->");
			Object bean= context.getBean(name);
			System.out.println(bean.getClass());
			
		}
		
	}
	
	@Test
	public void test1() {
		
		HelloWorldService helloWorldService=(HelloWorldService) context.getBean("helloWorld");
		helloWorldService.sayHello();
	}
	
	@Test
	public void test2() {
		
		ExampleBean exampleBean=(ExampleBean) context.getBean("exampleBean");
		/*exampleBean.setSchool("buu");
		exampleBean.setSnum(0321);
		xb.setAge(21);
		xb.setPname("小明");
		exampleBean.setXb(xb);*/
		System.out.println("学生学校："+exampleBean.getSchool());
		System.out.println("学生学号："+exampleBean.getSnum());
		System.out.println("学生姓名："+exampleBean.getXb().getPname());
		System.out.println("学生年龄："+exampleBean.getXb().getAge());
		
		
		
	}
	

	
}
