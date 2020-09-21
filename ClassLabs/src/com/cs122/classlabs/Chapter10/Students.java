package com.cs122.classlabs.Chapter10;

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
	
	public boolean equals(Object other) {
		if(name.equals(((Students)other).getName()) && uid == ((Students)other).getID())
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
