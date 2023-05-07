package com.jdc.jdbc.model.dao;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static com.jdc.jdbc.model.dao.support.DatabaseConnection.*;
import com.jdc.jdbc.model.dto.User;

public class UserDao {
	
	public static final String INSERT = """
			insert into user (name, dob, email, phone) 
			values (?, ?, ?, ?)""";
	public static final String SELECT = "select * from user where 1 = 1";
	
	/***
	 * insert single user object to database
	 * 
	 * @param user
	 * @return generated primary key
	 */
	public int insertOne(User user) {
		
		try(var conn = getDbConnection();
				var stmt = conn.prepareStatement(INSERT, Statement.RETURN_GENERATED_KEYS)) {
						
			stmt.setString(1, user.getName());
			stmt.setDate(2, Date.valueOf(user.getBirthDate()));
			stmt.setString(3, user.getEmail());
			stmt.setString(4, user.getPhone());
			
			stmt.executeUpdate();
			
			var rs = stmt.getGeneratedKeys();
			
			while(rs.next())
				return rs.getInt(1);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return 0;
	}
	
	// insert multiple object
	public void insertMany(List<User> users) {
		
		try(var conn = getDbConnection();
				var stmt = conn.prepareStatement(INSERT)) {
			
			for(var user : users) {
				stmt.setString(1, user.getName());
				stmt.setDate(2, Date.valueOf(user.getBirthDate()));
				stmt.setString(3, user.getEmail());
				stmt.setString(4, user.getPhone());
				
				stmt.addBatch();
			}
			
			stmt.executeBatch();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	// update
	public void update(User user) {
		
		String update = """
				update user set name = ?, dob = ?, email = ?, phone = ?
				where id = ?
				""";
		
		try(var conn = getDbConnection();
				var stmt = conn.prepareStatement(update)) {
			
			stmt.setString(1, user.getName());
			stmt.setDate(2, Date.valueOf(user.getBirthDate()));
			stmt.setString(3, user.getEmail());
			stmt.setString(4, user.getPhone());
			stmt.setInt(5, user.getId());
			
			stmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	// delete
	
	// find all users
	public List<User> findAll() {
		
		List<User> users = new ArrayList<>();
		
		try(var conn = getDbConnection();
				var stmt = conn.createStatement()) {
			
			var rs = stmt.executeQuery(SELECT);
			
			while(rs.next()) {
				User user = getUserObj(rs);
				users.add(user);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return users;
	}

	// find user by user's id
	public User findOneById(int id) {
		
		try(var conn = getDbConnection();
				var stmt = conn.prepareStatement(SELECT.concat(" and id = ?"))) {
			
			stmt.setInt(1, id);
			
			var rs = stmt.executeQuery();
			
			while(rs.next()) {
				return getUserObj(rs);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	// find user by user's name
	public List<User> findByName(String name) {
		
		List<User> users = new ArrayList<>();
		
		try(var conn = getDbConnection();
				var stmt = conn.prepareStatement(SELECT.concat(" and lower(name) like ?"))) {
			
			stmt.setString(1, name.toLowerCase().concat("%"));
			
			var rs = stmt.executeQuery();
			
			while(rs.next()) {
				users.add(getUserObj(rs));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return users;
	}
	
	public List<User> find(String name, LocalDate dob, String email) {
		
		List<User> users = new ArrayList<>();
		List<Object> params = new LinkedList<>();
	
		StringBuffer sb = new StringBuffer(SELECT);
		
		if(!isEmpty(name)) {
			sb.append(" and lower(name) like lower(?)");
			params.add(name.concat("%"));
		}
		
		if(null != dob) {
			sb.append(" and dob >= ?");
			params.add(dob);
		}
		
		if(!isEmpty(email)) {
			sb.append(" and lower(email) like lower(?)");
			params.add(email.concat("%"));
		}
		
		try(var conn = getDbConnection();
				var stmt = conn.prepareStatement(sb.toString())) {
			
			for(int i = 0; i < params.size(); i++)
				stmt.setObject(i + 1, params.get(i));
			
			var rs = stmt.executeQuery();
			
			while(rs.next())
				users.add(getUserObj(rs));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return users;
	}

	private boolean isEmpty(String data) {
		return null == data || data.isEmpty() || data.isBlank();
	}

	private User getUserObj(ResultSet rs) throws SQLException {
		return new User(
				rs.getInt("id"),
				rs.getString("name"),
				rs.getDate("dob").toLocalDate(),
				rs.getString("email"),
				rs.getString("phone")
				);
	}
	
}




