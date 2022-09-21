package com.vres;

import java.util.ArrayList;

import com.vres.Abstract.Customer;

public class VIPCustomer extends Customer {
	
	int credit;
	ArrayList<String> privileges;

	public VIPCustomer(String name, int balance, int credit) {
		super(name, balance);
		this.credit = credit;
		privileges = new ArrayList<String>();
	}

	public void newPrivilege(String privilege) {
		privileges.add(privilege);
	}

	public ArrayList<String> showPrivileges () {
		return privileges;
	}

	public String sound() {
		return privileges.size() > 0 ? "Eyyy!" : "Hi, I'm a new VIP";
	}
}
