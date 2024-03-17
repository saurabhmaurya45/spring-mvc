<%@page import="javax.security.auth.message.callback.PrivateKeyCallback.Request"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>
	<% String name = (String)request.getAttribute("name");%>
	<h1>this is home</h1>
	<h1>My name is <%=name %></h1>
</body>
</html>