<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="updateemp" method="post">
Enter Id:<input type="text" name="id" value="${emp.id }" readonly><br><br>
Enter Name:<input type="text" name="name" value="${emp.name }"><br><br>
Enter Salary:<input type="text" name="sal" value="${emp.sal }"><br><br>
<input type="submit" value="Update Emp" >
</body>
</html>