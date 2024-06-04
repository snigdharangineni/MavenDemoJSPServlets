<%@ page import="com.web.AlienModel" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="cyan">
	<%
		AlienModel a1 = (AlienModel)request.getAttribute("alien");
		out.println(a1);
	%>
</body>
</html>