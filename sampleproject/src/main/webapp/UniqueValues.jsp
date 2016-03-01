<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import="com.vk.model.RegisterModel"%>
     <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
     <%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
</script>
</head>
<body bgcolor="blue">
<div align="center">
<img src="http://textinchurch.com/wp-content/uploads/2015/08/Enter-Contact-Info2.jpg" alt="Enter info" width="300" height="142" title="Information">
<br/><h1><p style="color:red">Select job type</p></h1>
</div>
<div style="color:white" align="center">
<form method="post" action="unique.enter">
<table>

<tr>	<td>	<p>Job: 
		</td>
		<td>	<select id="se_job" name="job"><option value="Manager">Manager</option>
				<option value="asst.Manager">asst.Manager</option>
				<option value="Sr.employee">Sr.employee</option>
				<option value="jr.employee">jr.employee</option>
				<option value="cleark">cleark</option>
				</select>
		</td>	</p>
</tr>
<tr><td><input type="submit" value="submit"/></td></tr>
</table>
</form>
</div>
<table>
<c:forEach var="current" items="${login1.modelList}">
 <tr>
 	
          <td>${current.name}<td>
          <td><c:out value="${current.email}" /><td>
          <td><c:out value="${current.job}" /><td>
          <td><c:out value="${current.position}" /><td>
        </tr>
</c:forEach>
</table>
</body>
</html>