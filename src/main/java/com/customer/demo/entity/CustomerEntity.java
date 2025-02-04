package com.customer.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class CustomerEntity {
	
	
	
	@Id
	String name;
	String address;
	int moblie;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getMoblie() {
		return moblie;
	}
	public void setMoblie(int moblie) {
		this.moblie = moblie;
	}
	@Override
	public String toString() {
		return "CustomerEntity [name=" + name + ", address=" + address + ", moblie=" + moblie + "]";
	}
}