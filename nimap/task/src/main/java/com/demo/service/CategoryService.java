package com.demo.service;

import java.util.List;

import com.demo.model.Category;

public interface CategoryService {
	
	List<Category> findAll(Integer PageNumber,Integer pageSize);
	
	Category save(Category c);
	
	Category findByCid(int cid);
	
	int deleteByCid(int cid);
	
	
	
	

}
