	<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	    pageEncoding="ISO-8859-1" import="com.app.dao.*,com.app.bean.*,java.util.*"%>
	<!DOCTYPE html>
	<html>
	<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
	</head>
	<body>
	<%
	int id = Integer.parseInt(request.getParameter("id"));
	Employee e = EmployeeDao.getEmployeeId(id);
	%>
	<form action="deletEmp.jsp" method="post">
	<table border="3px">
	<tr>
	<td>ID of Employee</td>
	<td><input type="text" name="id" value="<%= e.getId() %>"></td>
	</tr> 
	<tr>
	<td></td>
	<td><input type="submit" value="Delete"></td>
	</tr>
	</table>
	</form>
	</body>
	</html>