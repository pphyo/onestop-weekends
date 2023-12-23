package com.jdc.scope.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jdc.scope.data.Counter;

import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("scope")
@RequiredArgsConstructor
public class ScopeController {
	
	private final Counter reqCounter;
	private final Counter sesCounter;
	private final Counter appCounter;

	@GetMapping
	public String index(ModelMap model) {
		reqCounter.countUp();
		sesCounter.countUp();
		appCounter.countUp();
		model.put("reqCounter", reqCounter.getCount());
		model.put("sesCounter", sesCounter.getCount());
		model.put("appCounter", appCounter.getCount());
		return "scope";
	}
	
	@PostMapping
	public String invalidate(HttpSession session) {
		session.invalidate();
		return "redirect:/scope";
	}
	
	@ModelAttribute
	public void addCounter(ModelMap model) {
		model.put("reqCounter", reqCounter.getCount());
		model.put("sesCounter", sesCounter.getCount());
		model.put("appCounter", appCounter.getCount());
	}
	
}





