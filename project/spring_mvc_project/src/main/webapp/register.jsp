<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome in this page</title>
</head>
<body style="background-color: lightblue;">

<form:form action="save" modelAttribute="student">
<form:label path="name">Name:</form:label>
<form:input path="name" type="text"></form:input>

<form:label path="phone">Phone:</form:label>
<form:input path="phone" type="text"></form:input>

<form:label path="email">Email:</form:label>
<form:input path="email" type="text"></form:input>

<form:label path="password">Password:</form:label>
<form:input path="password" type="text"></form:input>

<input type="submit" value="register">
</form:form>
</body>
</html>