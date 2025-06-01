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
<body>
<div id="container">
<div id="content">
<input type="button" value="Add Customer" onclick="window.location.href='showFormForAdd'; return false;" class="add-button"/>
</div>
</div>
<table>
<tr>
<th>First Name</th>
<th>Last Name</th>
<th>Email</th>
<th>Action</th>
</tr>
<c:forEach var="tempCustomer" items="${customers }">
	<c:url var="updateLink" value="/customer/showFormForUpdate">
			<c:param name="customerId" value="${tempCustomer.id }"/>
	</c:url>
	 <c:url var="deleteCus" value="/customer/deleteCustomer">
			<c:param name="customerId" value="${tempCustomer.id }"/>
	</c:url>
	<tr>
	<td>${tempCustomer.firstName }</td>
	<td>${tempCustomer.lastName }</td>
	<td>${tempCustomer.email }</td>
	<td><a href="${updateLink }">update</a></td>
	 <td><a href="${deleteCus }">delete</a></td> 
	</tr>
</c:forEach>

</table> 
</body>
</body>
</html>