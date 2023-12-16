package com.jdc.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("hello")
public class HelloController {
	
	@GetMapping("digit/{num:\\d+}")
	public String helloWithPathDigit(ModelMap model, @PathVariable("num") int num) {
		model.put("message", "Hello Controller with path digit!");
		model.put("output", num);
		return "hello";
	}
	
	@GetMapping("str/{text}")
	public String helloWithPathString(ModelMap model, @PathVariable("text") String inText) {
		model.put("message", "Hello Controller with path variable!");
		model.put("output", inText);
		return "hello";
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "**")
	public String helloOther(ModelMap model) {
		model.put("message", "Hello Controller with other url!");
		return "hello";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String helloPost(ModelMap model) {
		model.put("message", "Welcom from Hello Controller Post!");
		return "hello";
	}
	
	// /hello/sub
	@RequestMapping(value = "sub", method = RequestMethod.GET)
	public String helloWithSubUrl(ModelMap model) {
		model.put("message", "Welcome from Hello Controller with Sub Url!");
		return "hello";
	}
	
	@RequestMapping(method = RequestMethod.GET, params = "input")
	public String helloWithParam(ModelMap model) {
		model.put("message", "Welcome form Hello Controller With Param!");
		return "hello";
	}
	
	@GetMapping
	public ModelMap hello() {
		ModelMap model = new ModelMap();
		model.put("message", "Welcome form Hello Controller!");
		return model;
	}

}
