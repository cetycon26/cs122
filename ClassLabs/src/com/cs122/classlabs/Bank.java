package com.cs122.classlabs;

public class Bank {

	private Account[] icu;
	
	public Bank() {

		icu = new Account[5];
		icu[0] = new Credit("Maria", 6000.0, 0.1452);
		icu[1] = new Deposit("Jack", 100.00, 0.5);
		icu[2] = new Checkings("Francis", 600.0, 500);
		icu[3] = new Savings("Christian", 1234, 500);
		icu[4] = new Savings("Jojo", 300, 500);
	}

	public void teller() {
		for(int i = 0; i < icu.length; i++) {
		icu[i].balance();
		}
	}
}
