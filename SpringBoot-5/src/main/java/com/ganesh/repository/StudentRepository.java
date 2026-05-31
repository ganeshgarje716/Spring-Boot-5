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
	
	
	
	
	List<Student> findByNameOrCity(String name, String city);
	
	List<Student> findByNameOrMarks(String name, Double marks);
	
	List<Student> findByNameOrCourse(String name, String Course);	
	
	List<Student> findByNameOrEmail(String name, String email);
	
	List<Student> findByCityOrMarks(String city, Double marks);
	
	List<Student> findByCityOrCourse(String city, String course);	
	
	List<Student> findByCityOrEmail(String city, String email);
	
	List<Student> findByMarksOrCourse(Double marks, String course);
	
	List<Student> findByMarksOrEmail(Double marks, String email);
	
	List<Student> findByCourseOrEmail(String course, String email);
	
	
	
	
	
	
   
	
}