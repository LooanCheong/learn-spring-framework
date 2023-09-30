package com.Looan.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age) {
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
		return new Person("Jun", 24);
	}

	@Bean
	public Address address() {
		return new Address("Hawolgok", "Seoul");
	}
}
