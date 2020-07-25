package com.capg.collect;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Colletion {

	public static void main(String[] args) {
		
	
		

		
		/*Set<String> c= new TreeSet<>();
		c.add("akash");
		c.add("abd");
		c.add("devillers");
		c.add("john");
		c.add("akash");


		c.forEach(System.out::println);
		
		
*/
		
		List<Trainee> list =Arrays.asList(
				new Trainee("akash","sddsd" ,21),
				new Trainee("vikash","wd" ,12),
				new Trainee("jon","fred" ,31),
		new Trainee("akash","sddsd" ,21));
		
		
		Set<Integer> set= new HashSet<>();
		System.out.println(" set");
		set.forEach(t->System.out.println(t));
		Collections.sort(list);//,new SortByName());
		System.out.println(" list");
				
				list.forEach(t->System.out.println(t));
				
				
			
				
	
	
}
	
	
	}
