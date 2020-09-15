package com.cs122.assignments;

public class Activities {
	private String activityName;
	private int suggestedHours;
	private String locationType;
	
	public Activities(String name, int hours, String type) {
		activityName = name;
		suggestedHours = hours;
		locationType = type;
	}
	
	public String printActivity() {
		return "The " +locationType+ " activity " +activityName+ " is suggested for "
				+suggestedHours+" Hours";
	}
	
	public String preferredActivity(String activityPreferred) {
		return "I prefer " +activityPreferred+" over "+activityName;
	}
	
	public boolean getOddHours() {
		if((suggestedHours % 2) != 0)
			return true;
		else {
			return false;
		}
	}
}
