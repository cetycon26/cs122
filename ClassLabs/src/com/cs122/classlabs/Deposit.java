package com.cs122.classlabs;

public class Deposit extends Account{

	private double interest;
	public Deposit(String name, double money, double interest) {
		super(name, money);
		this.interest = interest;
	}
	
	public double interest() {
		return interest;
	}
	public void balance() {
		System.out.println("Account: "+super.getOwner()+"\nBalance: "+super.getBalance()+
				"\nInterest: "+interest);
	}

	
	
}

