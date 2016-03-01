<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="container">
	<div class="jumbotron" align="center" style="background-color:green">
  		<h1>Student Login</h1>      
  		<p>Spring Assignment template for Student Login</p> 
  	</div>
	<form:form action="student-log" method="post" modelAttribute="studentLogin">
		<table align="center">
		<tr> <td>UserName: </td>
			<td><form:input path="userName"/></td>
			<td><form:errors path="userName" cssStyle="color:red"/></td>
		</tr>
		<tr> <td>PassWord: </td>
			 <td><form:input path="passWord"/></td>
			 <td><form:errors path="passWord" cssStyle="color:red"/></td>
		</tr>
		<tr><td></td>
			<td><input type="submit" value="submit"/></td>
			<td></td>
		</tr>
	</table>
	</form:form>
	</div>
</body>
</html>