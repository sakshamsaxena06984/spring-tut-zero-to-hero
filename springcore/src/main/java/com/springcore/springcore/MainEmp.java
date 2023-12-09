package com.springcore.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEmp {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("config2.xml");
		Emp e1=(Emp) context.getBean("emp1");
		System.out.println("---------------------- emp1 info -------------");
		System.out.println(e1.toString());
	}

}
