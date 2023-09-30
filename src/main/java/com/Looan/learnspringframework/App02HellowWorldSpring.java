package com.Looan.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HellowWorldSpring {

	public static void main(String[] args) {
		// Spring Context 실행

		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

		// Spring Framwork가 관리하도록 설정
		// HelloWorldConfiguration - @Configuration
		// name - @Bean
		System.out.println(context.getBean("name"));

	}
}