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
<c:if test="${user==null}">
	<script type="text/javascript">
	window.location.href="gotologin.do";
	</script>
</c:if>
<c:if test="${user!=null}">
<%@ include file="WEB-INF/jsp/head.jsp" %>
<c:if test="${user.getUserType()==1}">
<!-- 显示管理员页面 -->
<%@ include file="WEB-INF/jsp/admin.jsp" %>
</c:if>
</c:if>
</body>
</html>