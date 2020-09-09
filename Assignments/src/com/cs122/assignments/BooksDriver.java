package com.cs122.assignments;

public class BooksDriver {

	public static void main(String[] args) {
		System.out.println("Welcome to Pace University Library!\nCheckout:\n");
		
		Novels legend = new Novels("Legend", "Marie Lu", "Penguin", 1, 328, "Day, June");
		legend.printInfo();
		System.out.println();
		
		NewspaperArticle NYTimes = new NewspaperArticle("College Quarantine Breakdowns Leave Some at Risk", "Natasha Singer", "New York Times", 0, 3);
		NYTimes.printInfo();
		System.out.println();
		
		Textbook cs122 = new Textbook("Java Software Solutions: Foundations of Program Design",
				"John Lewis; William Loftus", "Pearson", 9, 1772, "eBook");
		cs122.printInfo();
		System.out.println();
		
		Magazine time = new Magazine("The 35 Most Anticipated Movies of Fall 2020", "Andrew R. Chow; Megan McCluskey", 
				"Time Magazine", 0, 25, "September 9, 2020");
		time.printInfo();
		System.out.println();
	}

}
