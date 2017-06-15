<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h2>Employee Data</h2>
	<hr>

	<table border="1">
		<tr>
			<th>EMployee Id</th>
			<th>Employee Named</th>
			<th>Salary</th>
		</tr>

		<tr>
			<td>${requestScope.empData.empId}</td>
			<td>${requestScope.empData.empName}</td>
			<td>${requestScope.empData.salary}</td>

		</tr>


	</table>
	<hr />



	<c:forEach items="${myCities}" var="city" varStatus="ct">

			 ${ct.count} --> ${city} <br>

	</c:forEach>


	<hr />



	<table border="1">
		<tr>
			<th>EMployee Id</th>
			<th>Employee Named</th>
			<th>Salary</th>
		</tr>

		<c:forEach items="${requestScope.employees}" var="emp">

			<tr>
				<td>${emp.empId}</td>
				<td>${emp.empName}</td>
				<td>${emp.salary}</td>

			</tr>

		</c:forEach>


	</table>













</body>
</html>