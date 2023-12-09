package com.springcore.springcore.stereotypeannotation;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
/*
 * below, changed the scope of bean
 */
@Component("student1")
@Scope("prototype")
public class Student1 {
	
	@Value("hello2")
	private String name;
	@Value("#{temp}")
	private List<String> add;
	public Student1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student1(String name, List<String> add) {
		super();
		this.name = name;
		this.add = add;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getAdd() {
		return add;
	}
	public void setAdd(List<String> add) {
		this.add = add;
	}
	@Override
	public String toString() {
		return "Student1 [name=" + name + ", add=" + add + "]";
	}
	

}
