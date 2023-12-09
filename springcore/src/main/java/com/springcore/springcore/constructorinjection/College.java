package com.springcore.springcore.constructorinjection;

public class College {
	private String name;
	private int classes;
	public College(String name, int classes) {
		super();
		this.name = name;
		this.classes = classes;
	}
	@Override
	public String toString() {
		return "College [name=" + name + ", classes=" + classes + "]";
	}
	
	

}
