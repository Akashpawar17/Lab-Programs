package com.capg.demo;

import java.sql.SQLException;
import java.util.Scanner;

import com.capg.demo.bean.Avatar;
import com.capg.demo.controller.AvatarController;

public class App 
{
    public static void main( String[] args ) throws SQLException
    {
    	try {
    	Avatar av;

int aid ;
String abranch;
String aname;

AvatarController controller =new AvatarController();
Scanner sc= new Scanner(System.in);
while(true) {
	System.out.println("Avatar details");
	System.out.println("1.Add Avatar");
	System.out.println("2.Delete Avatar");
	
	System.out.println("3.get avatar by id");
	//System.out.println("4.update avatar by aid");
	System.out.println("4.exit");
	System.out.println("Enter your choice:");

	int choice = sc.nextInt();
	switch (choice) {
	case 1:
		System.out.println("enter Avatar Id");
		 aid=sc.nextInt();
		System.out.println("enter Avatar Name");
		 aname=sc.next();
		System.out.println("enter Avatar Branch");
	abranch=sc.next();
		Avatar av1=new Avatar();


	
		try {
			Avatar avatar = controller.addAvatar(av1);
			System.out.println("Avatar added"+avatar);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		break;
	case 2:
		System.out.println("Enter Avatar ID : ");
		int avb=sc.nextInt(); 
		Avatar delete=controller.deleteAvatar(avb);
		
		
			System.out.println(" deleted successfully:"+delete);
	case 3:
		System.out.println("Enter Avatar ID : ");
		int a=sc.nextInt();
		Avatar get=controller.getAvatar(a);
		System.out.println("finding by id"+get);
		break;
	
		/*System.out.println("Enter Avatar ID : ");
		int up=sc.nextInt(); 
		System.out.println();
		
	Avatar update=controller.updateAvatar(up);
	System.out.println("upadte complete"+update);
		break;*/
	case 4:
		System.exit(0);
		
	}
}}
    	


catch (Exception e) {
	e.printStackTrace();}
}




    }

