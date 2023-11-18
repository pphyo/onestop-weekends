<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>

	<% String contextPath = request.getContextPath(); %>

	<h2>Servlet Communication</h2>
	<ul>
		<li><a href="<%= contextPath.concat("/include") %>">Include</a></li>
		<li><a href="<%= contextPath.concat("/forward") %>">Forward</a></li>
		<li><a href="<%= contextPath.concat("/redirect") %>">Redirect</a></li>
	</ul>
	
	<hr>

	<h2>Servlet Home</h2>
	<ul>
		<li><a href="<%= contextPath.concat("/hello") %>">Hello Servlet</a></li>
		<li><a href="<%= contextPath.concat("/anno-servlet") %>">Annotation Servlet</a></li>
	</ul>

</body>
</html>