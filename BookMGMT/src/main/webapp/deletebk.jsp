<%@page import="com.app.dao.BooksDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
 	int id  = Integer.parseInt(request.getParameter("id"));
	int i = BooksDAO.deleteBook(id);
	if(i>0)
	{
		out.write("Book Deleted Succesfully");
		request.getRequestDispatcher("viewBooks.jsp").include(request, response);
	}
	else
	{
		out.write("Failed to Delete!!!!");
	}
%>
</body>
</html>