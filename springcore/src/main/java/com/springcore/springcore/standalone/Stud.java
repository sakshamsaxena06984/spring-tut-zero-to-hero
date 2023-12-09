package com.springcore.springcore.standalone;

import java.util.List;

public class Stud {
	private int id;
	private List<String> names;
	public Stud() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Stud(int id, List<String> names) {
		super();
		this.id = id;
		this.names = names;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<String> getNames() {
		return names;
	}
	public void setNames(List<String> names) {
		this.names = names;
	}
	@Override
	public String toString() {
		return "Stud [id=" + id + ", names=" + names + "]";
	}
	

}
