package com.example.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.bean.ExampleBean;
import com.example.config.SampleConfig;
import com.example.service.HelloWorldService;

public class JavaConfigTest {
	private AnnotationConfigApplicationContext context;

	@Before
	public void InitialContext() {
		context = new AnnotationConfigApplicationContext(SampleConfig.class);
		int count = context.getBeanDefinitionCount();

		String[] names = context.getBeanDefinitionNames();
		for (String name : names) {

			System.out.println(name + "----->");
			Object bean = context.getBean(name);
			System.out.println(bean.getClass());

		}

	}

	@Test
	public void testExampleBean() {

		System.out.println("学生姓名：" + context.getBean(ExampleBean.class).getXb().getPname());
		System.out.println("学生年龄：" + context.getBean(ExampleBean.class).getXb().getAge());
		context.getBean(HelloWorldService.class).sayHello();
	}

}
