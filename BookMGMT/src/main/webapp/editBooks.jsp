<%@page import="com.app.entity.Books"%>
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
int id = Integer.parseInt(request.getParameter("id"));
Books b = BooksDAO.getBookById(id);
%>

<form action="editbk.jsp" method="post">
<input type="hidden" name="id" value="<%= b.getId() %>">
<table border="3px" style="margin: auto; padding: 10px; border-radius: 5px">
<tr>
<td>Author Name</td>
<td><input type="text" name="authorName" value="<%= b.getAuthorName() %>">
</td>
</tr>
<tr>
<td>Book Name</td>
<td><input type="text" name="bookName" value="<%= b.getBookName() %>"></td>
</tr>
<tr>
<td>Quantity</td>
<td><input type="text" name="quantity" value="<%= b.getQuantity() %>"></td>
</tr>
<tr>
<td>Book Genere</td>
<td><input type="text" name="genere" value="<%= b.getGenere() %>"></td>
</tr>
<tr>
<td></td>
<td><input type="submit" value="EDIT"></td>
</tr>
</table>
</form>
</body>
</html>