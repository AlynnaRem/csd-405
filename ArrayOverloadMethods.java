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

public class ArrayOverloadMethods { // declare a class named ArrayOverloadMethods

    public static short average(Short[] array) { // declare a method for the array with the short data type.
     
        short sum = 0; // assign the variable sum to 0
        for (short value : array) // add the values in the array through each iteration
            sum += value;
        return (short) (sum / array.length); // calculate and return the average of the array
 }

    public static int average(Integer[] array) { // declare a method for the array with the integer data type
 
        int sum = 0;
        for (int value : array) // add the values in the array through each iteration
            sum += value;
        return sum / array.length; // calculate and return the average of the array
 }

    public static long average(Long[] array) { // declare a method for the array with the long data type

        long sum = 0L;
        for (long value : array) // add the values in the array through each iteration
            sum += value;
        return sum / array.length; // calculate and return the average of the array
 }

    public static double average(Double[] array) { // declare a method for the array with the double data type

        double sum = 0.0d;
        for (double value : array) // add the values in the array through each iteration
            sum += value;
        return sum / array.length; // calculate and return the average of the array     
 }

    public static void main(String args[]) { // declare the main method to execute the program
        Short[] short_array = {-10000, 10000, 20000}; // Initialize short array
        Integer [] integer_array = { 8, 1, 5, 3, 9 }; // Initialize integer array
        Long [] long_array = {2000000000L, 1000000000L}; // Initialize long array
        Double [] double_array = {5.5, 10.0, 30.0, 34.5}; // Initialize double array

        System.out.printf("\nThe short array contains the following values: "); // print message with short array values
        for (int i = 0; i < short_array.length; i++) {
            System.out.print(short_array[i] + " ");}
        System.out.println("\nThe average is: " + average(short_array)); // print message with short array average

        System.out.printf("\nThe integer array contains the following values: "); // print message with integer array values
        for (int i = 0; i < integer_array.length; i++) {
            System.out.print(integer_array[i] + " ");}
        System.out.println("\nThe average is: " + average(integer_array)); // print message with integer array average

        System.out.printf("\nThe long array contains the following values: "); // print message with long array values
        for (int i = 0; i < long_array.length; i++) {
            System.out.print(long_array[i] + " ");}
        System.out.println("\nThe average is: " + average(long_array)); // print message with long array average

        System.out.printf("\nThe double array contains the following values: "); // print message with double array values
        for (int i = 0; i < double_array.length; i++) {
            System.out.print(double_array[i] + " ");}
        System.out.println("\nThe average is: " + average(double_array)); // print message with double array average

}
}


/* References: 

"Java Data Types". W3 Schools. https://www.w3schools.com/java/java_data_types.asp. (N.D.) Accessed on March 27, 2022.
 Liang, Y. Daniel. (2015). Introduction to java programming and Data Structures: 12th Edition. Boston :Pearson.

 "Use overloaded methods to print array of different types in Java." Tutorials Point. (n.d.). Retrieved May 8, 2022, 
 from https://www.tutorialspoint.com/use-overloaded-methods-to-print-array-of-different-types-in-java 

 */