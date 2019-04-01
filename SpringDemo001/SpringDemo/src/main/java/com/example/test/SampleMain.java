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
		System.out.println("ѧ��ѧУ��"+eb.getSchool());
		System.out.println("ѧ��ѧ�ţ�"+eb.getSnum());
		System.out.println("ѧ��������"+eb.getXb().getPname());
		System.out.println("ѧ�����䣺"+eb.getXb().getAge());
		
		HelloWorldService service=(HelloWorldService) context.getBean("HelloWorldService");
		service.sayHello();
	}
}
