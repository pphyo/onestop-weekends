package com.jdc.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jdc.mvc.model.entity.Course;
import com.jdc.mvc.model.entity.Level;
import com.jdc.mvc.model.service.CourseService;

@Controller
@RequestMapping("course")
public class CourseController {
	
	@Autowired
	private CourseService service;
	
	@GetMapping("form")
	public String createForm() {
		return "course-form";
	}
	
	@PostMapping("save")
	public String create(
			@RequestParam String name, 
			@RequestParam int duration, 
			@RequestParam int price, 
			@RequestParam Level level) {
		
		Course c = new Course();
		c.setName(name);
		c.setDuration(duration);
		c.setPrice(price);
		c.setLevel(level);
		
		service.create(c);
		
		return "index";
	}
	
	@GetMapping
	public String edit(ModelMap model, @RequestParam int id) {
		var course = service.findById(id);
		model.put("course", course);
		return "course-edit";
	}
	
	@GetMapping("delete")
	public String delete(int id, ModelMap model) {
		service.delete(id);
//		model.put("courses", service.findAll());
		return "index";
	}

}





