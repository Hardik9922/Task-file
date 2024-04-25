package com.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.model.Product;

@Repository
public interface ProductDao extends JpaRepository<Product, Integer> {
	
	List<Product> findAll();
	
	Product save(Product p);
	
	Product findByPid(int pid);
	
	int deleteByPid(int pid);
}
