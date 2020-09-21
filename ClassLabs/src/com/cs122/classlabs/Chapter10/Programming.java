package com.cs122.classlabs.Chapter10;

public class Programming {

	public static void main(String[] args) {
		Students attendee, truant, present;
		Students[] roster = new Students[6];
		roster[0] = new Students(185121, "Madeline");
		roster[1] = new Students (189420, "Jacob");
		roster[2] = new Students(124645, "Christian");
		roster[3] = new Students(123456, "Emma");
		roster[4] = new Students(212834, "Jackie");
		roster[5] = new Students(214987, "Peter");
		
		Sorting<Students> sorted = new Sorting<Students>();
		sorted.insertionSort(roster);
		for(int i = 0; i < roster.length; i++) {
			System.out.println(roster[i]);
		}
		System.out.println();
		
		Searching<Students> searched = new Searching<Students>();
		attendee = new Students(214987, "Peter");
		present = searched.linearSearch(roster, attendee);
		if(present != null) {
			System.out.println(present.getName() + " is present");
		}
		else
			System.out.println(present.getName() + " is not present");
		
		truant = new Students(294831, "Ferris");
		present = searched.linearSearch(roster, truant);
		if(present != null) {
			System.out.println(truant.getName() + " is present");
		}
		else
			System.out.println(truant.getName() + " is not present");
	}
}
