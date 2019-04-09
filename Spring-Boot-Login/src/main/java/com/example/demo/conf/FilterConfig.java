package com.example.demo.conf;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.filter.AccessFilter;
import com.example.demo.filter.Myfilter;
/*@Configuration*/
public class FilterConfig {
	@Bean
	public FilterRegistrationBean testFilterRegistration() {
		
		FilterRegistrationBean registration = new FilterRegistrationBean(new Myfilter());
		registration.addUrlPatterns("/**"); 
		
		registration.setOrder(1);
		return registration;
	}
 
	@Bean
	public FilterRegistrationBean authFilterRegistration() {
		FilterRegistrationBean registration = new FilterRegistrationBean(new AccessFilter());
		registration.addUrlPatterns("/**"); 
		
		registration.setOrder(2);
		return registration;

	}
}
