<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
	#left-menu{
		width:20%;
		float:left;
	}
	#yemian{
	width:80%;
	float:right;
	
	}
	#iframe{
	width:800px;
	}
</style>
</head>
<body>
	<div id="zong">
		
		<div id="left-menu">
		<ul>
			<li><a href="" target="show">常熟类别管理</a></li>
			<li><a href="" target="show">科室管理</a></li>
			<li><a href="gotousermanage.do" target="show">用户管理</a></li>
			<li><a href="" target="show">挂号级别管理</a></li>
			<li><a href="" target="show">结算类别管理</a></li>
			<li><a href="" target="show">诊断目录管理</a></li>
			<li><a href="" target="show">非药品收费项目管理</a></li>
			<li><a href="" target="show">医生排班管理</a></li>
		</ul>
		</div>
		<div id="yemian">
		<iframe name="show" id="iframe"></iframe>
		</div>
	</div>
</body>
</html>