package com.cs122.assignments;

public class Writer implements Speaker{

	public void speak() {
		System.out.println("To be or not to be-- that is the question");
	}
	
	public void announce(String str) {
		System.out.println(str);
	}
	
	public void write() {
		System.out.println("I will write 'The Tragedy of Macbeth'");
	}
}
