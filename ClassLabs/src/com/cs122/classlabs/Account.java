package com.cs122.classlabs;

public abstract class Account {
	
	protected String owner;
	protected double balance;

	public Account(String name, double money) {
		owner = name;
		balance = money;
	}
	
	public abstract void balance();
	
	public String getOwner() {
		return owner;
	}
	public double getBalance() {
		return balance;
	}
}
