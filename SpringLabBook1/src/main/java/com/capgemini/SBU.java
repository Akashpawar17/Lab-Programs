package com.capgemini;

import java.util.ArrayList;
import java.util.List;

public class SBU {
private int sbuCode;
private String sbuName;
private String sbuHead;
private ArrayList<Employee> empList;

public SBU() {
}
public int getSbuCode() {
	return sbuCode;
}
public void setSbuCode(int sbuCode) {
	this.sbuCode = sbuCode;
}
public String getSbuName() {
	return sbuName;
}
public void setSbuName(String sbuName) {
	this.sbuName = sbuName;
}
public String getSbuHead() {
	return sbuHead;
}
public void setSbuHead(String sbuHead) {
	this.sbuHead = sbuHead;
}
public ArrayList<Employee> getEmpList() {
	return empList;
}
public void setEmpList(ArrayList<Employee> empList) {
	this.empList = empList;
}
public SBU(int sbuCode, String sbuName, String sbuHead, ArrayList<Employee> empList) {
	super();
	this.sbuCode = sbuCode;
	this.sbuName = sbuName;
	this.sbuHead = sbuHead;
	this.empList = empList;
}
@Override
public String toString() {
	return "SBU [sbuCode=" + sbuCode + ", sbuName=" + sbuName + ", sbuHead=" + sbuHead + ", empList=" + empList + "]";
}

}
