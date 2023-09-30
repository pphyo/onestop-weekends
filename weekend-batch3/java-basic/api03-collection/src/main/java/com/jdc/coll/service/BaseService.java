package com.jdc.coll.service;

import java.util.List;

public interface BaseService<T> {

	// insert
	boolean save(T item);
	
	// update
	T update(int id, T item);
	
	// delete
	void delete(int id);
	
	// select
	List<T> findAll();
	
}
