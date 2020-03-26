package com.neu.service.impl;

import java.util.List;
import java.util.Map;

import com.neu.dao.UserDao;
import com.neu.dao.impl.UserDaoImpl;
import com.neu.po.User;
import com.neu.service.UserService;



public class UserServiceImpl implements UserService{
	private UserDao dao=new UserDaoImpl();
	@Override
	public boolean registered(User user) {
		// TODO Auto-generated method stub
		return dao.registered(user);
	}

	@Override
	public User login(String uname, String upassword) {
		// TODO Auto-generated method stub
		return dao.login(uname, upassword);
	}

	@Override
	public List<User> quryAllUser() {
		// TODO Auto-generated method stub
		return dao.quryAllUser();
	}

	@Override
	public User quryOner(String username) {
		// TODO Auto-generated method stub
		return dao.quryOner(username);
	}

	@Override
	public boolean updateUserInfo(String password, String realname, int usertype, int doctitleID, String isScheduling,
			int deptID, int registleId) {
		// TODO Auto-generated method stub
		return dao.updateUserInfo(password, realname, usertype, doctitleID, isScheduling, deptID, registleId);
	}

	@Override
	public boolean deleatUser(int id) {
		// TODO Auto-generated method stub
		return dao.deleatUser(id);
	}

	@Override
	public Map<Integer,String> queryDoctileID() {
		// TODO Auto-generated method stub
		return dao.queryDoctileID();
	}

	@Override
	public Map<Integer, String> queryDeptid() {
		// TODO Auto-generated method stub
		return dao.queryDeptid();
	}

	@Override
	public Map<Integer, String> queryRegistleid() {
		// TODO Auto-generated method stub
		return dao.queryRegistleid();
	}

}
