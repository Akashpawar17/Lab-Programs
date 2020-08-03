package com.capg.demo.resttemplate.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.capg.demo.resttemplate.model.Student;



@Controller
public class StudentController {
	
	
	@Autowired
	RestTemplate rest;
	
	@PostMapping("/addstudent")
	public String addStudent(@ModelAttribute Student s,Model m) {
	

		Student st=rest.postForObject("http://localhost:8885/student", s, Student.class);
		//System.out.println(st);
		m.addAttribute("student", st);
	return "success.jsp";
	}
	
	@GetMapping("/getstudent")
	public String getStudentById(@RequestParam("studentId") int studentId,Model m) {
		
	Student student=	rest.getForObject("http://localhost:8885/student/"+studentId, Student.class);
		
	
			m.addAttribute("student", student);
			return "show.jsp";
		
	}
	
	
	@PostMapping("/deletestudent")
	public String deleteStudentById(@RequestParam("studentId") int studentId,Model m) {
		
	rest.delete("http://localhost:8885/student/"+studentId);

	m.addAttribute("studentId", studentId);
		return "delete-student.jsp";
		
	}
	
	@GetMapping("/getStudentByName")
	public String getStudentByName(@RequestParam("studentName") String studentName,Model m) {
		
	Student student=	rest.getForObject("http://localhost:8885/student/"+studentName, Student.class);
		
	
			m.addAttribute("studentbyname", student);
			return "show.jsp";
		
	}
	
	}



	
	