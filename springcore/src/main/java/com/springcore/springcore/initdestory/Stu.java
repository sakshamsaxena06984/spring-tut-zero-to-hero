package com.springcore.springcore.initdestory;

public class Stu {
	private String name;
	private int roll;
	public Stu() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Stu(String name, int roll) {
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
		return "Stu [name=" + name + ", roll=" + roll + "]";
	}
	
	public void init() {
		System.out.println("it is the init methode of Stu class !");
	}
	
	public void destroy() {
		System.out.println("it is the destroy methode of Stu class !");
	}

}
