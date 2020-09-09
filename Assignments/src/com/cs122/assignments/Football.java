package com.cs122.assignments;

public class Football extends Sports{

	private int yards;
	private int receive;
	private int fumbles;
	private int tackles;
	
	public Football(String name, String pop, int yards, int receives, int fumbles, int tackles) {
		super(name, pop);
		this.yards = yards;
		this.receive = receives;
		this.fumbles = fumbles;
		this.tackles = tackles;
	}

	public void stats() {
		stats2();
		System.out.println("Yards: "+yards+"\nReceives: "+receive+"\nFumbles: "+fumbles+"\nTackles: "+tackles);
	}
	
	
}
