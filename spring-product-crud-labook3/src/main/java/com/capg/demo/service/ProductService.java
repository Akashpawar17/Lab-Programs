package com.capg.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.demo.exception.productDoesnotExistsException;
import com.capg.demo.exception.productNotFoundException;
import com.capg.demo.model.Product;
import com.capg.demo.repo.ProductRepo;

@Service
public class ProductService {
	
	@Autowired
	ProductRepo repo;
	public Product addProduct(Product p) throws productDoesnotExistsException {
		if(repo.existsById(p.getProductId())) {
			throw new  productDoesnotExistsException("The id which you have entered is already exists");
			
		}
		else return repo.save(p);
	}
	
	public Product  getProduct(int id) throws productNotFoundException {
		if(!repo.existsById(id)) {
			throw new productNotFoundException("product id not found");
		}
		else
			return repo.getOne(id);
	}
	
	public void deleteProduct(int id) throws productNotFoundException {
		if(!repo.existsById(id)) {
			throw new productNotFoundException("product id not found");
		}
		else   repo.deleteById(id);
	}
	
	public Product updateProduct(Product p) throws productNotFoundException {
		Product product=repo.getOne(p.getProductId());
		if(product==null) {
			throw new productNotFoundException("product id not found");
		}
			p.setProductName(product.getProductName());
			p.setProductPrice(product.getProductPrice());
		 return repo.save(p);
	}

	
	public List<Product> getAllProduct(){
		return repo.findAll();
	}
}
