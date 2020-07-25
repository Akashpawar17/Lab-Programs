package com.capgemini.exception;

public class App {
	
	public static void main(String[] args) {
		int i=10;
		int fact;
		FactorialFind f =new FactorialFind();
		try {
			 fact=f.fact(i);
			System.out.println("factorial:"+fact);
		} catch (ExceptionDemo e) {
			
		e.printStackTrace();
		}
	}

}
