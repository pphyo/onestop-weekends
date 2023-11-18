<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Listener</title>
</head>
<body>

	<h2><%= application.getAttribute("appListener") %></h2>
	<h2><%= session.getAttribute("sesListener") %></h2>
	
	<a href="<%= request.getContextPath().concat("/attribute") %>">Application Attribute</a>
	<a href="<%= request.getContextPath().concat("/start-session") %>">Start Session</a>
	<a href="<%= request.getContextPath().concat("/stop-session") %>">Stop Session</a>

</body>
</html>