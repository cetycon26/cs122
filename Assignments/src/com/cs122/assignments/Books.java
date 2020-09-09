package com.cs122.assignments;

public class Books {
	protected String title;
	protected String author;
	protected String publisher;
	protected int volume;
	protected int pageCount;
	
	public Books(String title, String author, String publisher, int issue, int pages) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		volume = issue;
		pageCount = pages;
	}
	
	public void printInfo() {
		System.out.println("Title: "+title+"\nAuthor: "+author+"\nPublisher: "+publisher+
				"\nVolume/Issue #: "+volume+"\nPage Count: "+pageCount);
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String name) {
		title = name;
	}
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String name) {
		author = name;
	}
	
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String name) {
		publisher = name;
	}
	
	public int getVolume() {
		return volume;
	}
	public void setVolume(int issue) {
		volume = issue;
	}
	
	public int getPages() {
		return pageCount;
	}
	public void setPages(int pages) {
		pageCount = pages;
	}
}
