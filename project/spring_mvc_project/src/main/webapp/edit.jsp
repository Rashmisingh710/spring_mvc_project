<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>You are in edit page</title>
</head>
<body>
<form:form action="edit" modelAttribute="student">

<form:label path="id">Id:</form:label>
<form:input path="id" type="number" readonly="true"></form:input>

<form:label path="name">Name:</form:label>
<form:input path="name" type="text"></form:input>

<form:label path="phone">Phone:</form:label>
<form:input path="phone" type="text"></form:input>

<form:label path="email">Email:</form:label>
<form:input path="email" type="text"></form:input>

<form:label path="password">Password:</form:label>
<form:input path="password" type="text"></form:input>

<input type="submit" value="Submit">
</form:form>
</body>
</html>