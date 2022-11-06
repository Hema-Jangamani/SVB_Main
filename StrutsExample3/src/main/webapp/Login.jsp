<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="s" uri="/struts-tags"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
	<s:form action = "hello/login">
		<s:textfield label = "Login id" key="user.userId"/>
		<s:password label = "password" key="user.password"/>
		<s:submit/>
	</s:form>
</body>
</html>