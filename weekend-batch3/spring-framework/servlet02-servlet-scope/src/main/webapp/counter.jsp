<%@page import="com.jdc.scope.Counter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Servlet Scope</title>
</head>
<body>
	<h2>Servlet Scope</h2>
	<table>
		<tr>
			<td>Request Scope</td>
			<td>
				<%= ((Counter)request.getAttribute("counter")).getCount() %>
			</td>
		</tr>
		<tr>
			<td>Session Scope</td>
			<td>
				<%= ((Counter)session.getAttribute("counter")).getCount() %>
			</td>
		</tr>
		<tr>
			<td>Application Scope</td>
			<td>
				<%= ((Counter)application.getAttribute("counter")).getCount() %>
			</td>
		</tr>
		<tr>
			<td>
				<form action="<%= request.getContextPath().concat("/session-stop") %>" method="post">
					<input type="submit" value="Stop Session">
				</form>
			</td>
			<td><a href="<%= request.getContextPath().concat("/counter") %>">Count Up</a></td>
		</tr>
	</table>

</body>
</html>