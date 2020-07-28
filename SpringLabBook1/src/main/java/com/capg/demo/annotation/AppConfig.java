package com.capg.demo.annotation;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages= {"com.capg.demo.annotation"})
public class AppConfig {
	
	
@Bean(name="employee")	
public Employee getEmployeeDetails() {
		
		Employee emp=new Employee();
		emp.setId(12345);
		emp.setName("Harriet");
		emp.setSalary(40000);
		emp.setBU("PES-BU");
		emp.setAge(30);
		
	
		
		return emp;
		

	}
@Bean(name="empdata")
public EmpData getEmpData() {
	EmpData emp=new EmpData();
	emp.setEmpint(getEmployeeDetails());
	return emp;
}

}
