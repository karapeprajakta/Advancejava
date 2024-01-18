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
<table border="2">
<tr>
<th>PId</th>
<th>Pname</th>
<th>Price</th>
<th>Qty</th>
<th>Actions</th>
</tr>
<c:forEach var="p" items="${plist}">
<tr>
<td>${p.pid}</td>
<td>${p.pname}</td>
<td>${p.price}</td>
<td>${p.qty}</td>
<td><a href="editproduct/${p.pid}">Edit</a>|<a href="deleteproduct/${p.pid}">Delete</a></td>
</tr>
</c:forEach>
</table>
<a href="addnewproduct">Add New Product</a>
</body>
</html>