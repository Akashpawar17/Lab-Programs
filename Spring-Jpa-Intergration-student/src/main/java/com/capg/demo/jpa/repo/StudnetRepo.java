package com.capg.demo.jpa.repo;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.capg.demo.jpa.model.Student;



@Repository
public class StudnetRepo {
	
	@PersistenceContext
	EntityManager em;
	
	
	public Student addStudent(Student student) {
		
		Student tr=em.find(Student.class, student.getStudentId());
		if(tr!=null) {
			throw new RuntimeException("Student is present");
		}
		return em.merge(student);
		
	}

	
	public void deleteStudent(int studentId) {
		Student s=em.find(Student.class, studentId);
		if(s!=null){
		em.remove(s);
	}
	}
	public List<Student> findAllStudent(){
		
		Query q=em.createQuery("from Student");
	return	q.getResultList();
		
	}
	public Student findById(int studentId) {
		Student s=em.find(Student.class, studentId);
		return s;
	}


	
}



