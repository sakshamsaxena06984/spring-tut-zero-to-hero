package com.springcore.springcore.autowire;

import org.springframework.beans.factory.annotation.Autowired;

public class Parent {
	@Autowired
	Stu stu;

	
	
	
	public Parent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Parent(Stu stu) {
		super();
		this.stu = stu;
	}

	public Stu getStu() {
		System.out.println("getter methode !");
		return stu;
	}

	public void setStu(Stu stu) {
		this.stu = stu;
	}

	@Override
	public String toString() {
		return "Parent [stu=" + stu + "]";
	}
	

}
