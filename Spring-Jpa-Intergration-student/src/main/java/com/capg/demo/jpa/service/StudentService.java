package com.capg.demo.jpa.service;

import java.rmi.StubNotFoundException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capg.demo.jpa.exception.StudentDoesNotExistsException;
import com.capg.demo.jpa.model.Student;
import com.capg.demo.jpa.repo.StudentJpaRepo;


@Service
public class StudentService {
	@Autowired
	//StudnetRepo repo;
	StudentJpaRepo repo;
	@Transactional
	public Student addStudnet(Student s) throws StubNotFoundException {
		if(repo.existsById(s.getStudentId())){
			throw new StubNotFoundException("student not found");
		}
	
	
	
		return repo.save(s);
		
		//return repo.addStudent(s);
	}
	@Transactional
	public void deleteStudent(int studentId) {
		
		repo.deleteById(studentId);
		//repo.deleteStudent(studentId);
	}
	
	public List<Student> findAllStudent(){
		return repo.findAll();
		//return repo.findAllStudent();
	}

	
	public Student findById(int studentId) throws StudentDoesNotExistsException {
		if(!repo.existsById(studentId)) {
			throw new StudentDoesNotExistsException("please enter a valid id");
		}
		else {
		return repo.getOne(studentId);
		}//return repo.findById(studentId);
		
	}
	public Student updateStudnet(Student student) {
		Student s=repo.getOne(student.getStudentId());
		s.setStudentName(student.getStudentName());
		s.setDob(student.getDob());
		
		return repo.save(s);
		
	}
	public Student findBystudentName(String studentName) {
		return repo.findByStudentName(studentName);
	}
	
	public Student findByIdAndFindByName(int studentId,String studentName) {
		return repo.findByStudentIdAndStudentName(studentId, studentName);
	}
	}

