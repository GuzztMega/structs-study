<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="/struts-tags" %>  

<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Login Page</title>
	</head>
	
	<body>
	
		<c:form action="login">
			<c:textfield label="Login ID: " key="userId"/>
			<c:password label="Password" key="password" />
			<c:submit />
		</c:form>
	
	</body>
</html>