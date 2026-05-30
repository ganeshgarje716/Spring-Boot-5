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
		
		
        List<Student> list = studentRepository.findByNameOrCity("Ganesh", "Pune");
		
		list.forEach(i->System.err.println(i));
		
		
		
		
		
	}

}
