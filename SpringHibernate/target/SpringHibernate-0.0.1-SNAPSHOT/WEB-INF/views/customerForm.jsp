<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action="saveCustomer" modelAttribute="customer"
		method="post">
		<form:hidden path="id" />
		<table border="3px">
			<tbody>
				<tr>
					<td><label>First Name:</label></td>
					<td><form:input path="firstName" />
				</tr>
				<tr>
					<td><label>Last Name:</label></td>
					<td><form:input path="lastName" />
				</tr>
				<tr>
					<td><label> Email:</label></td>
					<td><form:input path="email" />
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value="SAVE" />
				</tr>
			</tbody>
		</table>
	</form:form>
</body>
</html>