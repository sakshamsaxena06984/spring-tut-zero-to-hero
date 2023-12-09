package com.springcore.springcore.constructorinjection;

public class University {
	private String country;
	College clg;
	public University(String country, College clg) {
		super();
		this.country = country;
		this.clg = clg;
	}
	@Override
	public String toString() {
		return "University [country=" + country + ", clg=" + clg + "]";
	}
	
	

}
