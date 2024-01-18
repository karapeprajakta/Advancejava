<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="insertproduct" method="post">
Pid:<input type="text" name="pid" id="pid" ><br>
Pname:<input type="text" name="pname" id="pname"><br>
Quantity:<input type="text" name="qty" id="qty"><br>
Price:<input type="text" name="price" id="price"><br>
<input type="submit" value="AddNewProduct">
</form>
</body>
</html>