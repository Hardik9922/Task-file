package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.demo.dao.ProductDao;
import com.demo.model.Category;
import com.demo.model.Product;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductDao pd;
	
	@Override
	public List<Product> findAll(Integer pageNumber,Integer pageSize) {
		
		
		Pageable pg = PageRequest.of(pageNumber, pageSize);
			Page<Product> pageProduct = pd.findAll(pg);
			List<Product> allProduct = pageProduct.getContent();
			
		
		return pd.findAll();
	}

	@Override
	public Product findByPid(int pid) {
		return pd.findByPid(pid);
	}
	
	@Override
	public Product save(Product p) {
		return pd.save(p);
	}


	@Override
	public int deleteByPid(int pid) {
		return pd.deleteByPid(pid);
	}

}
