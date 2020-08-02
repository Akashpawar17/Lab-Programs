package com.capg.demo.jpa.service;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capg.demo.jpa.exception.DateNotFoundException;
import com.capg.demo.jpa.exception.StudentDoesNotExistsException;
import com.capg.demo.jpa.exception.StudentNotFoundException;
import com.capg.demo.jpa.model.Student;
import com.capg.demo.jpa.repo.StudentJpaRepo;

@Service
public class StudentService {
	@Autowired
	// StudnetRepo repo;
	StudentJpaRepo repo;

	@Transactional
	public Student addStudnet(Student s) throws StudentDoesNotExistsException, DateNotFoundException {

		LocalDate date = LocalDate.now();
		// date.getYear();
		// Period p=Period.ofYears(2000);

		Period p = Period.between(s.getDob(), date);
		if (p.getYears() < 20) {
			throw new DateNotFoundException("student dob should be atleast 20");
		}
		if (repo.existsById(s.getStudentId())) {
			throw new StudentDoesNotExistsException("Student with this " + s.getStudentId() + "is already present");
		}

		return repo.save(s);

		// return repo.addStudent(s);
	}

	@Transactional
	public void deleteStudent(int studentId) {

		if (!repo.existsById(studentId)) {
			throw new StudentNotFoundException("Student  with id:" + studentId + "Not Found");
		}
		repo.deleteById(studentId);

	}

	public List<Student> findAllStudent() {
		return repo.findAll();
		// return repo.findAllStudent();
	}

	public Student findById(int studentId) {
		if (!repo.existsById(studentId)) {
			throw new StudentNotFoundException("student with id" + studentId + "not found");
		} else {
			return repo.getOne(studentId);
		} // return repo.findById(studentId);

	}

	public Student updateStudnet(Student student) {
		Student s = repo.getOne(student.getStudentId());
		if (s == null) {
			throw new StudentNotFoundException("student with id " + student.getStudentId() + "not found");

		}
		s.setStudentName(student.getStudentName());
		s.setDob(student.getDob());

		return repo.save(s);

	}

	public Student findBystudentName(String studentName) {

		Student s = repo.findByStudentName(studentName);
		if (s == null) {
			throw new StudentNotFoundException("student with name" + studentName + "not found");
		}
		return s;
	}

	public Student findByIdAndFindByName(int studentId, String studentName) {
		Student s1 = repo.findByStudentIdAndStudentName(studentId, studentName);
		if (s1 == null) {
			throw new StudentNotFoundException("student with id and name" + studentId + "" + studentName + "not found");
		}
		return s1;
	}
}
