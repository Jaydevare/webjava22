<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1><center>Add Books to Library</center></h1>
<hr>
<center><a href="viewBooks.jsp">View-Books</a></center>
<form action="addbk.jsp" method="post">
<table border="3px" style="margin: auto; padding: 10px; border-radius: 5px">
<tr>
<td>Enter Book Name</td>
<td><input type="text" name="bookName">
</td>
</tr>
<tr>
<td>Enter Author Name</td>
<td><input type="text" name="authorName"></td>
</tr>
<tr>
<td>Enter Quantity</td>
<td><input type="text" name="quantity"></td>
</tr>
<tr>
<td>Book Genere</td>
<td><input type="text" name="genere"></td>
</tr>
<tr>
<td></td>
<td><input type="submit" value="ADD"></td>
</tr>
</table>
</form>
</body>
</html>