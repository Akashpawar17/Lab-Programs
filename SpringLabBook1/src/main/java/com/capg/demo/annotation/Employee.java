package com.capg.demo.annotation;

import java.util.List;

public class Employee  implements EmployeeInterface{
private int Id;
private String Name;
private double Salary;
private String BU;
private int age;
//private List<SBU> sbudetails;
public Employee() {}
public Employee(int id, String name, double salary, String bU, int age) {
	super();
	Id = id;
	Name = name;
	Salary = salary;
	BU = bU;
	this.age = age;
}
public int getId() {
	return Id;
}
public void setId(int id) {
	Id = id;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public double getSalary() {
	return Salary;
}
public void setSalary(double salary) {
	Salary = salary;
}
public String getBU() {
	return BU;
}
public void setBU(String bU) {
	BU = bU;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
@Override
public String toString() {
	return "Employee [Id=" + Id + ", Name=" + Name + ", Salary=" + Salary + ", BU=" + BU + ", age=" + age + "]";
}



public void employeeDetails() {
	System.out.println("Employee Details");
	System.out.println("----------------");
	System.out.println("Employeee ID:"+Id);
	System.out.println("Employeee Name:"+Name);
	System.out.println("Employeee Salary:"+Salary);
	System.out.println("Employeee BU:"+BU);
	System.out.println("Employeee Age:"+age);
	
}
public void getSbuDetails() {
	System.out.println("");


	
}






}
