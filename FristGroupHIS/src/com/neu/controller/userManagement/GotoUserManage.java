package com.neu.controller.userManagement;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neu.po.User;
import com.neu.service.UserService;
import com.neu.service.impl.UserServiceImpl;

@WebServlet("/gotousermanage.do")
public class GotoUserManage extends HttpServlet {
	private UserService service=new UserServiceImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("准备进入用户管理页面");
		List<User> list=service.quryAllUser();
		req.setAttribute("userinfo", list);
		req.getRequestDispatcher("WEB-INF/jsp/userContral.jsp").forward(req, resp);
	}
}
