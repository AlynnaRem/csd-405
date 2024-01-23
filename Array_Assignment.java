/*   Name: Alynna Rem
     Date: 4/30/2022
     Assignment: Module 9 
     File Name: Array_Assignment.java
     Details: This program will read and fill an array with 20 integers. Using the array elements, 
              the following will be identified and displayed:
              1. The highest value entered.
              2. The lowest value entered.
              3. The average of the numbers entered.
              4. The sum of the numbers entered.
*/

import java.util.Scanner; // import java.util.scanner to enable user input

public class Array_Assignment{ // Delare a class named Arrays_Assignment
    public static void main(String [] args){ // Declare the main method to execute the program

    	System.out.println("-- This program will read the values entered, insert them into a list, identify the max and min values, and calculate the sum and average of the values. --"); // Display message to user
    	final int ARRAY_SIZE = 20; // Define variable ARRAY_SIZE with the integer data type and set it equal to 20
    	int [] array_1 = new int [ARRAY_SIZE]; // Declare an array named array_1 and set the size to the value of ARRAY_SIZE

    	
        /* Initialize the array, array_1, with user input values. */
    	Scanner input = new Scanner(System.in); // create a scanner for user input
        System.out.print ("\n Enter " + array_1.length + " values for your list and press enter after each value: \n"); // Display a message prompting the user to enter 20 values
        for(int i = 0; i < array_1.length; i++){ // loop through each index of the array
        	array_1[i] = input.nextInt(); // read and add user input to each index after each iteration of the loop
        }

        /* Print values entered */
        System.out.println("\n Here are the values in your list: \n"); // Display message
    	for (int i = 0; i < array_1.length; i++){ // loop through the array values
    		System.out.println(array_1[i]); // print the results of each iteration through the loop
    	}

        /* find the largest value entered and assign it the the variable, max */
    	int max = array_1[0]; // declare a variable, max, and assign the value to array index 0
    	for (int i = 1; i < array_1.length; i++){ // loop through all values of the array to find the largest value
    		if (array_1[i] > max) max = array_1[i]; // if the next value is greater than the last max, assign that value to the max variable
    	}
    	System.out.println("\n The max value in your list is: " + max + " \n"); // Display message with max value

    	/* find the lowest value entered and assign it to the variable, min */
    	int min = array_1[0]; // declare a variable, min, and assign the value to array index 0
    	for (int i = 1; i < array_1.length; i++){ // loop through all values of the array to find the smallest value
    		if (array_1[i] < min) min = array_1[i]; // if the next value is less than the min, assign that value to the min variable
        }
        System.out.println("\n The min value in your list is: " + min + " \n"); // Display message with min value

        /* calculate the sum of the values entered and assign it to the variable, total */
        int total = 0; // declare a variable, total, and assign the value to 0
        for (int i = 0; i < array_1.length; i++){ // loop through all values of the array
        	total += array_1[i]; // add the value through each iteration to the variable, total
        }
        System.out.println("\n The sum of the values in your list is: " + total + " \n"); // Display message with the sum

        /* calculate the average of the values entered and assign it to the variable, average */
        double average = ((double)total) / ((double)array_1.length); // calcuate the average of the values entered and assign the result to variable, average
        System.out.format("\n The average of the values in your list is: " + average + " \n"); // Display a message with the average
    }
}

/* Reference:

    "Java Data Types". W3 Schools. https://www.w3schools.com/java/java_data_types.asp. (N.D.) Accessed on March 27, 2022.
 Liang, Y. Daniel. (2015). Introduction to java programming and Data Structures: 12th Edition. Boston :Pearson.

 */