<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="viewEmployees.jsp">View Employees</a>
<hr>
<form action="addEmp.jsp" method="post">
<table border="3px">
<tr>
<td>Enter Name</td>
<td><input type="text" name="name"></td>
</tr>
<tr>
<td>Enter Email</td>
<td><input type="email" name="email"></td>
</tr>
<tr>
<td>Enter Password</td>
<td><input type="password" name="password"></td>
</tr>
<tr>
<td>Select Gender</td>
<td>
<input type="radio" name="gender" value="male">MALE
<input type="radio" name="gender" value="fmale">FEMALE
</td>
</tr>
<tr>
<td>Select Country</td>
<td><select name="country">
<option value="india">INDIA</option>
<option value="japan">JAPAN</option>
<option value="germany">GERMANY</option>
<option value="france">FRANCE</option>
<option value="spain">SPAIN</option>
</select>
</td>
</tr>
<tr>
<td></td>
<td>
<input type="submit" value="SUBMIT">
</td>
</tr>
</table>
</form>
</body>
</html>