package com.jdc.confor.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jdc.confor.data.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer> {

}
