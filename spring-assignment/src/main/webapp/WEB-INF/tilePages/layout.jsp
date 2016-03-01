<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Layout page</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
 <div class="table-responsive">          
 <table class="table">
<tr>
<td colspan="2" height="100" align="center" style="background-color: red"><tiles:insertAttribute name="header"/></td></tr>
<tr height="80%" ><td width="20%" style="background-color: blue"><tiles:insertAttribute name="menu"/></td>
	<td style="background-color: orange; align: center" width="80%"><tiles:insertAttribute name="title"/>
		<tiles:insertAttribute name="body"/></td></tr>
<tr><td colspan="2" height="100" ><tiles:insertAttribute name="footer"/></td></tr>
</table>
</div>
</div>
</body>
</html>