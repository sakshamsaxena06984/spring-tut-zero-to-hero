package com.springcore.springcore.withoutconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainWithoutConfig {
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
		
//		Student student=context.getBean("student",Student.class);
//		System.out.println("++++++++++++++++++++++++++++++++++++++++++");
//		System.out.println(student.toString());
//		

		Student student=context.getBean("getStudent",Student.class);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++");
		System.out.println(student.toString());
		
		Emp emp=context.getBean("getEmp",Emp.class);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++");
		System.out.println(emp.toString());
		
		
	}

}
