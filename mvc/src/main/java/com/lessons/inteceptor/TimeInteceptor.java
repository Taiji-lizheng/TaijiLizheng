package com.lessons.inteceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;

public class TimeInteceptor implements HandlerInterceptor{

	private Long startTime;
	
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("time preHandle comming");
		startTime=System.currentTimeMillis();
		LocaleChangeInterceptor lr = new LocaleChangeInterceptor();
		lr.setParamName("lang");
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(handler.getClass().getName());
	}

	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		System.out.println("time afterCompletion comming");
		long endTime = System.currentTimeMillis();
		System.out.println(endTime-startTime);
	}

}
