package com.neu.po;

public class User {
	int id;//id
	String  userName;//登录名
	String password;//密码
	String realName;//正式姓名
	int userType;//用户类别
	int docTitleID;//以上职称id
	String isScheduling;//是否参与排班
	int deptID;//所在科室
	int regisLeID;//挂号级别
	int delMark;//删除标记
	public User(){}
	public User(String userName, String password, String realName, int userType, int docTitleID, String isScheduling,
			int deptID, int regisLeID) {
		super();
		this.userName = userName;
		this.password = password;
		this.realName = realName;
		this.userType = userType;
		this.docTitleID = docTitleID;
		this.isScheduling = isScheduling;
		this.deptID = deptID;
		this.regisLeID = regisLeID;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public int getUserType() {
		return userType;
	}
	public void setUserType(int userType) {
		this.userType = userType;
	}
	public int getDocTitleID() {
		return docTitleID;
	}
	public void setDocTitleID(int docTitleID) {
		this.docTitleID = docTitleID;
	}
	
	public String getIsScheduling() {
		return isScheduling;
	}
	public void setIsScheduling(String isScheduling) {
		this.isScheduling = isScheduling;
	}
	public int getDeptID() {
		return deptID;
	}
	public void setDeptID(int deptID) {
		this.deptID = deptID;
	}
	public int getRegisLeID() {
		return regisLeID;
	}
	public void setRegisLeID(int regisLeID) {
		this.regisLeID = regisLeID;
	}
	public int getDelMark() {
		return delMark;
	}
	public void setDelMark(int delMark) {
		this.delMark = delMark;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password=" + password + ", realName=" + realName
				+ ", userType=" + userType + ", docTitleID=" + docTitleID + ", isScheduling=" + isScheduling
				+ ", deptID=" + deptID + ", regisLeID=" + regisLeID + ", delMark=" + delMark + "]";
	}
	
}
