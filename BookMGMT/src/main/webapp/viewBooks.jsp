<%@page import="com.app.dao.BooksDAO,com.app.entity.Books,java.util.*"%>
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
List<Books> list = BooksDAO.getAllBook();
request.setAttribute("list", list);
%>
<table border="3px">
<tr>
<th>ID</th>
<th>Author Name</th>
<th>Book Name</th>
<th>Quantity</th>
<th>Genere</th>
</tr>
<%
for(Books b:list)
{
%>
<tr>
<td><%= b.getId() %></td>
<td><%= b.getAuthorName() %></td>
<td><%= b.getBookName() %></td>
<td><%= b.getQuantity() %></td>
<td><%= b.getGenere() %></td>
<td ><a href="editBooks.jsp?id=<%= b.getId()%>">EDIT</a></td>
<td ><a href="deleteBooks.jsp?id=<%= b.getId()%>">DELETE</a></td>
</tr>
<%
}
%>
</table>
</body>
</html>