package com.cs122.classlabs;

public class Savings extends Account {

	private double limit;
	
	public Savings(String name, double balance, double limit) {
		super(name, balance);
		this.limit = limit;
	}
	
	public double limit() {
		return limit;
	}
	
	public void balance() {
		System.out.println("Account: "+super.getOwner()+"\nBalance: "+super.getBalance()+"\nLimit: "+limit);
	}
}
