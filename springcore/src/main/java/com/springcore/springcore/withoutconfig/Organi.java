package com.springcore.springcore.withoutconfig;

public class Organi {
	private String organization;

	public Organi() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Organi(String organization) {
		super();
		this.organization = organization;
	}

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	@Override
	public String toString() {
		return "Organi [organization=" + organization + "]";
	}
	

}
