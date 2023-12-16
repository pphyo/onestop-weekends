package com.jdc.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.jdc.mvc.model.entity.Course;
import com.jdc.mvc.model.entity.Level;
import com.jdc.mvc.model.service.CourseService;

@Controller
@RequestMapping("course")
public class CourseController {
	
	@Autowired
	private CourseService service;
	
	@GetMapping
	public String index(ModelMap model) {
		model.put("courses", service.findAll());
		return "index";
	}
	
	@GetMapping("form")
	public String createForm(ModelMap model) {
		model.put("course", new Course());
		return "course-form";
	}
	
	@PostMapping("save")
	public String save(Course course,
			ModelMap model,
			RedirectAttributes redirect) {
		
		int id = service.create(course);
		
		model.put("courses", service.findAll());
		
		String info = id > 0 ? "Update course successfully." : "Course create successfully.";
		redirect.addFlashAttribute("info", info);
		
		return "redirect:/course/detail/%s".formatted(id);
	}
	
	@GetMapping("edit")
	public String edit(ModelMap model, @RequestParam int id) {
		var course = service.findById(id);
		model.put("course", course);
		return "course-form";
	}
	
	@GetMapping("detail/{id:\\d+}")
	public String detail(ModelMap model, @PathVariable int id) {
		model.put("course", service.findById(id));
		return "course-detail";
	}
	
	@GetMapping("delete")
	public String delete(int id, ModelMap model) {
		service.delete(id);
//		model.put("courses", service.findAll());
		return "index";
	}
	
	@ModelAttribute("levels")
	Level[] loadLevel() {
		return Level.values();
	}

}





