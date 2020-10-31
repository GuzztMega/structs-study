<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="/struts-tags" %>  
	
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Search Configuration</title>
	</head>
	
	<body>
	
		<c:form action="tutorials/getTutor">
			<c:textfield label="Language" key="language" />
			<c:submit />
		</c:form>
	
	</body>
</html>