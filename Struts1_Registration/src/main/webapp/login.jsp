<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
    <%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<body>
	<h1>Login Page</h1>
	<html:form action="login" method="post">
		<table>
			<tr>
				<td>Email</td>
				<td><html:text property="email"></html:text></td>
				<td><html:errors property="email_e" /></td>
				
			</tr>
			<tr>
				<td>Password</td>
				<td><html:password property="password"/></td>
				<td><html:errors property="password_e" /></td>
				
			</tr>
			<tr>
			<td></td>
				<td><html:submit property="submit"><bean:message key="login"/></html:submit> 
				<html:submit property="submit"><bean:message key="forgot"/></html:submit> 
				<html:submit property="submit"><bean:message key="register"/></html:submit></td>
				
			</tr>
		</table>
	</html:form>
</body>
</html>