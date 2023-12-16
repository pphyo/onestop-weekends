package com.jdc.mvc.model.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Service;

import com.jdc.mvc.model.entity.Course;
import com.jdc.mvc.model.entity.Level;

import jakarta.annotation.PostConstruct;

@Service
public class CourseService {
	
	@Autowired
	private SimpleJdbcInsert insert;
	
	private RowMapper<Course> rowMapper;
	
	public CourseService() {
		rowMapper = (rs, row) -> {
			Course c = new Course();
			c.setId(rs.getInt("id"));
			c.setName(rs.getString("name"));
			c.setDuration(rs.getInt("duration"));
			c.setLevel(Level.valueOf(rs.getString("level")));
			c.setPrice(rs.getInt("price"));
			c.setStartDate(rs.getDate("start_date") == null ? null : rs.getDate("start_date").toLocalDate());
			return c;
		};
	}
	
	@PostConstruct
	public void init() {
		insert.setTableName("course");
		insert.setGeneratedKeyName("id");
	}
	
	public int create(Course course) {		
		Map<String, Object> map = new HashMap<>();
		
		map.put("id", course.getId());
		map.put("name", course.getName());
		map.put("duration", course.getDuration());
		map.put("level", course.getLevel());
		map.put("price", course.getPrice());
		map.put("start_date", course.getStartDate());
		
		if(course.getId() > 0) {
			insert.getJdbcTemplate().update("update course set name = ?, price = ?, duration = ?, level = ?, start_date = ? where id = ?", 
					course.getName(), course.getPrice(), 
					course.getDuration(), course.getLevel().name(),
					course.getStartDate(), course.getId());
			
			return course.getId();
		}
		
		return insert.executeAndReturnKey(map).intValue();
	}
	
	public void delete(int id) {
		insert.getJdbcTemplate().update("delete from course where id = ?", id);		
	}

	
	public Course findById(int id) {
		return insert.getJdbcTemplate()
				.queryForObject("select * from course where id = ?", rowMapper, id);
	}
	
	public List<Course> findAll() {
		return insert.getJdbcTemplate().query("select * from course", rowMapper);
	}

}