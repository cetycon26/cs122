package com.cs122.assignments;

public class Sports {

	protected String sport;
	protected String athlete;
	

	
	public Sports(String name, String pop) {
		// TODO Auto-generated constructor stub
		this.sport = name;
		this.athlete = pop;
	}

	
	public void stats2() {
		System.out.println("Sport: "+sport+"\nAthlete: "+athlete+"\n");
	}
}
