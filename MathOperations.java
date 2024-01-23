// Alynna Rem. April 10th, 2022. Module 5 Programming Assignment.
// The purpose of this program is to display math operations in smaller to larger order and then larger to smaller order with the denominator being 3 tthrough 99. This program will also display the mathematical results.
// 1/3 + 1/5 + 1/7 + ··· + 1/95 + 1/97 + 1/99
// 1/99 + 1/97 + 1/95 + ··· + 1/7 + 1/5 + 1/3

// Declare public class named MathOperations
import java.util.*;
public class MathOperations {
	// Declare the main method to begin executing the program
	public static void main(String[] args) {
		// Declare variable types and values for number, denominator, sum, and fraction.
		double number;
		double denominator;
		double sum;
		double fraction;
		number = 1;
		denominator = 3;
		fraction = number/denominator;
		// Set sum to .33333333, which is equivalent to 1/3
		sum = .33333333;
		// Create a list to add the fraction to after each increment.
		ArrayList<Double> Fractions = new ArrayList<Double>();
		// Add .33333333 as the first value in the Fractions list.
		Fractions.add(.33333333);
		// Continue loop if denominator is greater than or equal to 3 and less than or equal to 99.
		while(denominator >= 3 && denominator <=99) {
			// increment the denominator by 2 with each loop.
			denominator += 2;
			// add the number/denominator to the Fractions list after each increment
			Fractions.add(number/denominator);
			// add the number/denominator to the last sum with each loop
			sum += number/denominator;
		}

		// Print the list from smaller to larger denominators in a message and the mathematical results.
		System.out.println("The sum of the following values: "+ Fractions +" equals: "+ sum);
		// Reverse the order of the Fractions list.
		Collections.reverse(Fractions);
		// Print the list from larger to smaller denominators in a message and the mathematical results.
		System.out.println("The sum of the following values: "+ Fractions +" equals: "+ sum);
	}
}

//Reference:
//Java while loop. (n.d.). Retrieved April 10, 2022, from https://www.w3schools.com/java/java_while_loop.asp 
//"Java Data Types". W3 Schools. https://www.w3schools.com/java/java_data_types.asp. (N.D.) Accessed on March 27, 2022. Liang, Y. Daniel. (2015). Introduction to java programming and Data Structures: 12th Edition. Boston :Pearson.