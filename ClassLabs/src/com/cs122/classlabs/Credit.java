package com.cs122.classlabs;

public class Credit extends Account{

	private double apr;
	
	public Credit(String name, double balance, double apr) {
		super(name, balance);
		this.apr = apr;
	}



	public double aprCalculate() {
		return apr;
	}
	public void balance() {
		System.out.println("Account: "+super.getOwner()+"\nBalance: "+super.getBalance()+
				"\nAPR: "+apr);
	}

}
