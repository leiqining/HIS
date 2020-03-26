<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<form action="regist.do" method="post">
		<table>
			<tr>
				<td>用户名</td>
				<td><input type="text" name="username"> </td>
			</tr>
			<tr>
				<td>密码</td>
				<td><input type="password" name="password"> </td>
			</tr>
			<tr>
				<td>真实姓名</td>
				<td><input type="text" name="realname"> </td>
			</tr>
			<tr> 
				<td>用户类别</td>
				<td>
				<select name="usertype">
					
					<option value="1">医院管理员</option>
					<option value="2">挂号收费员</option>
					<option value="3">门诊医生</option>
					<option value="4">医技医生</option>
					<option value="5">药房操作员</option>
					<option value="6">财务管理员</option>
					
				</select>
				</td>
			</tr>
			<tr>
				<td>医生职称</td>
				<td>
				<select name="doctitlleid">
					<c:forEach items="${doctitlename}" var="doc">
					<option value="${doc.key}">${doc.value}</option>
					</c:forEach>
					
				</select>
				</td>
			</tr>
			<tr>
				<td>是否参与排班</td>
				<td><input type="radio" name="isscheduling" value="是">是<input type="radio" name="isscheduling" value="否">否</td>
			</tr>
			<tr>
				<td>所在科室</td>
				<td><select name="deptid">
					<c:forEach items="${deptid}" var="doc">
					<option value="${doc.key}">${doc.value}</option>
					</c:forEach>
				</select>
				</td>
			</tr>
			<tr>
				<td>挂号级别</td>
				<td><select name="registleid">
					<c:forEach items="${registleid}" var="doc">
					<option value="${doc.key}">${doc.value}</option>
					</c:forEach>
				</select>
				</td>
			</tr>
			<tr>
				<td><input type="submit"> </td><td><input type="reset"></td>
			</tr>
		</table>
		</form>
	</div>
	
	<script type="text/javascript">
	
	</script>
</body>
</html>