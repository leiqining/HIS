<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<div>
			<table>
				<thead>
					<tr>
						<th></th>
						<th>ID</th>
						<th>登录名</th>
						<th>密码</th>
						<th>真实姓名</th>
						<th>用户类别</th>
						<th>医生职称id</th>
						<th>是否排班</th>
						<th>所在科室id</th>
						<th>挂号级别id</th>
						<th>删除标记</th>
						<th>操作</th>
					</tr>
				</thead>
				<tbody id="tbody">
					<c:forEach items="${userinfo}" var="info">
					<tr>
						<td></td>
						<td>${info.getId()}</td>
						<td>${info.getUserName()}</td>
						<td>${info.getPassword()}</td>
						<td>${info.getRealName()}</td>
						<td>${info.getUserType()}</td>
						<td>${info.getDocTitleID()}</td>
						<td>${info.getIsScheduling()}</td>
						<td>${info.getDeptID()}</td>
						<td>${info.getRegisLeID()}</td>
						<td>${info.getDelMark()}</td>
						<td></td>
					</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
	
	<script type="text/javascript" src="../js/jquery-3.4.1.min.js"></script>
	<script type="text/javascript">
	 window.onload = function(){
		 alert("000");
		// 鼠标移动改变背景,可以通过给每行绑定鼠标移上事件和鼠标移除事件来改变所在行背景色。     
		var tr=document.getElementsByTagName("tr");  
			for(var i=0;i<tr.length;i++){      
			tr[i].οnmοuseοver=function(){     
				this.style.backgroundColor="#f2f2f2";    
			}        
			tr[i].οnmοuseοut=function(){
				this.style.backgroundColor="#fff";      
			}      
		}
		 
		
	 }
	</script>
</body>
</html>