package com.example.test;

import java.lang.annotation.Annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.bean.ExampleBean;
import com.example.bean.XmlBean;
import com.example.service.HelloWorldService;

public class SampleMain {
	
/*	@Autowired
	public ExampleBean exampleBean;
	@Autowired
	public XmlBean xmlBean;
	@Autowired
	public HelloWorldService helloWorldService;
	*/
	public static void main(String[] args) {

		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.example");
		context.refresh();
		context.registerShutdownHook();
		
		
		int count = context.getBeanDefinitionCount();
		System.out.println("Beans的个数：" + count);
		String[] names = context.getBeanDefinitionNames();
		for (String name : names) {
			System.out.println(name+"--->");
			Object bean = context.getBean(name);
			System.out.println(bean.getClass());
		}
		
		
		context.getBean("helloWorld",HelloWorldService.class).sayHello();
		System.out.println(context.getBean(ExampleBean.class).getXb().getPname());
	}
}
