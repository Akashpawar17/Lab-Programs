package com.capg.exception;

import java.util.Scanner;

public class Person {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter your age");
		int age=scan.nextInt();
		
		
		if(age>15) {
			
			System.out.println("Person is Valid");
			
		}
		else{
			try {
				throw new NumberNotFoundException("please enter valid age");
			} catch (NumberNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	}

}
