package com.neu.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.neu.dao.UserDao;
import com.neu.po.User;

import tool.DBUtil;

public class UserDaoImpl implements UserDao {

	@Override
	public boolean registered(User user) {
		// TODO Auto-generated method stub
		boolean res = false;
		int num=0;
		Connection con=DBUtil.getSqlConnection();
		PreparedStatement state=null;
		try {
			state=con.prepareStatement("insert into user values(0,?,?,?,?,?,?,?,?,1)");
			state.setString(1, user.getUserName());
			state.setString(2, user.getPassword());
			state.setString(3, user.getRealName());
			state.setInt(4, user.getUserType());
			state.setInt(5, user.getDocTitleID());
			state.setString(6, user.getIsScheduling());
			state.setInt(7, user.getDeptID());
			state.setInt(8, user.getRegisLeID());
			num=state.executeUpdate();
			if(num>0){
				res=true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			DBUtil.closeSqlSource(con,state);
		}
		return res;
	}

	@Override
	public User login(String uname, String upassword) {
		// TODO Auto-generated method stub
		boolean res = false;
		Connection con=DBUtil.getSqlConnection();
		PreparedStatement state=null;
		ResultSet rs=null;
		User user=new User();
		try {
			state=con.prepareStatement("select * from user where username=? and password=?");
			state.setString(1, uname);
			state.setString(2, upassword);
			rs=state.executeQuery();
			while(rs.next()){
				user.setId(rs.getInt("id"));
				user.setUserName(rs.getString("username"));
				user.setPassword(rs.getString("password"));
				user.setRealName(rs.getString("realname"));
				user.setUserType(rs.getInt("usetype"));
				user.setDocTitleID(rs.getInt("doctitleid"));
				user.setIsScheduling(rs.getString("isscheduling"));
				user.setDeptID(rs.getInt("deptid"));
				user.setRegisLeID(rs.getInt("registleid"));
				user.setDelMark(rs.getInt("delmark"));
				//System.out.println(user+"dao");
				res=true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtil.closeSqlSource(con,state,rs);
		}
		return user;
	}

	@Override
	public List<User> quryAllUser() {
		// TODO Auto-generated method stub
		List<User> list=new ArrayList<User>();
		Connection con=DBUtil.getSqlConnection();
		PreparedStatement state=null;
		ResultSet rs=null;
		try {
			state=con.prepareStatement("select * from user");
			rs=state.executeQuery();
			while(rs.next()){
				User user=new User();
				user.setId(rs.getInt("id"));
				user.setUserName(rs.getString("username"));
				user.setPassword(rs.getString("password"));
				user.setRealName(rs.getString("realname"));
				user.setUserType(rs.getInt("usetype"));
				user.setDocTitleID(rs.getInt("doctitleid"));
				user.setIsScheduling(rs.getString("isscheduling"));
				user.setDeptID(rs.getInt("deptid"));
				user.setRegisLeID(rs.getInt("registleid"));
				user.setDelMark(rs.getInt("delmark"));
				list.add(user);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtil.closeSqlSource(con,state,rs);
		}
		return list;
	}
	@Override
	public User quryOner(String username) {
		// TODO Auto-generated method stub
		User user = null;
		Connection con=DBUtil.getSqlConnection();
		PreparedStatement state=null;
		ResultSet rs=null;
		try {
			state=con.prepareStatement("select * from user where username=?");
			state.setString(1, username);
			rs=state.executeQuery();
			while(rs.next()){
				user=new User();
				user.setId(rs.getInt("id"));
				user.setUserName(rs.getString("username"));
				user.setPassword(rs.getString("password"));
				user.setRealName(rs.getString("realname"));
				user.setUserType(rs.getInt("usetype"));
				user.setDocTitleID(rs.getInt("doctitleid"));
				user.setIsScheduling(rs.getString("isscheduling"));
				user.setDeptID(rs.getInt("deptid"));
				user.setRegisLeID(rs.getInt("registleid"));
				user.setDelMark(rs.getInt("delmark"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtil.closeSqlSource(con,state,rs);
		}
		return user;
	}

	@Override
	public boolean updateUserInfo(String password,String realname,int usertype,int doctitleID,String isScheduling,int deptID,int registleId) {
		// TODO Auto-generated method stub
		boolean res=false;
		
		Connection con=DBUtil.getSqlConnection();
		PreparedStatement state=null;
		try {
			state=con.prepareStatement("update user set password=?,realname=?,usertype=?,doctitleID=?,isScheduling=?,deptID=?,registleId=?");
			state.setString(1, password);
			state.setString(2, realname);
			state.setInt(3, usertype);
			state.setInt(4, doctitleID);
			state.setString(5, isScheduling);
			state.setInt(6, deptID);
			state.setInt(7, registleId);
			res=state.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtil.closeSqlSource(con,state);
		}
		return res;
	}

	
	@Override
	public boolean deleatUser(int id) {
		// TODO Auto-generated method stub
		boolean res=false;
		
		Connection con=DBUtil.getSqlConnection();
		PreparedStatement state=null;
		try {
			state=con.prepareStatement("update user set delmark=0 where id=?");
			state.setInt(1, id);
			res=state.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtil.closeSqlSource(con,state);
		}
		return res;
	}

	@Override
	public Map<Integer,String> queryDoctileID() {
		// TODO Auto-generated method stub
		Map<Integer,String> map=new HashMap<Integer, String>();
		//List<Map<Integer,String>> list=new ArrayList<>();
		Connection con=DBUtil.getSqlConnection();
		PreparedStatement state=null;
		ResultSet rs=null;
		try {
			state=con.prepareStatement("select * from constantitem where constanttypeid=8 and delmark=1");
			rs=state.executeQuery();
			while(rs.next()){
				int id=rs.getInt("id");
				String zw=rs.getString("constantname");
				//Map<Integer,String> map=new HashMap<Integer, String>();
				map.put(id, zw);
				//list.add(map);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtil.closeSqlSource(con,state,rs);
		}
		return map;
	}

	@Override
	public Map<Integer, String> queryDeptid() {//所在科室
		// TODO Auto-generated method stub
		Map<Integer,String> map=new HashMap<Integer, String>();
		//List<Map<Integer,String>> list=new ArrayList<>();
		Connection con=DBUtil.getSqlConnection();
		PreparedStatement state=null;
		ResultSet rs=null;
		try {
			state=con.prepareStatement("select * from department ");
			rs=state.executeQuery();
			while(rs.next()){
				int id=rs.getInt("id");
				String zw=rs.getString("deptname");
				//Map<Integer,String> map=new HashMap<Integer, String>();
				map.put(id, zw);
				//list.add(map);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtil.closeSqlSource(con,state,rs);
		}
		return map;
	}

	@Override
	public Map<Integer, String> queryRegistleid() {//挂号级别
		// TODO Auto-generated method stub
		Map<Integer,String> map=new HashMap<Integer, String>();
		//List<Map<Integer,String>> list=new ArrayList<>();
		Connection con=DBUtil.getSqlConnection();
		PreparedStatement state=null;
		ResultSet rs=null;
		try {
			state=con.prepareStatement("select * from registlevel ");
			rs=state.executeQuery();
			while(rs.next()){
				int id=rs.getInt("id");
				String zw=rs.getString("registname");
				//Map<Integer,String> map=new HashMap<Integer, String>();
				map.put(id, zw);
				//list.add(map);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtil.closeSqlSource(con,state,rs);
		}
		return map;
	}

	
	

}
