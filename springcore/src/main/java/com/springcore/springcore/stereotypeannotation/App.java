package com.springcore.springcore.stereotypeannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/springcore/stereotypeannotation/config.xml");
		System.out.println("+++++++++++++++++++++++++++++++++++++++");
		Students students=context.getBean("students",Students.class);
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		System.out.println(students.toString());
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		Student1 student1=context.getBean("student1",Student1.class);
		System.out.println(student1.toString());
		System.out.println("+++++++++++++++++++++++++++++++++++++++++");
		System.out.println("will check the score of the bean !");
		System.out.println("score of students bean "+students.hashCode());
		
		Students studentsv1=context.getBean("students",Students.class);
		System.out.println("score of studentsv2 bean "+studentsv1.hashCode());
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("changed the score of the Student1 class");
		System.out.println("first time student1 bean hashcode is : "+student1.hashCode());
		Student1 student1v1=context.getBean("student1",Student1.class);
		System.out.println("second time student1 bean hashcode is : "+student1v1.hashCode());
		
		
	}

}
