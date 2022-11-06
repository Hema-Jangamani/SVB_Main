<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
	<s:textfield label = "LoginID" key = "user.userId"/>
	<s:password label= "Password" key="user.password"/>
	<s:submit/>
</body>
</html>