<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
	<div class="jumbotron" align="center" style="background-color:green">
  		<h1>Student Registration</h1>      
  		<p>Spring Assignment template for Student Registration</p> 
  	</div>
<table align="center">
	<form:form action="student-reg" method="post" modelAttribute="studentRegister">
		<tr><td>UserName: </td>
			<td><form:input path="userName"/></td>
			<td><form:errors path="userName" cssStyle="color:red"/></td>
		</tr>
		<tr><td>PassWord: </td>
			<td><form:input path="passWord"/></td>
			<td><form:errors path="passWord" cssStyle="color:red"/></td>
		</tr>
		<tr><td>Re Type PassWord: </td>
			<td><form:input path="reTypePassWord"/></td>
			<td></td>
		</tr>
		<tr><td>Student Id: </td>
			<td><form:input path="id"/></td>
			<td><form:errors path="id" cssStyle="color:red"/></td>
		</tr>
		<tr><td>FullName: </td>
			<td><form:input path="fullName"/></td>
			<td><form:errors path="fullName" cssStyle="color:red"/></td>
		</tr>
		<tr><td>Email: </td>
			<td><form:input path="email"/></td>
			<td><form:errors path="email" cssStyle="color:red"/></td>
		</tr>
		<tr><td>Phone: </td>
			<td><form:input path="phone"/></td>
			<td><form:errors path="phone" cssStyle="color:red"/></td>
		</tr>
		<tr><td></td>
			<td><input type="submit" value="submit"/></td>
			<td></td>
		</tr>
		</form:form>
</table>
</div>
</body>
</html>