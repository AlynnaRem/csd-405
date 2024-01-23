/*     Name: Alynna Rem
       Date: May 8th, 2022
       Assignment: Module 10
       Instructions:
       Write four overloaded methods that return the average of an array with the following headers:
       public static short average(short [] array)
       public static int average(int [] array)
       public static long average(long [] array)
       public static double average(double [] array)
       Description: This is a test program intended to invoke each of the methods created from the instructions 
       and display the average value returned along with a display of the original array elements. 
       Ensure the display is easy to read and understandable. 
       Lastly, each array sent into the methods must be of different sizes to ensure the method code is correctly written.
*/

import java.util.Scanner; // import java.util.scanner to enable user input

public class OverloadMethods { // declare a class named OverloadMethods

       public static short average(short [] array){

              final int ARRAY_SIZE = 4; // Define variable ARRAY_SIZE with the integer data type and set it equal to 20
              int [] array_1 = new int [ARRAY_SIZE]; // Declare an array named array_1 and set the size to the value of ARRAY_SIZE

              /* Initialize the array, array_1, with user input values. */
              Scanner input = new Scanner(System.in); // create a scanner for user input
              System.out.print ("\n Enter " + array_1.length + " short values for your list and press enter after each value: \n"); // Display a message prompting the user to enter 20 values
        
              for(int i = 0; i < array_1.length; i++){ // loop through each index of the array
                     array_1[i] = input.nextShort(); // read and add user input to each index after each iteration of the loop

              /* calculate the average of the values entered and assign it to the variable, average */
              double average = ((double)total) / ((double)array_1.length); // calcuate the average of the values entered and assign the result to variable, average
              System.out.format("\n The average of the values in your list is: " + average + " \n"); // Display a message with the average

              /* Print values entered */
              System.out.println("\n Here are the values in your list: \n"); // Display message
              for (int i = 0; i < array_1.length; i++){ // loop through the array values
                     System.out.println(array_1[i]); // print the results of each iteration through the loop
              }
      
    
       public static int average(int[] array) {
              /* Initialize the array, array_1, with user input values. */
              Scanner input = new Scanner(System.in); // create a scanner for user input
              System.out.print ("\n Enter " + array_1.length + " int values for your list and press enter after each value: \n"); // Display a message prompting the user to enter 20 values
        
              for(int i = 0; i < array_1.length; i++){ // loop through each index of the array
                         array_1[i] = input.nextInt(); // read and add user input to each index after each iteration of the loop

              /* calculate the average of the values entered and assign it to the variable, average */
              double average = ((double)total) / ((double)array_1.length); // calcuate the average of the values entered and assign the result to variable, average
              System.out.format("\n The average of the values in your list is: " + average + " \n"); // Display a message with the average

              /* Print values entered */
              System.out.println("\n Here are the values in your list: \n"); // Display message
              for (int i = 0; i < array_1.length; i++){ // loop through the array values
                     System.out.println(array_1[i]); // print the results of each iteration through the loop
                  }

       public static long average(long [] array){
              /* Initialize the array, array_1, with user input values. */
              Scanner input = new Scanner(System.in); // create a scanner for user input
              System.out.print ("\n Enter " + array_1.length + " long values for your list and press enter after each value: \n"); // Display a message prompting the user to enter 20 values
        
              for(int i = 0; i < array_1.length; i++){ // loop through each index of the array
                     array_1[i] = input.nextLong(); // read and add user input to each index after each iteration of the loop

              /* calculate the average of the values entered and assign it to the variable, average */
              double average = ((double)total) / ((double)array_1.length); // calcuate the average of the values entered and assign the result to variable, average
              System.out.format("\n The average of the values in your list is: " + average + " \n"); // Display a message with the average

              /* Print values entered */
              System.out.println("\n Here are the values in your list: \n"); // Display message
              for (int i = 0; i < array_1.length; i++){ // loop through the array values
                     System.out.println(array_1[i]); // print the results of each iteration through the loop

                  }

       public static double average(double[] array) {
              /* Initialize the array, array_1, with user input values. */
              Scanner input = new Scanner(System.in); // create a scanner for user input
              System.out.print ("\n Enter " + array_1.length + " short values for your list and press enter after each value: \n"); // Display a message prompting the user to enter 20 values
        
              for(int i = 0; i < array_1.length; i++){ // loop through each index of the array
                     array_1[i] = input.nextDouble(); // read and add user input to each index after each iteration of the loop

              /* calculate the average of the values entered and assign it to the variable, average */
              double average = ((double)total) / ((double)array_1.length); // calcuate the average of the values entered and assign the result to variable, average
              System.out.format("\n The average of the values in your list is: " + average + " \n"); // Display a message with the average

              /* Print values entered */
              System.out.println("\n Here are the values in your list: \n"); // Display message
              for (int i = 0; i < array_1.length; i++){ // loop through the array values
                     System.out.println(array_1[i]); // print the results of each iteration through the loop
                  }
           }
    }

       
/* Reference:

"Java Data Types". W3 Schools. https://www.w3schools.com/java/java_data_types.asp. (N.D.) Accessed on March 27, 2022.
 Liang, Y. Daniel. (2015). Introduction to java programming and Data Structures: 12th Edition. Boston :Pearson.

*/