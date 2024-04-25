package com.demo.service;

import java.util.List;

import com.demo.model.Category;
import com.demo.model.Product;

public interface ProductService {
	
	List<Product> findAll(Integer PageNumber,Integer pageSize);
	
	Product save(Product p);
	
	Product findByPid(int pid);
	
	int deleteByPid(int pid);

}
