package com.java.SpringDataJPAProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.java.SpringDataJPAProject.dao.IStudentRepo;
import com.java.SpringDataJPAProject.model.Student;

@SpringBootApplication
public class SpringDataJpaProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(SpringDataJpaProjectApplication.class, args);
		IStudentRepo repo = container.getBean(IStudentRepo.class);
		System.out.println(repo.getClass().getName());
		Student std = new Student(5,"Kochi","Meera");
		Student s1 = repo.save(std);
		System.out.println(s1);
		
		//repo.findById(1);
		//repo.existsById(2);
		//to retrive all records findAll() is used
		repo.findAll().forEach((s)->System.out.println(s));
		
		
		
		
	}

}
