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
		
//		List<Student> active = studentRepository.findByActive(true);
//		
//		active.forEach(i->System.err.println(i));
		
		
       
		
		
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
		
		
		
		
		
		
		
		
//		List<Student> list = studentRepository.findByNameOrCity("Ganesh", "Pune");
//		
//		list.forEach(i->System.err.println(i));
		
		
//		List<Student> list = studentRepository.findByNameAndMarks("Priya", 92.00);
//		
//		list.forEach(i->System.err.println(i));
		
		
//		List<Student> list = studentRepository.findByNameAndCourse("Vikas", "Civil");
//		
//		list.forEach(i->System.err.println(i));
		
		
//		List<Student> list = studentRepository.findByNameAndEmail("Amit", "amit@gmail.com");
//		
//		list.forEach(i->System.err.println(i));
		
		
//		List<Student> list = studentRepository.findByCityAndMarks("Beed", 74.50);
//		
//		list.forEach(i->System.err.println(i));
		
		
//		List<Student> list = studentRepository.findByCityAndCourse("Nagpur", "Civil");
//		
//		list.forEach(i->System.err.println(i));
		
		
//		List<Student> list = studentRepository.findByCityAndEmail("Jalgaon", "meena@gmail.com");
//		
//		list.forEach(i->System.err.println(i));
		
		
//		List<Student> list = studentRepository.findByMarksAndCourse(83.5, "Electrical");
//		
//		list.forEach(i->System.err.println(i));
		
		
//		List<Student> list = studentRepository.findByMarksAndEmail(82.00, "kiran@gmail.com");
//		
//		list.forEach(i->System.err.println(i));
		
		
//		List<Student> list = studentRepository.findByCourseAndEmail("ENTC", "tejas@gmail.com");
//		
//		list.forEach(i->System.err.println(i)); 
		
		
		
		
		
		
		
		
//		List<Student> list = studentRepository.findByMarksGreaterThan(85.00);
//		
//		list.forEach(i->System.err.println(i));
		
		
//        List<Student> list = studentRepository.findByMarksLessThan(85.00);
//		
//		list.forEach(i->System.err.println(i));
		
		
		
		
//		List<Student> list = studentRepository.findByMarksBetween(50.00, 80.00);
//		
//		list.forEach(i->System.err.println(i));
		
		
		
//		List<Student> list = studentRepository.findByNameLike("%a");
//		
//		list.forEach(i->System.err.println(i));
		
		
//		List<Student> list2 = studentRepository.findByNameLike("a%");
//		
//		list2.forEach(i->System.err.println(i));
		
		
		
//      List<Student> list2 = studentRepository.findByNameLike("_a%");
//		
//		list2.forEach(i->System.err.println(i));
		
		
//        List<Student> list2 = studentRepository.findByNameLike("%a_");
//		
//		list2.forEach(i->System.err.println(i));
		
		
		
//		List<Student> list = studentRepository.findByNameContaining("g");
//		
//		list.forEach(i->System.err.println(i));
		
		
		
		
//		List<Student> list = studentRepository.getAllStudents();
//		
//		list.forEach(i->System.err.println(i));
		
		
		
		List<Student> list = studentRepository.getByCity("Pune");
		
		list.forEach(i->System.err.println(i));
		
		
		

		
		
		
		
	}

}
