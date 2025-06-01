<%@ page import="com.app.dao.*" %>
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
 int id = BooksDAO.saveBook(bk);

if(id>0)
{
	out.write("Book Entered Succesfully");
	request.getRequestDispatcher("addBooks.jsp").include(request, response);
}
else
{
	out.write("Book Entery unsuccesfull");
	request.getRequestDispatcher("addBooks.jsp").include(request, response);
}

%>
</body>
</html>