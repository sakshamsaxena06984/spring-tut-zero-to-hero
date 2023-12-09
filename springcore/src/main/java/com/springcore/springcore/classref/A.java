package com.springcore.springcore.classref;

public class A {
	private String valueA;

	public A() {
		super();
		// TODO Auto-generated constructor stub
	}

	public A(String valueA) {
		super();
		this.valueA = valueA;
	}

	public String getValueA() {
		return valueA;
	}

	public void setValueA(String valueA) {
		this.valueA = valueA;
	}

	@Override
	public String toString() {
		return "A [valueA=" + valueA + "]";
	}
	

}
