package com.cs122.assignments;

public class Magazine extends Books{

	
	private String date;
	
	public Magazine(String title, String author, String publisher, int issue, int pages, String date) {
		super(title, author, publisher, issue, pages);
		this.date = date;
	}
	
	public void printInfo() {
		super.printInfo();
		System.out.println("Date Published: " + date);
	}
}
