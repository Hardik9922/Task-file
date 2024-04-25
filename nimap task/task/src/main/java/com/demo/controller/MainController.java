package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Category;
import com.demo.model.Product;
import com.demo.service.CategoryService;
import com.demo.service.ProductService;

@RestController
@RequestMapping(value = "/api")
public class MainController {
	
	@Autowired
	private CategoryService cs;
	
	@Autowired
	private ProductService ps;
	
	//Category CURD Operations
	
	//Get all the Categories with pagination
	@GetMapping(value = "/getall")
	public List<Category> m1(@RequestParam(value = "pageNumber",defaultValue = "1",required = false) Integer pageNumber,
	@RequestParam(value = "pageSize",defaultValue = "4",required = false) Integer pageSize)
	{
		return cs.findAll(pageNumber, pageSize);
	}
	
	//create a new Category
	@PostMapping(value = "/insert")
	public Category m2(@RequestBody Category c,@PathVariable int id)
	{
		return cs.save(c);
	}
	
	//Get Category by id
	@GetMapping(value = "/getbyid/{id}")
	public Category m3(@PathVariable int id)
	{
		return cs.findByCid(id);
	}
	
	//update Category by id
	@PutMapping(value = "/update")
	public Category m4(@RequestBody Category c)
	{
		return cs.save(c);
	}

	//delete Category by id
	@DeleteMapping(value = "/deletebyid/{cid}")
	public int m5(@PathVariable int cid)
	{
		return cs.deleteByCid(cid);
	}
	
	
	//Product CURD Operations
	
	//Get all products with pagination
	@GetMapping(value = "/pgetall")
	public List<Product> m6(@RequestParam(value = "pageNumber",defaultValue = "1",required = false) Integer pageNumber,
	@RequestParam(value = "pageSize",defaultValue = "5",required = false) Integer pageSize)
	{
		return ps.findAll(pageNumber, pageSize);
	}
	
	//create a new product
	@PostMapping(value = "/pinsert")
	public Product m7(@RequestBody Product p)
	{
		return ps.save(p);
	}
	
	//Get product by id
	@GetMapping(value = "/pgetbyid/{id}")
	public Product m8(@PathVariable int id)
	{
		return ps.findByPid(id);
	}
	
	//update product by id
	@PutMapping(value = "/pupdate")
	public Product m9(@RequestBody Product p)
	{
		return ps.save(p);
	}
	
	//delete product by id
	@DeleteMapping(value = "/pdeletebyid/{pid}")
	public int m10(@PathVariable int pid)
	{
		return ps.deleteByPid(pid);
	}
	
	
	

}
