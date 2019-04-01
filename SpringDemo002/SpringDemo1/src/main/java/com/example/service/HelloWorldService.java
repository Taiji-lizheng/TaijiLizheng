package com.example.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Component(value="helloWorld")
//@Named("helloWorld")
//@Service 

public class HelloWorldService {

	public void sayHello() {
		
		System.out.println("hello!");
	}
}
