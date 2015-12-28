<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登陆错误</title>
<style type="text/css">
body {
	color: #000;
	front-size: 14px;
	margin: 20px
}
</style>
</head>
<body>
	<div id="message">
		登陆失败<br> 
		错误提示：
		<%
		Object obj=request.getAttribute("msg");
		if(obj!=null){
			out.println(obj.toString());
		}else{
			out.println("无错误");
		}
		%>
		<br>
		你提交的信息为:<br>	
		UserName:<%=request.getParameter("uname")%><br>
		PassWord:<%=request.getParameter("upwd")%><br> <a
			href="<%=request.getContextPath() %>/03/login.jsp">返回登陆</a>
	</div>

</body>
</html>