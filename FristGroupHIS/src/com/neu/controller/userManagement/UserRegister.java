package com.neu.controller.userManagement;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neu.po.User;
import com.neu.service.UserService;
import com.neu.service.impl.UserServiceImpl;

@WebServlet("/regist.do")
public class UserRegister extends HttpServlet {
	private UserService userservice=new UserServiceImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		boolean res=false;
		String username=req.getParameter("username");
		String password=req.getParameter("password");
		String realname=req.getParameter("realname");
		int usertype=Integer.parseInt(req.getParameter("usertype"));
		int doctitleid=Integer.parseInt(req.getParameter("doctitlleid"));
		String isscheduling =req.getParameter("isscheduling");
		int deptid=Integer.parseInt(req.getParameter("deptid"));
		int registleid=Integer.parseInt(req.getParameter("registleid"));
		System.out.println(username+"==="+password+"==="+realname+"==="+usertype+"==="+doctitleid+"==="+isscheduling+"==="+deptid+"==="+registleid+";;;");
		User user=new User(username, password, realname, usertype, doctitleid, isscheduling, deptid, registleid);
		res=userservice.registered(user);
		System.out.println(res);
		if(res){
			System.out.println("准备跳登录");
			req.getRequestDispatcher("WEB-INF/jsp/login.jsp").forward(req, resp);
		}
		//发生错误，service处理，查找数据库有无刚才的不完整数据，有则删除
		
	}
}
