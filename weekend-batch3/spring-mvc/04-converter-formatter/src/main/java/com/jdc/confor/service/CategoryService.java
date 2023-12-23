package com.jdc.confor.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jdc.confor.data.Category;
import com.jdc.confor.repo.CategoryRepo;

import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor
public class CategoryService {
	
	private final CategoryRepo categoryRepo;

	public Category save(Category category) {
		if(category.getId() == 0)
			return create(category);
		
		return update(category);
	}
	
	private Category create(Category category) {
		return categoryRepo.save(category);
	}
	
	private Category update(Category category) {
		return categoryRepo.findById(category.getId()).map(c -> {
			c.setName(category.getName());
			return c;
		}).orElseThrow(() -> new RuntimeException("Category id not found!"));
	}
	
	@Transactional(readOnly = true)
	public List<Category> search() {
		return categoryRepo.findAll();
	}
	
	@Transactional(readOnly = true)
	public Category findById(int id) {
		return categoryRepo.findById(id).orElseThrow(() -> new RuntimeException("Category id not found!"));
	}

}
