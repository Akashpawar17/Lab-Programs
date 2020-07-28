package com.capg.demo.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component("empdata")
public class EmpData {
	
	//@Autowired
	//@Qualifier("employee")
	private EmployeeInterface empint;

	public EmployeeInterface getEmpint() {
		return empint;
	}

	public void setEmpint(EmployeeInterface empint) {
		this.empint = empint;
	}
	
	public void employeeDetails() {
		if(empint==null) {
			System.out.println("error");
		}
		else {
		empint.employeeDetails();
		}
		
	}

}
