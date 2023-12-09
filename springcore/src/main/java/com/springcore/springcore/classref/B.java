package com.springcore.springcore.classref;

public class B {
	private String valueB;
	A a;
	public B() {
		super();
		// TODO Auto-generated constructor stub
	}
	public B(String valueB, A a) {
		super();
		this.valueB = valueB;
		this.a = a;
	}
	public String getValueB() {
		return valueB;
	}
	public void setValueB(String valueB) {
		this.valueB = valueB;
	}
	public A getA() {
		return a;
	}
	public void setA(A a) {
		this.a = a;
	}
	@Override
	public String toString() {
		return "B [valueB=" + valueB + ", a=" + a + "]";
	}
	

}
