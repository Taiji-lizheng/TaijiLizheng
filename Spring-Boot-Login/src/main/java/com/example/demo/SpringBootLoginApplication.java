package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

import com.example.demo.filter.AccessFilter;
import com.example.demo.filter.HttpBasicAuthenticationFilter;
import com.example.demo.filter.LoginFilter;
import com.example.demo.filter.LogoutFilter;
import com.example.demo.filter.Myfilter;

@SpringBootApplication

public class SpringBootLoginApplication {

	@Bean
	public FilterRegistrationBean loginFilter() {
		FilterRegistrationBean registration = new FilterRegistrationBean();
		registration.setFilter(new LoginFilter());
		registration.addUrlPatterns("/login"); 
		registration.setName("loginFilter");
		registration.setOrder(1);
		return registration;

	}
	@Bean
	public FilterRegistrationBean logoutFilter() {
		FilterRegistrationBean registration = new FilterRegistrationBean();
		registration.setFilter(new LogoutFilter());
		registration.addUrlPatterns("/jiekou1","/jiekou2","/logout"); 
		registration.setName("logoutFilter");
		registration.setOrder(2);
		return registration;

	}
	@Bean
	public FilterRegistrationBean HttpBasicFilter() {
		FilterRegistrationBean registration = new FilterRegistrationBean();
		registration.setFilter(new HttpBasicAuthenticationFilter());
		registration.addUrlPatterns("/login"); 
		registration.setName("httpBasicFilter");
		registration.setOrder(3);
		return registration;

	}
	
	@Bean
	public FilterRegistrationBean myfilter() {
		
		FilterRegistrationBean registration = new FilterRegistrationBean();
		registration.addUrlPatterns("/jiekou1","/jiekou2"); 
		registration.setFilter(new Myfilter());
		registration.setName("MyFilter");
		registration.setOrder(4);
		return registration;
	}
 
	@Bean
	public FilterRegistrationBean accessFilter() {
		FilterRegistrationBean registration = new FilterRegistrationBean();
		registration.setFilter(new AccessFilter());
		registration.addUrlPatterns("/jiekou1","/jiekou2"); 
		registration.setName("AccessFilter");
		registration.setOrder(5);
		return registration;

	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootLoginApplication.class, args);
	}

}
