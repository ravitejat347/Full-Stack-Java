package com.ravi.learnspringframework.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age, Address address) {};
record Address(String street, String city) {};

@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	public String name() { 
		return "Ravi";
	}
	
	@Bean
	public int age() { 
		return 26;
	}
	
	@Bean
	public Person person() {
		return new Person("Ram", 21, new Address("39 Main St","Binghamton"));
		
	}
	
	@Bean
	public Person person2MethodCall() {
		return new Person(name(), age(), address());
		
	}
	
	@Bean
	public Person person3Parameters(String name, int age, Address address2) {
		return new Person(name, age, address2);
		
	}
	
	@Bean(name = "address2")
	public Address address() {
		return new Address("39 Margaret St","Binghamton");
	}

}
