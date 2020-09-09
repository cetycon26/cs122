package com.cs122.assignments;

public class Textbook extends Books {

	private String bookType;
	
	public Textbook(String title, String author, String publisher, int issue, int pages, String type) {
		super(title, author, publisher, issue, pages);
		bookType = type;
	}
	
	public void printInfo() {
		super.printInfo();
		System.out.println("Book Type: " + bookType);
	}
}
