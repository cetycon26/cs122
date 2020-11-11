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
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Pascal line: ");
		int n = sc.nextInt();
		
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
		System.out.println(triangle[n-1]);
		
/*		THIS IS USED TO PRINT THE WHOLE TRIANGLE    */
//		for(int r=0; r<n; r++) {			
//			for(int c=0; c<r+1; c++) {
//				System.out.print(calcPascal(r,c) + " ");
//				if(c == r) {
//					System.out.println();
//				}
//			}
//		}
	}
	
}

