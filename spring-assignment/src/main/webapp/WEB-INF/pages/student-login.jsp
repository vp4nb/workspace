<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student login</title>
</head>
<body>
<form:form method="post" action="student-login" modelAttribute="studentLogin">
	UserName: <form:input path="userName"/><form:errors path="userName" cssStyle="color:red"/>
	PassWord: <form:input path="passWord"/><form:errors path="passWord" cssStyle="color:red"/>
	<input type="submit" value="submit"/>
</form:form>
</body>
</html>