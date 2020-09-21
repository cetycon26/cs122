package com.cs122.assignments;

public class Students implements Comparable<Students> {

	private int uid;
	private String name;
	
	public Students(int id, String name) {
		uid = id;
		this.name = name;
	}
	
	public String toString() {
		return "Student: "+name+"\nUID: "+uid;
	}
	
	public boolean equals(Students other) {
		if(this.equals(other))
			return true;
		
		return false;
	}
	
	public int compareTo(Students other) { //compares UID between students
		int result;
		if(uid == other.getID()) {
			result = 0;
		}
		else if(uid < other.getID())
			result = -1;
		else
			result = 1;
		
		return result;
	}
	
	public String getName() {
		return name;
	}
	
	public int getID() {
		return uid;
	}


}
