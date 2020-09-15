package com.cs122.assignments;

public class ActivitiesHelper {

	public static void main(String[] args) {
		Activities a = new Activities("Jogging", 1, "Outdoor");
		
		System.out.println(a.printActivity());
		System.out.println(a.preferredActivity("Basketball"));
		
		if(a.getOddHours() == true)
			System.out.println("Odd");
		else
			System.out.println("False");
	}

}
