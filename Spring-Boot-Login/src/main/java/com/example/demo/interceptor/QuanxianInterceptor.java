package com.example.demo.interceptor;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import com.example.demo.bean.User;

public class QuanxianInterceptor implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		System.out.println("权限拦截器");
		
		HttpServletRequest req=(HttpServletRequest) request;
		User user=(User) req.getSession().getAttribute("user");
		
		

	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

}
