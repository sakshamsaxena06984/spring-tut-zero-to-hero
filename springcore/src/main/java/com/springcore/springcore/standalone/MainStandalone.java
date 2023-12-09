package com.springcore.springcore.standalone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainStandalone {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/springcore/standalone/config.xml");
		
		Stud stud=(Stud) context.getBean("student");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("value of : "+stud.getClass().getName());
		System.out.println("value of : "+stud.getNames().getClass());
	}

}
