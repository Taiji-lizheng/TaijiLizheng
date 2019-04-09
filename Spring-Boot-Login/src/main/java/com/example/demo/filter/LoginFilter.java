package com.example.demo.filter;

import java.io.IOException;
import java.util.HashMap;

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
import com.example.demo.mock.Mock;

public class LoginFilter implements Filter {
	private static Logger logger = LoggerFactory.getLogger(HttpBasicAuthenticationFilter.class);

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		logger.info("访问到了过滤器LoginFilter，doFilter");
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse rep = (HttpServletResponse) response;
		HttpSession session = req.getSession();
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		if (session != null && session.getAttribute(new Myfilter().User_key) != null) {
			response.getWriter().println("已登陆");
			return;
		} else {
			if(Mock.userList.contains(new HashMap() {{
	            put(req.getParameter("username"), req.getParameter("password"));
	        }})) {
			session.setAttribute(Mock.User_Key,new User(req.getParameter("username"), req.getParameter("password")));
			
			System.out.println("session:::" +session.getAttribute(Mock.User_Key));
			response.getWriter().println("登陆成功");
			return;
			}else {
				response.getWriter().println("登陆失败，用户名、密码不符");
			}
		}

	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

}
