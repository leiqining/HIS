package com.neu.service;

import java.util.List;
import java.util.Map;

import com.neu.po.User;



public interface UserService {
	boolean registered(User user);
	User login(String uname,String upassword);
	List<User> quryAllUser();
	User quryOner(String username);
	boolean updateUserInfo(String password,String realname,int usertype,int doctitleID,String isScheduling,int deptID,int registleId);
	boolean deleatUser(int id);
	Map<Integer,String> queryDoctileID();//查询医生职称
	Map<Integer,String> queryDeptid();//查询所在科室
	Map<Integer,String> queryRegistleid();//查询挂号级别
}
