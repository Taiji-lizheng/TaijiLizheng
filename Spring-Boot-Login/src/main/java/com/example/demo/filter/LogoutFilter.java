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

public class LogoutFilter implements Filter {
	private static Logger logger = LoggerFactory.getLogger(Myfilter.class);

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		logger.info("访问到了Logout过滤器，dofilter");
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse rep = (HttpServletResponse) response;
		HttpSession session = req.getSession();
		System.out.println(session.getAttribute(new Myfilter().User_key));
		if (req.getServletPath().equals("/logout")) {
			if (session != null && session.getAttribute(new Myfilter().User_key) != null) {
				logger.info("正在删除session对象");
				session.removeAttribute(new Myfilter().User_key);
				response.setCharacterEncoding("UTF-8");
				response.setContentType("text/html;charset=utf-8");
				response.getWriter().println("已退出");
				return;
			} else {
				
				response.getWriter().println("未登录");
				return;
			}
		}
		chain.doFilter(request, response);
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

}
