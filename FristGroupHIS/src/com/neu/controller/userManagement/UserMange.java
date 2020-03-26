package com.neu.controller.userManagement;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSONArray;
import com.neu.po.User;
import com.neu.service.UserService;
import com.neu.service.impl.UserServiceImpl;
@WebServlet("/usermanage")
public class UserMange extends HttpServlet {
	private UserService service=new UserServiceImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("管理的后台");
		List<User> list=service.quryAllUser();
		String Json=JSONArray.toJSONString(list);
		System.out.println(Json);
		resp.setContentType("application/json;charset=utf-8");
		resp.getWriter().println(Json);
	}
}
