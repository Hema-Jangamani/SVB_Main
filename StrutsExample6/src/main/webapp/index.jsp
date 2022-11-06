<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Hello World from Struts 3</h1>



	<!--<h1>Hello World From Struts2</h1>
    <form action="myspace/hello">
        <label for="name">Please enter your name</label><br />
        <input type="text" name="name" />
        <input type="submit" value="Say Hello" />
    </form>
        -->



	<s:form action="hello/hello">
		<s:textfield label="Enter a name" key="name" />
		<s:submit />
	</s:form>
</body>
</html>