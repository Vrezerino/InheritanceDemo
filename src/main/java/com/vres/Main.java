package com.vres;

public class Main {

	public static void main(String[] args) {
		RegularCustomer michael = new RegularCustomer("Michael", 0, 20);
		System.out.println(michael.sound());

		VIPCustomer patrick = new VIPCustomer("Patrick", 100000, 5);
		System.out.println(patrick.sound());
		patrick.walk();
	}
}
