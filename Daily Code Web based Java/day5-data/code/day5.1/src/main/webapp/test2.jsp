<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%!
String mesg1="some message!!!"; //implicitily has private access
%>
<body>
<%
	String mesg2="another message!!"; //local variable
	pageContext.setAttribute("nm1", 1000);
%>	
<%@ include file="test3.jsp"%>
</body>
</html>