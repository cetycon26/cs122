package com.cs122.assignments;

import java.util.Scanner;

public class ProgrammingProjects12_8 {
	

	public static int calcPascal(int r, int c) {
		int result = 0;
		if((c == 0) || c == r) {
			result = 1;
		}
		else
			result = calcPascal(r-1, c-1) + calcPascal(r-1, c);
		
		return result;
	}
	
	public static String[] printPascal(int n) {
		String[] triangle = new String[n];
		String row = "";
		for(int r=0; r<n; r++) {
			for(int c=0; c<r+1; c++) {
				row += calcPascal(r,c) + " ";
				if(c == r) {
					triangle[r] = row;
					row = "";
				}
			}
		}
		return triangle;
	}
	
	public static String printTriangle(int n) {
		String space = " ";
		String triangle = "";
//		int count = 0;
		
		for(int r=0; r<n; r++) {
//			while(count<n) {
//				triangle += space;
//			}
			for(int c=0; c<r+1; c++) {
				triangle += calcPascal(r,c) + " ";
				if(c == r) {
					triangle += "\n";
				}
			}
		}
		return triangle;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Pascal line: ");
		int n = sc.nextInt();
		
		System.out.println(printPascal(n)[n-1]);
		System.out.println();
		
		System.out.println("Pascal Triangle: ");
		System.out.println(printTriangle(n));
		
	}
}

