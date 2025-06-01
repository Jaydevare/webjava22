<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="jakarta.tags.core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link type=""text/css"
		rel="stylesheet"
		href="&{pageContext.request.ContextPath}/resources/css/style.css"/>
</head>
<body>
<div id="container">
<div id="content">
<input type="button" value="Add Customer" onclick="window.location.href='showFormForAdd'; return false;" class="add-button"/>
</div>
</div>
<table border="2">
<tr>
<th>First Name</th>
<th>Last Name</th>
<th>Sub1</th>
<th>Sub2</th>
<th>Sub3</th>
<th>Total</th>
<th>Percentage</th>
<th>Action</th>
</tr>
<c:forEach var="tempStudent" items="${students }">
	<c:url var="updateLink" value="/abc/showFormForUpdate">
			<c:param name="studentId" value="${tempStudent.id }"/>
	</c:url>
	 <c:url var="deleteStu" value="/abc/deleteStudent">
			<c:param name="studentId" value="${tempStudent.id }"/>
	</c:url>
	<tr>
	<td>${tempStudent.firstname }</td>
	<td>${tempStudent.lastname }</td>
	<td>${tempStudent.m1 }</td>
	<td>${tempStudent.m2 }</td>
	<td>${tempStudent.m3 }</td>
	<td>${tempStudent.total} </td>
	<td>${tempStudent.percentage }</td>
	<td><a href="${updateLink }">update</a></td>
	 <td><a href="${deleteStu }">delete</a></td> 
	</tr>
</c:forEach>

</table> 
</body>
</html>