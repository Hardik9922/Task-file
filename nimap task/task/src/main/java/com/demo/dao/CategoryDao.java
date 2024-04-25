package com.demo.dao;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.model.Category;

@Repository
public interface CategoryDao extends JpaRepository<Category, Integer>  {
	
	List<Category> findAll();
	
	Category save(Category c);
	
	Category findByCid(int cid);
	
	int deleteByCid(int cid);
	
}
