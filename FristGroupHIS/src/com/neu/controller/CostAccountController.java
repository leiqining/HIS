package com.neu.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neu.po.CostAccount;
import com.neu.service.CostAccountService;
import com.neu.service.serviceimpl.CostAccountServiceImpl;
@WebServlet("/CostAccount")
public class CostAccountController extends HttpServlet{
	private CostAccountService costAccountService=new CostAccountServiceImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.setCharacterEncoding("utf-8");
		String mark=req.getParameter("mark");
		if("query".equals(mark)){
			insert(req,resp);
		}
		
	}
	public void insert(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("id"));
		String ExpCode=req.getParameter("ExpCode");
		String ExpName=req.getParameter("ExpName");
		CostAccount costAccount=new CostAccount(id, ExpCode, ExpName);
		boolean res=costAccountService.insertCostAccount(costAccount);
	}
	
}
