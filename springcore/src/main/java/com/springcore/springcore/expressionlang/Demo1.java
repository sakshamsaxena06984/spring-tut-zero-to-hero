package com.springcore.springcore.expressionlang;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * way of using static method in below code.
 * @Value("#{T(java.lang.Math).sqrt(25)}")
 * @Value("#{T(className).function(provideValue)}")
 * @author Saksham
 *
 */
@Component("demo1")
public class Demo1 {
	@Value("#{T(java.lang.Math).sqrt(25)}")
	private int a;
	@Value("#{T(java.lang.Math).E}")
	private int b;
	public Demo1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Demo1(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	@Override
	public String toString() {
		return "Demo1 [a=" + a + ", b=" + b + "]";
	}
	
	

}
