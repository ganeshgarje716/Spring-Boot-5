package com.ganesh;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ganesh.entity.Student;
import com.ganesh.repository.StudentRepository;

@SpringBootApplication
public class SpringBoot5Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot5Application.class, args);
	}

	
	@Autowired
	StudentRepository studentRepository;
	
	
	@Override
	public void run(String... args) throws Exception {
		
		

//		List<Student> name = studentRepository.findByName("Ganesh");
//		
//		name.forEach(i->System.err.println(i));
		
		
//		List<Student> city = studentRepository.findByCity("mumbai");
//		
//		city.forEach(i->System.err.println(i));
		
		
//		List<Student> marks = studentRepository.findByMarks(90.00);
//		
//		marks.forEach(i->System.err.println(i));
		
//		
//		List<Student> course = studentRepository.findByCourse("IT");
//		
//		course.forEach(i->System.err.println(i));
		
		
//		List<Student> email = studentRepository.findByEmail("ganesh@gmail.com");
//		
//		email.forEach(i->System.err.println(i));
		
		
       
		
		
//		List<Student> list = studentRepository.findByNameOrCity("Ganesh", "Pune");
//		
//		list.forEach(i->System.err.println(i));
		
		
//		List<Student> list = studentRepository.findByNameOrMarks("Priya", 80.00);
//		
//		list.forEach(i->System.err.println(i));
		
		
//		List<Student> list = studentRepository.findByNameOrCourse("Vikas", "Civil");
//		
//		list.forEach(i->System.err.println(i));
		
		
//		List<Student> list = studentRepository.findByNameOrEmail("Amit", "rohit@gmail.com");
//		
//		list.forEach(i->System.err.println(i));
		
		
//		List<Student> list = studentRepository.findByCityOrMarks("Beed", 77.00);
//		
//		list.forEach(i->System.err.println(i));
		
		
//		List<Student> list = studentRepository.findByCityOrCourse("Nagpur", "IT");
//		
//		list.forEach(i->System.err.println(i));
		
		
//		List<Student> list = studentRepository.findByCityOrEmail("Sangli", "meena@gmail.com");
//		
//		list.forEach(i->System.err.println(i));
		
		
//		List<Student> list = studentRepository.findByMarksOrCourse(83.5, "CS");
//		
//		list.forEach(i->System.err.println(i));
		
		
//		List<Student> list = studentRepository.findByMarksOrEmail(82.00, "rahul@gmail.com");
//		
//		list.forEach(i->System.err.println(i));
		
		
//		List<Student> list = studentRepository.findByCourseOrEmail("ENTC", "anjali@gmail.com");
//		
//		list.forEach(i->System.err.println(i)); 
		
		
		
		
		
		
		

		
		
		
		
	}

}
