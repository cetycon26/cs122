package com.cs122.classlabs;

public class Checkings extends Account{

	private double fees;
	
	public Checkings(String name, double balance, double fees) {
		super(name, balance);
		this.fees = 5.0;
	}
	
	public void balance() {
		System.out.println("Account: "+super.getOwner()+"\nBalance: "+super.getBalance()+
				"\nFees: "+fees);
	}
}
