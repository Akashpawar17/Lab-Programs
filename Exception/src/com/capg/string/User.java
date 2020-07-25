package com.capg.string;

import java.util.Scanner;

public class User {

	public static void main(String[] args) {


Scanner sc=new Scanner(System.in);
System.out.println("enter first name");
String s1=sc.nextLine();
System.out.println("enter last name");
String s2=sc.nextLine();


StringDemo s= new StringDemo();
try {
	String s3=s.name(s1, s2);
	System.out.println(s3);
} catch (StringIOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}


	}

}
