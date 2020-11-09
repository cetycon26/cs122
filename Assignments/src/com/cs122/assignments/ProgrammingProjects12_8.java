package com.cs122.assignments;

public class ProgrammingProjects12_8 {
	

	public static int calcPascal(int n, int c) {
		int result = 0;
		if((c == 0) || c == n) {
			result = 1;
		}
		else
			result = calcPascal(n-1, c-1) + calcPascal(n-1, c);
		
		return result;
	}
	public static int[] pascal(int n) {
		int[][] triangle = new int[n][];
		int[] row = new int[n];
		int count = 0;
		if(count == 0 || count == n-1) {
			row[count] = 1;
			count++;
		}
		else {
			while(count < n-1) {
				row[count] = pascal()
				triangle[n-1][count] = row[count];
				count++;
			}
			
		}
		return row;
	}
	
	public static void main(String[] args) {
		int num = 4;
		for(int i = 0; i < num; i++) {
			System.out.print(pascal(num)[i] + "  ");
		}
	}
}
