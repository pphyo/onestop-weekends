package com.jdc.confor.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.thymeleaf.context.LazyContextVariable;

import com.jdc.confor.data.Category;
import com.jdc.confor.service.CategoryService;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("category")
@RequiredArgsConstructor
public class CategoryController {

	private final CategoryService categoryService;

	@GetMapping
	public String list(ModelMap model) {
		model.put("categories", new LazyContextVariable<List<Category>>() {
			@Override
			protected List<Category> loadValue() {
				return categoryService.search();
			}
		});
		return "category-list";
	}

	@GetMapping("form")
	public String edit(ModelMap model, @RequestParam(required = false) Integer id) {
		if (id != null) {
			model.put("category", categoryService.findById(id));
		} else {
			Category category = (Category) model.get("category");
			if (category == null) {
				category = new Category();
			}
			model.put("category", category);
		}
		return "category-form";
	}

	@PostMapping("save")
	public String save(Category category, RedirectAttributes redirect) {
		var result = categoryService.save(category);
		if (result != null) {
			redirect.addFlashAttribute("status",
					"Category is successfully %s.".formatted(category.getId() == 0 ? "Created" : "Updated."));
		}
		return "redirect:/category";
	}

}
