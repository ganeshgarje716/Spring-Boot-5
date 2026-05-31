package com.ganesh.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ganesh.entity.Student;


public interface StudentRepository extends JpaRepository<Student, Integer>{
	
	
	
	List<Student> findByName(String name);
	
	List<Student> findByCity(String city);
	
	List<Student> findByMarks(Double marks);

	List<Student> findByCourse(String course);
	
	List<Student> findByEmail(String email);
	
	

}