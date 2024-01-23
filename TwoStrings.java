// Alynna Rem. April 3rd, 2022. Module 4 Assignment.
/* This program will prompt the user to enter two strings, will check the strings entered 
and will report if either the first string is a substring of the second string, or if the second string is a substring of the first string.*/

// Import the Scanner class to enable user input.
import java.util.Scanner;

// Declare a public class named TwoStrings
public class TwoStrings{
	// Declare the main method to start the program.
	public static void main(String[]args){

		// Create a Scanner Object for user input.
		Scanner scan = new Scanner(System.in);

		// Display a message asking the user to input the first string.
		System.out.print("Enter a message: ");
        String s1 = scan.nextLine();

        // Display a message asking the user to input the second string.
        System.out.print("Enter another message: ");
        String s2 = scan.nextLine();
        
        // If s1 is a substring of s2, print s1 is a substring of s2.
        if (s1.indexOf(s2) != -1) {
            System.out.printf("%s is a substring of %s%n", s2, s1);}
        // Else if s2 is a substring of s1, print s2 is a substring of s1.
        else if (s2.indexOf(s1) != -1) {
        	System.out.printf("%s is a substring of %s%n", s1, s2);}
        // Else if s1 is not a substring of s2, print s1 is not a substring of s2.
        else {
            System.out.printf("%s is not a substring of %s%n and %s%n is not a substring of %s", s2, s1);}
        }
    }

/* References:
W3 Schools. "Java Strings". W3 Schools. https://www.w3schools.com/java/java_strings.asp. (N.D.). Accessed on Apr 3rd, 2022.
"Java Data Types". W3 Schools. https://www.w3schools.com/java/java_data_types.asp. (N.D.) Accessed on March 27, 2022.

Liang, Y. Daniel. (2015). Introduction to java programming and Data Structures: 12th Edition. Boston :Pearson. 
Wikipedia. "Rock paper scissors". Wikipedia. https://en.wikipedia.org/wiki/Rock_paper_scissors. Mar 24th, 2022. */

