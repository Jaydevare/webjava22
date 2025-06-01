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
<h1>Edit Employee</h1>
<hr>
<form action="editEmp.jsp" method="post">
<input type="hidden" name="id" value="<%= e.getId() %>">
<table border="3px">
<tr>
<td>Name:</td>
<td><input type="text" name="name" value="<%= e.getName() %>"></td>
</tr>
<tr>
<td>Email:</td>
<td><input type="email" name="email" value="<%= e.getEmail() %>"></td>
</tr>
<tr>
<td>Password:</td>
<td><input type="password" name="password" value="<%= e.getPassword() %>"></td>
</tr>
<tr>
<td>Gender:</td>
<td>
<% 
if(e.getGender().equals("male"))
{
%>
<input type="radio" name="gender" value="male" CHECKED>MALE
<%
}
else
{
%>
<input type="radio" name="gender" value="male">MALE
<%
}
%>

<% 
if(e.getGender().equals("fmale"))
{
%>
<input type="radio" name="gender" value="fmale" CHECKED>FEMALE
<%
}
else
{
%>
<input type="radio" name="gender" value="fmale">FEMALE
<%
}
%>
</td>
</tr>

<tr>
<td>Select Country</td>
<td>
<select name="country" >
<%
if(e.getCountry().equals("India"))
{%>
<option selected="selected">INDIA</option>
<%
}
else
{
%>
<option>INDIA</option>
<%
}
%>

<%
if(e.getCountry().equals("japan"))
{%>
<option selected="selected">JAPAN</option>
<%
}
else
{
%>
<option>JAPAN</option>
<%
}
%>

<%
if(e.getCountry().equals("France"))
{%>
<option selected="selected">France</option>
<%
}
else
{
%>
<option>France</option>
<%
}
%>

<%
if(e.getCountry().equals("germany"))
{%>
<option selected="selected">GERMANY</option>
<%
}
else
{
%>
<option>GERMANY</option>
<%
}
%>
<%
if(e.getCountry().equals("france"))
{%>
<option selected="selected">FRANCE</option>
<%
}
else
{
%>
<option>FRANCE</option>
<%
}
%>
<%
if(e.getCountry().equals("spain"))
{%>
<option selected="selected">SPAIN</option>
<%
}
else
{
%>
<option>SPAIN</option>
<%
}
%>
</select>
</td>
</tr>
<tr>
<td></td>
<td><input type="submit" value="Edit"></td>
</tr>

</table>
</form>
</body>
</html>