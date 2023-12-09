package com.springcore.springcore;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Emp {
	private String name;
	private List<String> tech;
	private Set<String> dept;
	private Map<String,String> cour;
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emp(String name, List<String> tech, Set<String> dept, Map<String, String> cour) {
		super();
		this.name = name;
		this.tech = tech;
		this.dept = dept;
		this.cour = cour;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getTech() {
		return tech;
	}
	public void setTech(List<String> tech) {
		this.tech = tech;
	}
	public Set<String> getDept() {
		return dept;
	}
	public void setDept(Set<String> dept) {
		this.dept = dept;
	}
	public Map<String, String> getCour() {
		return cour;
	}
	public void setCour(Map<String, String> cour) {
		this.cour = cour;
	}
	@Override
	public String toString() {
		return "Emp [name=" + name + ", tech=" + tech + ", dept=" + dept + ", cour=" + cour + "]";
	}
	
	

}
