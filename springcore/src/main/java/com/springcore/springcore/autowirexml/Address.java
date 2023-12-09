package com.springcore.springcore.autowirexml;

public class Address {
	private String addressName;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(String addressName) {
		super();
		this.addressName = addressName;
	}

	public String getAddressName() {
		return addressName;
	}

	public void setAddressName(String addressName) {
		this.addressName = addressName;
	}

	@Override
	public String toString() {
		return "Address [addressName=" + addressName + "]";
	}
	
	

}
