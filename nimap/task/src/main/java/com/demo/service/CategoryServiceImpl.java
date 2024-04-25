package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.demo.dao.CategoryDao;
import com.demo.model.Category;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class CategoryServiceImpl implements CategoryService {
	
	
	@Autowired
	private CategoryDao cd;
	
	@Override
	public List<Category> findAll(Integer pageNumber,Integer pageSize) {
		
		
		Pageable pg = PageRequest.of(pageNumber, pageSize);
			Page<Category> pageCategory = cd.findAll(pg);
			List<Category> allCategory = pageCategory.getContent();
			return cd.findAll();
	}

	@Override
	public Category findByCid(int cid) {
		return cd.findByCid(cid);
	}
	
	@Override
	public Category save(Category c) {
		return cd.save(c);
	}

	@Override
	public int deleteByCid(int cid) {
		return cd.deleteByCid(cid);
	}
	
	

}
