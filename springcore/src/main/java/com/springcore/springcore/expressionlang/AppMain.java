package com.springcore.springcore.expressionlang;

import java.beans.Expression;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpression;


public class AppMain {
	public static void main(String[] args) throws Exception {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/springcore/expressionlang/config.xml");
		
		Demo demo=context.getBean("demo",Demo.class);
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		System.out.println(demo.toString());
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		
		
		Demo1 demo1=context.getBean("demo1",Demo1.class);
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		System.out.println(demo1.toString());
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		
		Demo3 demo3=context.getBean("demo3",Demo3.class);
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		System.out.println(demo3.toString());
		System.out.println("++++++++++++++++++++++++++++++++++++++++");


	}

}
