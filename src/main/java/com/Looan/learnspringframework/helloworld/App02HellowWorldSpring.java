package com.Looan.learnspringframework.helloworld;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HellowWorldSpring {

	public static void main(String[] args) {
		// Spring Context 실행

		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

		// Spring Framwork가 관리하도록 설정
		// HelloWorldConfiguration - @Configuration
		// name - @Bean
		System.out.println(context.getBean("name"));
		System.out.println(context.getBean("age"));
		System.out.println(context.getBean("person"));
		System.out.println(context.getBean("person2"));
		System.out.println(context.getBean("person3"));
		System.out.println(context.getBean("address2"));
		System.out.println(context.getBean(Address.class));

		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
	}
}