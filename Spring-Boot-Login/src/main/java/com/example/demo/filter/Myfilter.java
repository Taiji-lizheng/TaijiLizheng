package com.example.demo.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.example.demo.bean.User;

public class Myfilter implements Filter {

	public static final String User_key="user";
	private static Logger logger=LoggerFactory.getLogger(Myfilter.class);
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		logger.info("Init");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		logger.info("访问到了过滤器，dofilter");
		HttpServletRequest req=(HttpServletRequest) request;
		HttpServletResponse rep=(HttpServletResponse) response;
		HttpSession session=req.getSession();
		System.out.println(session.getAttribute(User_key));
		if (session!=null && session.getAttribute(User_key)!=null) {
			chain.doFilter(request, response);
		} else {
			//request.getRequestDispatcher("/login").forward(request, response);
			response.setCharacterEncoding("UTF-8");
			response.setContentType("text/html;charset=utf-8");
			response.getWriter().println("未登录");
		}
		

	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		logger.info("destroy");

	}

}
