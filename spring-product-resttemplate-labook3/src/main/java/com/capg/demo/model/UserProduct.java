package com.capg.demo.model;

import java.util.ArrayList;
import java.util.List;

public class UserProduct {
	private List<Product> product=new ArrayList<Product>();

	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
	}

	public UserProduct(List<Product> product) {
		super();
		this.product = product;
	}

	public UserProduct() {
	
		// TODO Auto-generated constructor stub
	}
	
	

}
