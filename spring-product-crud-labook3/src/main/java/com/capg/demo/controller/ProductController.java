package com.capg.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capg.demo.exception.productDoesnotExistsException;
import com.capg.demo.exception.productNotFoundException;
import com.capg.demo.model.Product;
import com.capg.demo.service.ProductService;

@RestController
public class ProductController {
	
	
	@Autowired
	ProductService service;
	
	@PostMapping("/product")
	public Product addProduct(@RequestBody Product  p) throws productDoesnotExistsException {
		return service.addProduct(p);
		
	}
	
	@GetMapping("/product/{id}")
	public Product getProductById(@PathVariable("id") int id) throws productNotFoundException {
		return service.getProduct(id);
	}
	@DeleteMapping("/product/{id}")
	public String deleteProductById(@PathVariable("id")  int id) throws productNotFoundException {
		service.deleteProduct(id);
		return "deleted succesfully";
	}
	@PutMapping("/product")
	public Product updateProduct(@RequestBody Product  p) throws productNotFoundException  {
		return service.updateProduct(p);
		
	}
	@GetMapping("products")
	public List<Product> getAllProduct(){
		return service.getAllProduct();
	}
	
	
}
