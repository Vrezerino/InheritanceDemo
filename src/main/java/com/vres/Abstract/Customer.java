package com.vres.Abstract;

public abstract class Customer implements Human {

	String name;
	int balance;
	Customer friend;

	public Customer(String name, int balance, Customer friend) {
		this.name = name;
		this.balance = balance;
		this.friend = friend;
	}

	public Customer(String name, int balance) {
		this(name, balance, null);
	}

	public abstract String sound();

	public String getName() {
		return name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int bal) {
		balance = bal;
	}

	public void walk() {
		System.out.println("I'm walking alright");
	}

	public void talk() {
		System.out.println("I'm talking alright");
	}

	public Object getFriend() {
		return friend;
	}

}
