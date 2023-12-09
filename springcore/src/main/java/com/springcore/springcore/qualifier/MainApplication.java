package com.springcore.springcore.qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/springcore/qualifier/config.xml");
		Parent parent=(Parent) context.getBean("par");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
		System.out.println(parent.toString());
	}

}
