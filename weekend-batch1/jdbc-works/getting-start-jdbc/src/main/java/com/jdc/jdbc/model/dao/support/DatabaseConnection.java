package com.jdc.jdbc.model.dao.support;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	
	public static final String URL = "jdbc:mysql://localhost:3306/invoicing";
	public static final String USR = "invoice";
	public static final String PWD = "Invoice@123";

	public static Connection getDbConnection() throws SQLException {
		return DriverManager.getConnection(URL, USR, PWD);
	}
	
	public static void createTable() {
		String create = """
				create table user(
				id int auto_increment,
				name varchar(50) not null,
				dob date not null,
				email varchar(50) not null,
				phone varchar(15),
				primary key(id)
			)
			""";
		
		try(var conn = getDbConnection();
				var stmt = conn.createStatement()) {
			
			stmt.execute("drop table if exists user");
			stmt.execute(create);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}





