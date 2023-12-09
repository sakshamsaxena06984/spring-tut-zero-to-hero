package com.springcore.springcore.autowirexml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAuto {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/springcore/autowirexml/autoconfig.xml");
		Emp emp=(Emp) context.getBean("emp");
		System.out.println(emp.toString());
	}

}
