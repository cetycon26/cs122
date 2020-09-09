package com.cs122.assignments;

public class Basketball extends Sports {

	private int points;
	private int rebounds;
	private int assists;
	private int steals;
	private int blocks;
	
	public Basketball(String sport, String athlete, int points, int rebounds, int assists, int steals) {
		super (sport, athlete);
		this.points = points;
		this.rebounds = rebounds;
		this.assists = assists;
		this.steals = steals;
	}
	
	public void stats() {
		super.stats2();
		System.out.println("Points: "+points+"\nRebounds: "+rebounds+"\nAssists: "+assists+"\nSteals: "+steals);
	}
}
