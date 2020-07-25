package com.cg.eis.exception;

import java.util.Scanner;

public class Employee {

	
		
		
		
		
	public int Details(int salary) throws EmployeeException {
		if(salary>3000) {
			System.out.println("Employee Salary is Valid");
			
		}
		else {
			
			
				throw new EmployeeException("Employee salary is Not Valid");
				
	
				
			}
		return salary;
			}
	
		
		
	}


