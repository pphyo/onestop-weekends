<%@page import="com.jdc.servlet.communication.redirect.Hero"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hero List</title>
</head>
<body>
	<h2>Hero List</h2>
	<table>
		<thead>
			<tr>
				<td>Hero Name</td>
				<td>Role</td>
			</tr>
		</thead>
		<tbody>
			<%
				@SuppressWarnings("unchecked")
				List<Hero> list = (List<Hero>)request.getAttribute("heroList");
				
				for(Hero hero : list) {
			%>
			
			<tr>
				<td><%= hero.getName() %></td>
				<td><%= hero.getRole() %></td>
			</tr>
			
			<% } %>
		</tbody>
	</table>
</body>
</html>








