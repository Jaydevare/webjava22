<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.app.dao.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	int id  = Integer.parseInt(request.getParameter("id"));
	int i = EmployeeDao.deleteEmployee(id);
	if(i>0)
		response.sendRedirect("viewEmployees.jsp");
	else
		response.sendRedirect("error.jsp");
%>
</body>
</html>