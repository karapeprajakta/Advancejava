<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<table border='2'>
<tr>
<th> id</th>
<th> Name</th>
<th> Sal</th>
<th>Actions</th>

</tr>

<c:forEach var="t" items="${list}">
<tr>
<!-- it gives call to appropriate getter methods -->
<td>${t.id}</td> 
<td>${t.name}</td>
<td>${t.sal}</td>
<td><a href="editemp?id=${t.id}">Edit</a>
|<a href="deleteemp?id=${t.id}">Delete</a>

</tr>
</c:forEach>
</table>
<a href="addemp.jsp">Add</a>
</body>
</html>