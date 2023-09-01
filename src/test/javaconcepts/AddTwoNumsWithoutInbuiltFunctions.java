package test.javaconcepts;



	
	// Java Program to find the Sum of Two Numbers
	// Without Using any Arithmetic Operator
	 
	// Importing input output classes
	import java.io.*;
	 
	// Main class
	public class AddTwoNumsWithoutInbuiltFunctions {
	 
	    // Method to sum two integer elements
	    static int Sum(int a, int b)
	    {
	 
	        // Iterating until there is no carry
	        while (b != 0) {
	 
	            // Using AND operator
	            int carry = a & b;   
	            //---------> 8
	 
	            // Using XOR operator
	            a = a ^ b;
	            // -------> 6
	            // Shifting the carry by one so that
	            // adding it to the integer 'a'
	            // gives the desired output
	            b = carry << 1;
	        }
	        return a;
	    }
	 
	    // Method 2
	    // Main driver method
	    public static void main(String arg[])
	    {
	 
	        // Print the sum of custom integer numbers to be
	        // summed up passed as an arguments
	        System.out.println(Sum(10, 12));
	    }
	}

