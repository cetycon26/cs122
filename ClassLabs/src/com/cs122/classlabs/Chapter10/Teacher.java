package com.cs122.classlabs.Chapter10;

public class Teacher implements Speaker{

	public void speak() {
		System.out.println("Today, I will teach computer programming");
	}
	
	public void announce(String str) {
		
	}
	
	public void question() {
		System.out.println("What is the difference between a static and non-static method?\n");
	}
}
