package com.lessons.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class LoginIntercetor implements HandlerInterceptor {

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		System.out.println("preHandle login in");
		if ("/hello/login".equals(request.getServletPath()) || "/hello/join".equals(request.getServletPath())) {

			return true;
		} else if (StringUtils.isEmpty(request.getSession().getAttribute("username"))) {

			System.out.println(request.getServletPath());
			System.out.println(request.getContextPath());

			return false;
		} else {
			return false;

		}
	}

	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		System.out.println("LoginIntercetor afterCompletion comming");
	}

	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub
		System.out.println("LoginIntercetor postHandle  comming");
	}
}
