package com.capg.demo.jpa.controller;
import java.rmi.StubNotFoundException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capg.demo.jpa.exception.StudentDoesNotExistsException;
import com.capg.demo.jpa.model.Student;
import com.capg.demo.jpa.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService service;
	
	@PostMapping("/student")
	public Student addStudent(@RequestBody Student s) throws StubNotFoundException {
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
public Student findById(@PathVariable("id") int studentId) throws StudentDoesNotExistsException {
	return service.findById(studentId);
	
}
	
	@PutMapping("/student")
	public Student updateTrainee(@RequestBody Student s) {
		return service.updateStudnet(s);
	}
	
	@GetMapping("/students/{studentName}")
	public Student findByStudentName(@PathVariable String studentName) {
		
		
		return service.findBystudentName(studentName);
	}
	@GetMapping("/student/{studentId}/{studentName}")
	public Student findByIdAndName(@PathVariable int studentId,@PathVariable String studentName) {
return service.findByIdAndFindByName(studentId, studentName);
	
	}
}
