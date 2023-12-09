package com.springcore.springcore.withoutconfig;

import org.springframework.stereotype.Component;

/**
 * @Component: way of creating java file to Bean
 * @author Saksham
 *
 */
public class Student {
	private String name;
	private int roll;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, int roll) {
		super();
		this.name = name;
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", roll=" + roll + "]";
	}
	

}
