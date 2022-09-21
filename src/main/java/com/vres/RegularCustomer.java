package com.vres;

import com.vres.Abstract.Customer;

public class RegularCustomer extends Customer {
	
	int credit;

	public RegularCustomer(String name, int balance, int credit, Customer friend) {
		super(name, balance, friend);
		this.credit = credit;
	}

	public RegularCustomer(String name, int balance, int credit) {
		this(name, balance, credit, null);
	}

	public String sound() {
		return "Hello";
	}
}
