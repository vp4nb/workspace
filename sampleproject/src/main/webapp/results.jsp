<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Employee Info</title>
</head>
<body bgcolor='blue'>
<div align="center">
<img src="http://textinchurch.com/wp-content/uploads/2015/08/Enter-Contact-Info2.jpg" alt="Enter info" width="300" height="142" title="Information">
<br/><h1><p style="color:red">Details</p></h1>
<jsp:useBean id="alist" class="com.vk.control.UniqueValueControl" scope="session"></jsp:useBean>
<jsp:getProperty property="al" name="alist"/>
<table>
<tr>
<th>fullname</th>
<th>email</th>
<th>job</th>
<th>position</th>
</tr>
<tr>

</tr>
</table>
</body>
</html>