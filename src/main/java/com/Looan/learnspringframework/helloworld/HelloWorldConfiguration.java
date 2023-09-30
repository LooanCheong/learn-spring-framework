package com.Looan.learnspringframework.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age, Address address) {
};

record Address(String firtsLine, String city) {
};

@Configuration
public class HelloWorldConfiguration {

	@Bean
	public String name() {
		return "Looan";
	}

	@Bean
	public int age() {
		return 24;
	}

	@Bean
	public Person person() {
		return new Person("Jun", 24, new Address("Wolgok", "Seoul"));
	}

	@Bean(name = "person2")
	public Person person2MethodCall(String name, int age, Address address2) {
		return new Person(name, age, address2);
	}

	@Bean(name = "person3")
	public Person person3Parameters() {
		return new Person(name(), age(), address());
	}

	@Bean(name = "address2")
	public Address address() {
		return new Address("Hawolgok", "Seoul");
	}
}
