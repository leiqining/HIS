package com.neu.controller.userManagement;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neu.service.UserService;
import com.neu.service.impl.UserServiceImpl;


@WebServlet("/gotoRegist.do")
public class GotoRegist extends HttpServlet{
	private UserService service=new UserServiceImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("准备进入注册页面");
		Map<Integer,String> map=new HashMap<>();
		map=service.queryDoctileID();//医生职称
		req.setAttribute("doctitlename",map);
		
		Map<Integer,String> mapDeptid=new HashMap<>();//科室
		mapDeptid=service.queryDeptid();
		req.setAttribute("deptid",mapDeptid);
		
		Map<Integer,String> mapRegistleid=new HashMap<>();//挂号级别
		mapRegistleid=service.queryRegistleid();
		req.setAttribute("registleid",mapRegistleid);
		req.getRequestDispatcher("WEB-INF/jsp/regist.jsp").forward(req, resp);
	}
}
