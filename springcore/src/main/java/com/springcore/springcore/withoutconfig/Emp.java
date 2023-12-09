package com.springcore.springcore.withoutconfig;

public class Emp {
	private String name;
	private Organi organi;
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emp(String name, Organi organi) {
		super();
		this.name = name;
		this.organi = organi;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Organi getOrgani() {
		return organi;
	}
	public void setOrgani(Organi organi) {
		this.organi = organi;
	}
	@Override
	public String toString() {
		return "Emp [name=" + name + ", organi=" + organi + "]";
	}
	

}
