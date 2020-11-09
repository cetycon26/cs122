package com.cs122.assignments;

public class Nov9Exercises {
//	EX 12.2 Write a recursive definition of xy (x raised to the power y), where x and y are integers and y > 0.

//	My solution:
//	x^y = x when y = 1 (base case); else x^y = x^(y-1) * x
// I hope this answer is sufficient since this is the best way I could write this on Eclipse
	
//EX 12.7 Write a recursive method to reverse a string. Explain why you would not normally use recursion to solve this problem.

//	public static String reverse(String string) {
//		String reversed = string.substring(string.length()-1);
//		if(string.length() == 1)
//			return string.substring(0);
//		else {
//			return reversed + reverse(string.substring(0, string.length()-1));
//		}
//	}
	public static String reverseString(String str)
    {
        if (str.isEmpty())
            return str;
        //Calling Function Recursively
        return reverseString(str.substring(1)) + str.charAt(0);
    }
//	I would not normally use recursion for this because I could easily use a for-loop to achieve this 
//	method's function. Loops make the code more readable and easier to test/debug.
		
	public static void main(String[] args) { //used to test EX 12.7 code
		

		String a = new String("Apple");
		String reversed = reverseString(a);
		System.out.println(reversed);
	}
}
