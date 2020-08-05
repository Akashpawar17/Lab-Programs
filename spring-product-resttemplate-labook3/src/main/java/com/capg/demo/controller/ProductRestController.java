package com.capg.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.RestTemplate;

import com.capg.demo.model.Product;


@RestController
public class ProductRestController {
	
	@Autowired
	RestTemplate rest;
	
	@PostMapping("/product")
	public Product addProduct(@RequestBody Product p) {
		
	

		Product  pt=rest.postForObject("http://localhost:8111/product", p, Product.class);
		
	
	return pt;
	}
	
	@GetMapping("/product/{id}")
	public Product getProductById(@PathVariable("id") int productId){
		
		
	Product p=	rest.getForObject("http://localhost:8111/product/"+productId, Product.class);
		
	
		
			return p;
	

}
	@DeleteMapping("/product/{id}")
	public String deleteProductById(@PathVariable("id") int productId){
		
		rest.delete("http://localhost:8111/product/"+productId);
		
	
		return "deleted successfully";
	
		
			
	

}
	
	

	@PutMapping("/product")
	public Product updateProduct(@RequestBody Product p) {
		rest.put("http://localhost:8111/product", p);
	

	
		
	
	return p;
	}
}
