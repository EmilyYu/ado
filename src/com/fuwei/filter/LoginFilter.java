package com.fuwei.filter;

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

import com.fuwei.entity.FWUser;

public class LoginFilter implements Filter {

	public void destroy() {

	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest servletRequest = (HttpServletRequest) request;
		HttpServletResponse servletResponse = (HttpServletResponse) response;
		HttpSession session = servletRequest.getSession();

		// 获得用户请求的URI
		String path = servletRequest.getRequestURI();
		// System.out.println(path);

		// 从session里取员工工号信息
		FWUser user = (FWUser) session.getAttribute("user");

		/*
		 * 创建类Constants.java，里面写的是无需过滤的页面 for (int i = 0; i <
		 * Constants.NoFilter_Pages.length; i++) {
		 * 
		 * if (path.indexOf(Constants.NoFilter_Pages[i]) > -1) {
		 * chain.doFilter(servletRequest, servletResponse); return; } }
		 */

		// 登陆页面无需过滤
		if (path.indexOf("/FuweiSampleSystem/login.jsp") > -1) {
		//if (path.indexOf("/login.jsp") > -1) {
			chain.doFilter(servletRequest, servletResponse);
			return;
		}
		

		// 判断如果没有取到员工信息,就跳转到登陆页面
		if (user == null ) {
			// 跳转到登陆页面
			servletResponse.sendRedirect("/FuweiSampleSystem/login.jsp");
			//servletResponse.sendRedirect("/login.jsp");
		} else {
			// 已经登陆,继续此次请求
			chain.doFilter(request, response);
		}
	}

	public void init(FilterConfig arg0) throws ServletException {

	}

}
