package com.capgemini.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.capgemini.collection.Student;

public class StudentComp {

	public static void main(String[] args) {
		List<Student> student = Arrays.asList(
				new Student("vikash", 20, 167),
				new Student("akash", 22, 160),
				new Student("mahesh", 16, 159));
		
		
		
		//Collections.sort(student, (t1, t2) -> t1.sname.compareTo(t2.sname));
		// Collections.sort(student,(t1,t2)->t1.age-t2.age);
		Collections.sort(student, (t1, t2) -> t1.height - t2.height);

		System.out.println("Student List :");
		student.forEach(t -> System.out.println(t));

	}

	class SortByName implements Comparator<Student> {

		public int compare(Student t1, Student t2) {
			return t1.sname.compareTo(t2.sname);
		}
	}

	class SortByAge implements Comparator<Student> {

		public int compare(Student t1, Student t2) {
			return t1.age - t2.age;
		}
	}

}

class SortByHeight implements Comparator<Student> {


	public int compare(Student t1, Student t2) {
		// TODO Auto-generated method stub
		return t1.height - t2.height;
	}

}
