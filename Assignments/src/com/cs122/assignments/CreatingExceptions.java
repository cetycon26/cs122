package com.cs122.assignments;




import java.util.Scanner;

public class CreatingExceptions
{
    //-----------------------------------------------------------------
    //  Creates an exception object and possibly throws it.
    //-----------------------------------------------------------------
    public static void main(String[] args) throws StringTooLong, UpperCaseAtSixException
    {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a string");
        String a = scan.nextLine();
        try {
        if (a.length() > 6)
            throw new StringTooLong("String too long");
        }
        catch (StringTooLong e) {
        	System.out.println("This string is too long");
        }
        
        System.out.println("Enter a string");
        String b = scan.nextLine();
        try {
        	if(Character.isUpperCase(b.charAt(5)))
        		throw new UpperCaseAtSixException("Char at index 6 is uppercase");
        }
        catch (UpperCaseAtSixException e) {
        	System.out.println("Sixth car cannot be uppercase");
        }

        System.out.println("End of main method.");  // may never reach
    }
}
