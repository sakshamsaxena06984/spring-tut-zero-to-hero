package com.springcore.springcore.constructorinjection;


public class ConstructorAm {
	private int a;
	private int b;
	public ConstructorAm(int a, int b) {
		super();
		System.out.println("it is the integer constructor  and value of a "+a+" & value of b "+b);
		this.a = a;
		this.b = b;
	}
	
	public ConstructorAm(String a, String b) {
		super();
		System.out.println("it is string constructor! and value of a "+a+" & value of b "+b);
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
	}

	@Override
	public String toString() {
		return "ConstructorAm [a=" + a + ", b=" + b + "]";
	}
	
	

}
