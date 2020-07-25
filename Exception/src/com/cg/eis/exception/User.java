package com.cg.eis.exception;

import java.util.Scanner;

public class User {

	public static void main(String[] args) {

Scanner scanner=new Scanner(System.in);
Employee e =new Employee();
System.out.println("enter salary");
int salary=scanner.nextInt();
	
		
		

		try {
			e.Details(salary);
			System.out.println(e);
		} catch (EmployeeException e1) {
		
			e1.printStackTrace();
		}
	}

}
