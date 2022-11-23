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
	<div align="center">
		<h1>Login to SVB</h1>
		<s:form action="login">
			<s:textfield label="UserName" key="userId" />
			<s:password label="Password" key="password" />
			<s:submit />
		</s:form>
	</div>
</body>
</html>