<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登陆成功</title>
<style type="text/css">
body {
	color: #000;
	front-size: 14px;
	margin: 20px
}
</style>
</head>
<body>
	<div id="messenge">
		登陆成功<br> UserName:<%=request.getParameter("uname")%><br>
		提交的信息为：<br>
		PassWord:<%=request.getParameter("upwd")%><br> <a
			href="<%=request.getContextPath() %>/03/login.jsp">返回登陆</a>
	</div>

</body>
</html>