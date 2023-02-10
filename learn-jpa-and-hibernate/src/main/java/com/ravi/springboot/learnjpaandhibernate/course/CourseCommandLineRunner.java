package com.ravi.springboot.learnjpaandhibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ravi.springboot.learnjpaandhibernate.course.Course;
import com.ravi.springboot.learnjpaandhibernate.course.jdbc.CourseJdbcRepository;
import com.ravi.springboot.learnjpaandhibernate.course.jpa.CourseJpaRepository;
import com.ravi.springboot.learnjpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner{
	//@Autowired
	//private CourseJdbcRepository repository;
	
	//@Autowired
	//private CourseJpaRepository repository;
	
	@Autowired
	private CourseSpringDataJpaRepository repository;

	@Override
	public void run(String... args) throws Exception {
		
		repository.save(new Course(1, "Learn AWS JPA!!", "in28miutes"));
		repository.save(new Course(2, "Learn Azure Spring DataJPA!!", "in28miutes"));
		repository.save(new Course(3, "Learn Devops Spring dataJpa!!", "in28miutes"));
		
		repository.deleteById(1l);
		
		System.out.println(repository.findById(2l));
		System.out.println(repository.findById(3l));
		
		System.out.println(repository.findAll());
		System.out.println(repository.count());
		System.out.println(repository.findByAuthor("in28miutes"));
		System.out.println(repository.findByAuthor(""));
	}

}
