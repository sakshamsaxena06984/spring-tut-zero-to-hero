package com.springcore.springcore.expressionlang;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo3 {
	@Value("#{new java.lang.String('hello world')}")
	private String val;

	public Demo3() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Demo3(String val) {
		super();
		this.val = val;
	}

	public String getVal() {
		return val;
	}

	public void setVal(String val) {
		this.val = val;
	}

	@Override
	public String toString() {
		return "Demo3 [val=" + val + "]";
	}
	

}
