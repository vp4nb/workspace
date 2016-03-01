<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jstl/sql" prefix="sql"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<sql:setDataSource var="con" driver="org.postgresql.Driver" 
		url="jdbc:postgresql://127.0.0.1:5432/postgres" user="postgres" password="AZaz09$$"/>
</head>
<body>

<sql:query var="result" dataSource="${con}">
select fullname,email from register;
</sql:query>
<table border="1" width="100%">
<tr>
  <c:forEach var="col" items="${result.columnNames }">
  <th><c:out value="${col}"/></th>
  </c:forEach>
</tr>
<c:forEach var="row" items="${result.rowsByIndex}">
<tr>
   <c:forEach var="column" items="${row}">
   <td>
   <c:out value="${column }"/>
   </td></c:forEach>
</tr>
</c:forEach>
</table>
</body>
</html>