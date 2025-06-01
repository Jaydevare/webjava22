<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div id="container">
		<h3>SaveCustomer</h3>
		<form:form action="saveStudents" modelAttribute="students"
			method="POST">
			<form:hidden path="id" />
			<table>
				<tbody>
					<tr>
						<td><label>First Name:</label></td>
						<td><form:input path="firstname" />
					</tr>
					<tr>
						<td><label>Last Name:</label></td>
						<td><form:input path="lastname" />
					</tr>
					<tr>
						<td><label> Sub1:</label></td>
						<td><form:input path="m1"/>
					</tr>
					<tr>
						<td><label> Sub2:</label></td>
						<td><form:input path="m2"/>
					</tr>
					<tr>
						<td><label> Sub3:</label></td>
						<td><form:input path="m3"/>
					</tr>
					<tr>
						<td></td>
						<td><input type="submit" value="Save"/>
					</tr>
				</tbody>
			</table>
		</form:form>
	</div>
</body>
</html>