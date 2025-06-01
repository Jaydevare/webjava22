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
<jsp:useBean id="bk" class="com.app.entity.Books"></jsp:useBean>
<jsp:setProperty property="*" name="bk"/>
<%
int i = BooksDAO.updateBook(bk);
if(i>0)
{
	response.sendRedirect("viewBooks.jsp");
}
else
{
	out.write("Failed");
}

%>
</body>
</html>