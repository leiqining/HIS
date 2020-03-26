package com.neu.controller.userManagement;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.neu.po.User;
import com.neu.service.UserService;
import com.neu.service.impl.UserServiceImpl;


@WebServlet("/login.do")
public class UserLogin extends HttpServlet {
	private UserService userservice=new UserServiceImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username=req.getParameter("username");
		String password=req.getParameter("password");
		System.out.println(username+"====="+password);
		User user=userservice.login(username, password);
		//System.out.println(user+"... servlet");
		HttpSession session=req.getSession();
		session.setAttribute("user", user);
			System.out.println("准备主页面");
			req.getRequestDispatcher("index.jsp").forward(req, resp);
		
}
}
