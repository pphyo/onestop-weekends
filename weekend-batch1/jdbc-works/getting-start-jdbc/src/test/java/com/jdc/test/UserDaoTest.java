package com.jdc.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import com.jdc.jdbc.model.dao.UserDao;
import com.jdc.jdbc.model.dao.support.DatabaseConnection;
import com.jdc.jdbc.model.dto.User;

@TestMethodOrder(OrderAnnotation.class)
public class UserDaoTest {
	
	static UserDao dao;

	@BeforeAll
	static void init() {
		DatabaseConnection.createTable();
		dao = new UserDao();
	}
	
	@Order(1)
	@ParameterizedTest
	@CsvFileSource(resources = "/users.csv")
	void test1(String name, LocalDate birthDate, String email, String phone) {
		
		User user = new User(0, name, birthDate, email, phone);
		dao.insertOne(user);
		
	}
	
	@Order(2)
	@ParameterizedTest
	@ValueSource(ints = 6)
	void test2(int expected) {
		var result = dao.findAll();
		assertEquals(expected, result.size());
	}
	
	@Order(2)
	@ParameterizedTest
	@CsvSource({
		"1,Aung Aung",
		"2,Nyi Nyi Maung",
		"3,Thidar",
		"4,Thawtar",
		"5,Ko Ko Maung",
		"6,Ko Aung Ko"
	})
	void test3(int id, String expectedName) {
		User user = dao.findOneById(id);
		assertNotNull(user);
		assertEquals(expectedName, user.getName());
	}
	
	@Order(4)
	@ParameterizedTest
	@CsvSource({
		"Aung,1",
		"Nyi,1",
		"Thi,1",
		"Th,2",
		"Ko Ko,1",
		"Ko,2"
	})
	void test4(String name, int expected) {
		List<User> result = dao.findByName(name);
		assertEquals(expected, result.size());
	}
	
	@Order(5)
	@ParameterizedTest
	@CsvSource({
		"1,Zaw Tun,2000-10-10,zawtun@gmail.com,0974839933"
	})
	void test5(int id, String name, LocalDate birthDate, String email, String phone) {
		User user = new User(id, name, birthDate, email, phone);
		dao.update(user);
		
		var result = dao.findOneById(id);
		assertEquals(name, result.getName());
		assertEquals(birthDate, result.getBirthDate());
		assertEquals(email, result.getEmail());
		assertEquals(phone, result.getPhone());
	}
	
	@Order(6)
	@ParameterizedTest
	@MethodSource("getUserList")
	void test6(List<User> users) {
		dao.insertMany(users);
		var list = dao.findAll();
		
		assertEquals(9, list.size());
	}
		
	static Stream<Arguments> getUserList() {
		return Stream.of(
					Arguments.of(List.of(
							new User(0, "Bruno", LocalDate.of(1990, 10, 2), "burno@gmail.com", "0199399392"),
							new User(0, "Franco", LocalDate.of(1980, 1, 2), "franco@gmail.com", "02193939393"),
							new User(0, "Zilong", LocalDate.of(2000, 7, 20), "zilong@gmail.com", "039393939")
							))
				);
	}
	
	@Order(7)
	@ParameterizedTest
	@CsvSource({
		"Z,2000-07-20,,2",
		",1997-08-29,,6",
		",,ko,2",
		",1998-06-20,th,1",
		"Nyi Nyi Maung,,,1"
	})
	void test7(String name, LocalDate birthDate, String email, int expected) {
		var list = dao.find(name, birthDate, email);
		assertEquals(expected, list.size());
	}
}





