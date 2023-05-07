package com.jdc.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.sql.Date;
import java.sql.DriverManager;
import java.time.LocalDate;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

@TestMethodOrder(OrderAnnotation.class)
public class CreateTest {
	
	static final String URL = "jdbc:mysql://localhost:3306/invoicing";
	static final String USR = "invoice";
	static final String PWD = "Invoice@123";
	
	@BeforeAll
	static void init() {
		
		String sql = """
				create table user(
					id int primary key auto_increment,
					name varchar(50) not null,
					dob date not null,
					email varchar(50) not null,
					phone varchar(15)
				)
				""";
		
		try(var conn = DriverManager.getConnection(URL, USR, PWD);
				var stmt = conn.createStatement()) {
			
			stmt.executeUpdate("drop table if exists user");
			stmt.execute(sql);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Order(1)
	@DisplayName("Create User")
	@ParameterizedTest
	@CsvSource(value = {
			"Toe Maung,1999-02-10,toemaung@gmail.com,0393920203030",
			"Nay San,1993-08-24,naysan@gmail.com,029020203030"
	})
	void test1(String name, LocalDate dob, String email, String phone) {
		
		String sql = """
				insert into user (name, dob, email, phone) values 
				(?, ?, ?, ?)
				""";
		
		try(var conn = DriverManager.getConnection(URL, USR, PWD);
				var stmt = conn.prepareStatement(sql)) {
			
			stmt.setString(1, name);
			stmt.setDate(2, Date.valueOf(dob));
			stmt.setString(3, email);
			stmt.setString(4, phone);
			
			stmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@Order(2)
	@DisplayName("Find by Id")
	@ParameterizedTest
	@ValueSource(ints = {1, 2})
	void test2(int id) {
		
		int userId = 0;
		String name = null;
		String email = null;
		LocalDate dob = null;
		String phone = null;
		
		String sql = "select * from user where id = ?";
		
		try(var conn = DriverManager.getConnection(URL, USR, PWD);
				var stmt = conn.prepareStatement(sql)) {
			
			stmt.setInt(1, id);
			
			var rs = stmt.executeQuery();
			
			while(rs.next()) {
				userId = rs.getInt(1);
				name = rs.getString(2);
				dob = rs.getDate(3).toLocalDate();
				email = rs.getString(4);
				phone = rs.getString(5);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		assertEquals(id, userId);
		System.out.println(name);
		System.out.println(dob);
		System.out.println(email);
		System.out.println(phone);
		
	}

}






