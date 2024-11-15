
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> 
    <%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title><b>You are in view page</b></title>
</head>
<body>
<div style="text-align: center;">
  This text is centered horizontally.
</div>
<h1>View Page</h1>
<table border="2px" cellspacing="3px" cellpadding="10px">
<tr>
<th>ID</th>
<th>Name</th>
<th>Email</th>
<th>Password</th>
<th>Phone</th>
<th>Delete</th>
<th>Update</th>
</tr>
<c:forEach items="${std}" var="student">
<tr>
<td>${student.id}</td>
<td>${student.name}</td>
<td>${student.email}</td>
<td>${student.password}</td>
<td>${student.phone}</td>
<td><a href="delete?id=${student.id}">Delete</a></td>
<td><a href="update?id=${student.id}">Update</a></td>
</tr>
</c:forEach>
</table>
</body>
</html>