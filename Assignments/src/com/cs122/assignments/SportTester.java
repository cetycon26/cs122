package com.cs122.assignments;

public class SportTester {
	public static void main(String[] args) {
		Basketball LeBron= new Basketball("Basketball", "LeBron James", 25, 30, 11, 24);
		LeBron.stats();
		System.out.println();
		Football brady = new Football("Football", "Tom Brady", 234, 57, 38, 41);
		brady.stats();
		System.out.println();
	}
}
