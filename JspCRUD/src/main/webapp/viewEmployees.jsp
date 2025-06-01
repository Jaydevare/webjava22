<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*,com.app.bean.*,com.app.dao.*" %>
    <%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
List<Employee> list = EmployeeDao.getAllEmployee();
request.setAttribute("list", list);
%>

<table border="3px">
<tr>
<th>ID</th><th>Name</th><th>Email</th><th>Password</th><th>Gender</th><th>Country</th><th>Edit</th><th>Update</th>
</tr>
<c:forEach var="emp" items="${list }">
<tr>
<td>${emp.getId() }</td>
<td>${emp.getName() }</td>
<td>${emp.getEmail() }</td>
<td>${emp.getPassword()}</td>
<td>${emp.getGender()}</td>
<td>${emp.getCountry()}</td>
<td><a href="editStudent.jsp?id=${emp.getId()}">Edit</a></td>
<td><a href="deleteStudent.jsp?id=${emp.getId()}">Delete</a></td>
</tr>
</c:forEach>
</table>
</body>
</html>