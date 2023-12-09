package com.springcore.springcore.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainCollege {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/springcore/constructorinjection/config.xml");
		College clg=(College) context.getBean("coll");
		System.out.println("---------------- coll bean info ---------------------");
		System.out.println(clg.toString());
		
	    University uni=(University) context.getBean("uni");
		System.out.println("---------------- uni bean info ---------------------");
		System.out.println(uni.toString());
		
		 ConstructorAm cnam=(ConstructorAm) context.getBean("cn");
			System.out.println("---------------- cn bean info ---------------------");
			System.out.println(cnam.toString());
	}

}
