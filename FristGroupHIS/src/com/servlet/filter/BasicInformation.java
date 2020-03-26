package com.servlet.filter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.neu.service.UserService;
import com.neu.service.impl.UserServiceImpl;



@WebFilter(urlPatterns={"*"})
public class BasicInformation implements Filter{
	private UserService service=new UserServiceImpl();
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain arg2)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		//System.out.println("拦截");
		//设置请求为utf-8
		req.setCharacterEncoding("utf-8");
		HttpServletRequest reqq=(HttpServletRequest)req;
		
//		HttpSession session=reqq.getSession();
//		
//		
//		User user=(User) session.getAttribute("user");
//		System.out.println(user+".....user对象");
//		if(user==null||user.getUserName()==null){
//			System.out.println("session失效");
//			req.getRequestDispatcher("WEB-INF/jsp/login.jsp").forward(req, resp);
//		}
		arg2.doFilter(req, resp);
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
