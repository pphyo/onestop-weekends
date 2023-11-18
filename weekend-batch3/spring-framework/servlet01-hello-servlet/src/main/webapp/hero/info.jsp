<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Info</title>
</head>
<body>
	<h4><%= request.getAttribute("info") %></h4>
	<% var path = request.getContextPath(); %>
	<a href="<%= path.concat("/") %>">Home</a>
	<a href="<%= path.concat("/redirect") %>">Back</a>
	<a href="<%= path.concat("/hero-list") %>">Hero List</a>
</body>
</html>