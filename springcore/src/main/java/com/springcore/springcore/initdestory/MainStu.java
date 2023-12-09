package com.springcore.springcore.initdestory;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainStu {
	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/springcore/initdestory/config.xml");
		
		Stu ms=(Stu) context.getBean("stud");
		System.out.println(ms.toString());
		context.registerShutdownHook();
	}

}
