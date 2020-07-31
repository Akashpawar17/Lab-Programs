package com.capg.demo.jpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.demo.jpa.model.Student;

public interface StudentJpaRepo extends JpaRepository<Student, Integer> {

}
