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
Books bk = BooksDAO.getBookById(id);
%>

<form action="deletebk.jsp" method="post">
<input type="hidden" name="id" value="<%= bk.getId() %>">
<table border="3px" style="margin: auto; padding: 10px; border-radius: 5px">
<tr>
<td>Book Name</td>
<td><input type="text" name="authorName" value="<%= bk.getAuthorName() %>" readonly="readonly">
</td>
</tr>
<tr>
<td>Author Name</td>
<td><input type="text" name="bookName" value="<%= bk.getBookName() %>" readonly="readonly"></td>
</tr>
<tr>
<td>Quantity</td>
<td><input type="text" name="quantity" value="<%= bk.getQuantity() %>" readonly="readonly"></td>
</tr>
<tr>
<td>Book Genere</td>
<td><input type="text" name="genere" value="<%= bk.getGenere() %>" readonly="readonly"></td>
</tr>
<tr>
<td></td>
<td><input type="submit" value="Delete"></td>
</tr>
</table>
</form>
</body>
</html>