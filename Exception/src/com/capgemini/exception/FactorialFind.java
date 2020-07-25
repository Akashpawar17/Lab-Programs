package com.capgemini.exception;

public class FactorialFind {
	
	
	
	public int fact(int i) throws ExceptionDemo {
		if(i<0) {
			throw new ExceptionDemo("value cannot be less than zero");
			
		}
		
		int f=1;
		while(i!=0) {
			f*=i;
			i--;
		}
		return f;
		
	}

}
