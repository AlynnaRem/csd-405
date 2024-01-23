/*          
            Name: Alynna Rem
            Date: May 13th, 2022
            Assignment: Module 11 Multi Dimension Arrays
            File Name: MultiDimensionArrays.java
            Instructions:
            Write methods using the following headers that returns the location of the largest element in the array passed to the 
            method returning a one-dimensional array that contains two location elements.
                  public static int [] locateLargest (double [][] arrayParam)
                  public static int [] locateLargest (int [][] arrayParam)
            Then, write methods using the following headers that returns the location of the smallest element in the array passed 
            to the method returning a one-dimensional array that contains two location elements.
                  public static int [] locateSmallest (double [][] arrayParam)
                  public static int [] locateSmallest (int [][] arrayParam)
*/

import java.util.Scanner; // import java.util.scanner to enable user input

public class MultiDimensionArrays { // declare a class named MultiDimensionArrays

	public static void main(String[] args) { // declare main method to execute the program
        Scanner scan = new Scanner(System.in); // create a scanner for user input

        System.out.println("\n\n-- This program will create two arrays; the first array with integers and the second array with doubles. -- \n");

 
        System.out.print("Enter the number of rows for the integer array: "); //prompt user to enter number of rows for the int array
        int intRows = scan.nextInt(); // declare variable to store number of rows entered
        System.out.print("Enter the number of columns for the integer array: "); //prompt user to enter number of columns for the int array
        int intColumns = scan.nextInt(); // declare variable to store number of columns entered
        int [][] intArray = new int[intRows][intColumns]; // declare a two-dimensional integer array

        System.out.println("Enter the numbers in the integer array: "); // prompt user to enter the numbers in the integer array
        for (int i = 0; i < intArray.length; i++) { // iterate through each index of rows
            for (int j = 0; j < intArray[i].length; j++) { // iterate each index of columns
                intArray[i][j] = scan.nextInt();}} // read user's input and insert into array through each iteration
        for(int i = 0; i < intArray.length; ++i){ // iterate through each row
        	System.out.println("intArray[" + i + "] " + intArray[i]);} // the reference that will hold to the one-dimensional arrays that are in the multi-dimensional array
        System.out.println(); // print the array references

        for (int i = 0; i < intArray.length; i++) { // iterate through each index of rows
            for (int j = 0; j < intArray[i].length; j++) { // iterate through each index of columns
            	System.out.print("[" + i + "][" + j + "] = " + intArray[i][j] + " ");} // print multi-dimensional array
            System.out.println();}
        System.out.println();

        // declare a variable to pass the int array to the locateLargest method and return the location of the largest element.
        int[] large_int_location = locateLargest(intArray);
        System.out.printf("The location of the largest element is (%d, %d)%n", // print the location of the largest element in a one-dimensional array
            large_int_location[0], large_int_location[1]);
 
        // declare a variable to pass the int array to the locateSmallest method and return the location of the smallest element.
        int[] small_int_location = locateSmallest(intArray);
        System.out.printf("The location of the smallest element is (%d, %d)%n", // print the location of the largest element in a one-dimensional array
            small_int_location[0], small_int_location[1]);


        System.out.print("\n\nEnter the number of rows for the double array: "); // prompt user to enter number of rows for the double array
        int doubleRows = scan.nextInt(); // declare variable to store number of rows entered
        System.out.print("Enter the number of columns for the double array: "); // prompt user to enter number of columns for the double array
        int doubleColumns = scan.nextInt(); // declare variable to store number of columns entered
        double [][] doubleArray = new double[doubleRows][doubleColumns]; //declare a two-dimensional double array

        System.out.println("Enter the numbers in the double array: "); // prompt user to enter the numbers in the double array
        for (int i = 0; i < doubleArray.length; i++) { // iterate through each index of rows
            for (int j = 0; j < doubleArray[i].length; j++) { // iterate each index of columns
                doubleArray[i][j] = scan.nextDouble();}} // read user's input and insert into array through each iteration
        for(int i = 0; i < doubleArray.length; ++i){ // iterate through each row
        	System.out.println("doubleArray[" + i + "] " + doubleArray[i]);} // the reference that will hold to the one-dimensional array that is in the multi-dimensional array
        System.out.println(); // print array references

        for (int i = 0; i < doubleArray.length; i++) { // iterate through each index of rows
            for (int j = 0; j < doubleArray[i].length; j++) { // iterate through each index of columns
            	System.out.print("[" + i + "][" + j + "] = " + doubleArray[i][j] + " ");} // print multi-dimensional array
            System.out.println();}
        System.out.println();

        // declare a variable to pass the double array to the locateLargest method and return the location of the largest element.
        int[] large_double_location = locateLargest(doubleArray); 
        System.out.printf("The location of the largest element is (%d, %d)%n", // print the location of the largest element in a one-dimensional array
            large_double_location[0], large_double_location[1]);

        // declare a variable to pass the double array to the locateSmallest method and return the location of the smallest element.
        int[] small_double_location = locateSmallest(doubleArray); 
        System.out.printf("The location of the smallest element is (%d, %d)%n", // print the location of the largest element in a one-dimensional array
            small_double_location[0], small_double_location[1]);

        System.out.println("\nTerminating Program...\n");
    }


	public static int[] locateLargest(int [][] arrayParam) { // declare the locateLargest method for integers
		int [] large_int_location = new int[]{0, 0}; // declare int variable type for the location of the largest integer
        int largest = arrayParam[0][0]; // declare integer variable to hold the indexes for the largest element
        for (int i = 0; i < arrayParam.length; i++) { // iterate through rows
            for (int j = 0; j < arrayParam[i].length; j++) { // iterate through columns
                if (largest < arrayParam[i][j]) { // iterate through all values until the largest value is located
                    largest = arrayParam[i][j]; // assign the largest value to a variable 
                    large_int_location[0] = i; // get the row index of the largest value
                    large_int_location[1] = j; // get the column index of the largest value
                }
            }
        }
        return large_int_location; // return location of largest element when method is called.
    }

    public static int [] locateLargest (double [][] arrayParam) { // declare the locateLargest method for doubles
        int [] large_double_location = new int[]{0, 0}; // declare int variable type for location of largest double
        double largest = arrayParam[0][0]; // declare double variable to hold the indexes for the largest element
        for (int i = 0; i < arrayParam.length; i++) { // iterate through rows
            for (int j = 0; j < arrayParam[i].length; j++) { // iterate through columns
                if (largest < arrayParam[i][j]) { // iterate through all values until the largest value is located
                    largest = arrayParam[i][j]; // assign the largest value to a variable 
                    large_double_location[0] = i; // get the row index of the largest value
                    large_double_location[1] = j; // get the column index of the largest value
                }
            }
        }
        return large_double_location; // return location of largest element when method is called.
    }

    public static int [] locateSmallest (int [][] arrayParam) { // declare the locateSmallest method for integers
        int [] small_int_location = new int[]{0, 0}; // declare int variable type for location of the smallest integer
        int smallest = arrayParam[0][0]; // declare integer variable to hold the indexes for the smallest element
        for (int i = 0; i < arrayParam.length; i++) { // iterate through rows
            for (int j = 0; j < arrayParam[i].length; j++) { // iterate through columns
                if (smallest > arrayParam[i][j]) { // iterate through all values until the smallest value is located
                    smallest = arrayParam[i][j]; // assign the smallest value to a variable
                    small_int_location[0] = i; // get the row index of the smallest value
                    small_int_location[1] = j; // get the column index of the smallest value
                }
            }
        }
        return small_int_location; // return location of smallest element when method is called.
    }

    public static int [] locateSmallest (double [][] arrayParam) { // declare the locateSmallest method for doubles
        int [] small_double_location = new int[]{0, 0}; // declare double variable type for location of the smallest integer
        double smallest = arrayParam[0][0]; // declare integer variable to hold the indexes for the smallest element
        for (int i = 0; i < arrayParam.length; i++) { // iterate through rows
            for (int j = 0; j < arrayParam[i].length; j++) { // iterate through columns
                if (smallest > arrayParam[i][j]) { // iterate through all values until the smallest value is located
                    smallest = arrayParam[i][j]; // assign the smallest value to a variable
                    small_double_location[0] = i; // get the row index of the smallest value
                    small_double_location[1] = j; // get the column index of the smallest value
                }
            }
        }
        return small_double_location; // return location of smallest element when method is called.
    }
}

/* Reference:

"Java Data Types". W3 Schools. https://www.w3schools.com/java/java_data_types.asp. (N.D.) Accessed on March 27, 2022.
 Liang, Y. Daniel. (2015). Introduction to java programming and Data Structures: 12th Edition. Boston :Pearson.

 */