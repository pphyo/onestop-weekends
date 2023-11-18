<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Forward</title>
</head>
<body>
	
	<p><%= request.getAttribute("forwardMessage") %></p>
	<p><%= request.getAttribute("forwardToMessage") %></p>
	
</body>
</html>