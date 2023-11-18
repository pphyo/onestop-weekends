<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hero Form</title>
</head>
<body>

	<h2>Hero Form</h2>
	
	<form action="<%= request.getContextPath().concat("/hero-save") %>" method="post">
		<table>
			<tr>
				<td>
					<label for="name">Hero Name</label>
				</td>
				 <td>
					<input type="text" id="name" name="name" >
				</td>
			</tr>
			<tr>
				<td>
					<label for="role">Hero Role</label>
				</td>
				 <td>
					<select id="role" name="role">
						<option value="">Select Role</option>
						<option value="Tank">Tank</option>
						<option value="Jungle">Jungle</option>
						<option value="Marksman">Marksman</option>
					</select>
				</td>
			</tr>
			<tr>
				<td></td>
				<td>
					<input type="submit" value="Save" >
				</td>
			</tr>
		</table>
	</form>

</body>
</html>