package com.cs122.assignments;

import java.util.Scanner;
public class ProgrammingProjects12_1 {
//	PP 12.1 Design and implement a recursive version of the PalindromeTester program from Chapter 5
	public static boolean palindrome(String s) {
		if(s.length() == 0 || s.length() == 1) { //base case when the checked string has length 0 or 1
			return true;
		}
		if(s.charAt(0) == s.charAt(s.length()-1))
			return palindrome(s.substring(1, s.length()-1));
		
		return false;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String another = "y";
		while(another.equalsIgnoreCase("y")) {
			System.out.println("Enter a potential palindrome:");
			String str = scan.nextLine();
		
		
			if(palindrome(str)) 
				System.out.println("This is a palindrome");
			else
				System.out.println("This is not a palindrome");
		
			System.out.println("Check for another palindrome? (y/n)");
			another = scan.nextLine();
		}
		
	}
}
