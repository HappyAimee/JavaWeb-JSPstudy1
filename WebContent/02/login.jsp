<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>login</title>
</head>
<body>
登陆页面<br/>
session 的唯一标识符：<%= session.getId() %><br/>
session 的创建时间：<%= new java.util.Date(session.getCreationTime()).toString() %><br/>

</body>
</html>