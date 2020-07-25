package com.capg.string;





public class StringDemo {
	
	
	public String name(String s1,String s2) throws StringIOException {



if(s1.isEmpty() ||s2.isEmpty()) {
	throw new StringIOException("please enter your fullname");
	
} 

return s1+s2;


	}
}


