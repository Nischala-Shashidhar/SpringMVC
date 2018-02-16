<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<html>
<head>
<meta http-equiv="Content-Type"
content="text/html; charset=ISO-8859-1">
<title>User Details</title>
</head>
<body>
First Name: <c:out value="${user.firstName}" /><br>
Last Name: <c:out value="${user.secondName}" /> <br>
Contact Number: <c:out value="${user.contactNumber}"></c:out>
</body>
</html>
