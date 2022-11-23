<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
    <%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
    
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Page</title>
</head>
<body>
	<h1>Registration Form</h1>
	<html:form action="reg" method="post">
		<table>
			<tr>
				<td>First Name</td>
				<td><html:text property="firstName">User Name</html:text></td>
				<td><html:errors property="firstName_e" /></td>
			</tr>
			<tr>
				<td>Last Name</td>
				<td><html:text property="lastName">User Name</html:text></td>
				<td><html:errors property="lastName_e" /></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><html:text property="email">User Name</html:text></td>
				<td><html:errors property="emailPhone_e" /></td>
				<td><html:errors property="email_e" /></td>
			</tr>
			<tr>
				<td>Phone</td>
				<td><html:text property="phone">User Name</html:text></td>
				<td><html:errors property="phone_e" /></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><html:password property="password">User Name</html:password></td>
				<td><html:errors property="password_e" /></td>
			</tr>
			<tr>
				<td><html:submit value="SUBMIT"/></td>
			</tr>
		</table>		
	</html:form>
</body>
</html>