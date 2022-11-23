<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
    <%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
    
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Reset Password Page</title>
</head>
<body>
	<h1>Password Reset</h1>
	<html:form action="forgot">
		<table>
				<td>Email</td>
				<td><html:text property="email">User Name</html:text></td>
				<td><html:errors property="email_e" /></td>
			</tr>
			<tr>
				<td>New Password</td>
				<td><html:password property="newPassword">User Name</html:password></td>
				<td><html:errors property="newPassword_e" /></td>
			</tr>
			<tr>
				<td>Confirm Password</td>
				<td><html:password property="confirmPassword">User Name</html:password></td>
				<td><html:errors property="confirmPassword_e" />
				<html:errors property="missmatch_e" /></td>
				
			</tr>
			<tr>
				<td><html:submit value="Reset"/></td>
			</tr>
		</table>		
	</html:form>
</body>
</html>