package com.capg.demo.jpa.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capg.demo.jpa.model.Student;
import com.capg.demo.jpa.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService service;
	
	@PostMapping("/student")
	public Student addStudent(@RequestBody Student s) {
		return service.addStudnet(s);
		
	}
	@DeleteMapping("/student/{id}")
	public String  deleteStudent(@PathVariable("id") int studentId) {
		service.deleteStudent(studentId);
		return "student deleted sucessfully";
	}
	@GetMapping("/student")
	public List<Student> findAllStudent(){
	return	service.findAllStudent();
	}
	@GetMapping("/student/{id}")
public Student findById(@PathVariable("id") int studentId) {
	return service.findById(studentId);
	
}
	
	@PutMapping("/student")
	public Student updateTrainee(@RequestBody Student s) {
		return service.updateStudnet(s);
	}
}
