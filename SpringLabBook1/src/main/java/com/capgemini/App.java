package com.capgemini;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {

ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");

SBU sbu=(SBU) context.getBean("sbu");
System.out.println(""+sbu);

	}

}
