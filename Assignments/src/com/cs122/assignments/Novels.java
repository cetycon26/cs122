package com.cs122.assignments;

public class Novels extends Books{
	
	private String mainCharacters;
	
	public Novels(String title, String author, String publisher, int issue, int pages, String characters) {
		super(title, author, publisher, issue, pages);
		mainCharacters = characters;
	}
	
	public void printInfo() {
		System.out.println("Title: "+title+"\nAuthor: "+author+"\nPublisher: "+publisher+
				"\nVolume/Issue #: "+volume+"\nPage Count: "+pageCount+
				"\nMain Characters: "+mainCharacters);
	}
}
