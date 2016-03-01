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

	UserName: <form:input path="UserName"/><form:errors path="UserName" cssStyle="color:red"/>
	PassWord: <form:input path="PassWord"/><form:errors path="PassWord" cssStyle="color:red"/>
</form:form>
</body>
</html>