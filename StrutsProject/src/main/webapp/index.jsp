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
<h1>Welcome to Business World</h1>
<h4>Find Restaurents</h4>
<s:form action = "findrestaurents">
		<s:submit/>
		</s:form>
<h4>Find Hospitals</h4>
<s:form action = "findhospitals">
		<s:submit/>
		</s:form>

<h4>Find Theaters</h4>
<s:form action = "findmovieTheaters">
		<s:submit/>
		</s:form>

</body>
</html>