package com.ganesh.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ganesh.entity.Student;


public interface StudentRepository extends JpaRepository<Student, Integer>{
	
	
	
	List<Student> findByName(String name);
	
	List<Student> findByCity(String city);
	
	List<Student> findByMarks(Double marks);

	List<Student> findByCourse(String course);
	
	List<Student> findByEmail(String email);
	
	List<Student> findByActive(Boolean active);
	
	
	
	
	
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
	
	
	
	
	
	 List<Student> findByNameAndCity(String name, String city);
		
	 List<Student> findByNameAndMarks(String name, Double marks);
		
	 List<Student> findByNameAndCourse(String name, String Course);	
		
	 List<Student> findByNameAndEmail(String name, String email);
		
   	 List<Student> findByCityAndMarks(String city, Double marks);
		
	 List<Student> findByCityAndCourse(String city, String course);	
		
	 List<Student> findByCityAndEmail(String city, String email);
		
	 List<Student> findByMarksAndCourse(Double marks, String course);
		
	 List<Student> findByMarksAndEmail(Double marks, String email);
		
	 List<Student> findByCourseAndEmail(String course, String email);
	 
	 
	 
	 
	 
	 
	 List<Student> findByMarksGreaterThan(Double marks);
	 
	 List<Student> findByMarksLessThan(Double marks);
	 
	 
	 
	 List<Student> findByMarksBetween(Double min, Double max);
	 
	 
	 
	 List<Student> findByNameLike(String name);
	 
	 
	 
	 List<Student> findByNameContaining(String name);
	 
	 
	 
	 @Query(value = "from Student")
	 List<Student> getAllStudents();
	 
	 
	 
	 @Query(value =  "select * from student where city=?1",nativeQuery = true)
	 List<Student> getByCity(String city);
		
	
	
	
	
	
   
	
}