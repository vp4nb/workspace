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
<br/><h1><p style="color:red">Enter Details</p></h1>
<%String validation= null;
try{
validation=request.getAttribute("valid").toString();
if(validation!=null)
{
	out.println(validation);
}
}catch(Exception e)
{
	e.printStackTrace();
}
%>
</div>
<div style="color:white"align="center">
<form method="post" action="register.enter">
<table>
<tr>	<td>	<p>Name: </td>
		<td>	<input type="text" name="fullname" required placeholder="enter name"/>
		</td>	</p>
<tr/>
<tr>	<td>	<p>Email: </td>
		<td>	<input type="email" name="email" required placeholder="enter valid email"/>
		</td>	</p>
</tr>
<tr>	<td>	<p>Job: 
		</td>
		<td>	<select name="job"><option value="Manager">Manager</option>
				<option value="asst.Manager">asst.Manager</option>
				<option value="Sr.employee">Sr.employee</option>
				<option value="jr.employee">jr.employee</option>
				<option value="cleark">cleark</option>
				</select>
		</td>	</p>
</tr>
<tr>	<td>	<p>Position Type:  
		</td> 
		<td>	<input type="radio" name="position" value="Full time" checked/> full time
		</td>
</tr>
<tr>
		<td>
		</td>
		<td>	<input type="radio" name="position" value="contract"/> contract
		</td>	</p>
</tr>
</table>
<p>
<input type="submit" name="submit" value="submit"/></p>
</form>
</div>
<h3><p style="color:red"><a href="selecttype.jsp">go to select</a> </p></h3>
</body>
</html>