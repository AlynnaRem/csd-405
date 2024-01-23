/*     
       Name: Alynna Rem
       Course: CSD-405
       Course Description: Intermediate Java Programming 
       Instructor: Darrell Payne
       File Name: LambdaTest.java
       Date: 07/10/2022
       Description of Program: The program below was provided by GeeksforGeeks.com as an example of how to use lambda expressions. Notes and names have been revised for clarify. 
*/


// Java program to demonstrate lambda expressions 
public class LambdaTest {

	// implement functional interface using lambda expressions
	interface FunctionalInterface1 {
        // two parameters
		int operation(int a, int b);
	}

	// sayMessage() is implemented using lambda expressions above
	interface FunctionalInterface2 {
		void sayMessage(String message);
	}

	// Performs FunctionalInterface1's operation on 'a' and 'b'
	private int operate(int a, int b, FunctionalInterface1 fobj) {
		return fobj.operation(a, b);
	}

    // Declare main method to execute the program for testing
	public static void main(String args[]) {

		// lambda expression to add two parameters
		// This expression implements 'FunctionalInterface1' interface
		FunctionalInterface1 add = (int x, int y) -> x + y;

		// lambda expression t multiply two parameters
		// This expression also implements 'FunctionalInterface1' interface
		FunctionalInterface1 multiply = (int x, int y) -> x * y;

		// Creating an object of Test to call operate using
		// different implementations using lambda Expressions
		LambdaTest tobj = new LambdaTest();

		// Add two numbers using lambda expression
		System.out.println("Addition is " + tobj.operate(6, 3, add));

		// Multiply two numbers using lambda expression
		System.out.println("Multiplication is " +tobj.operate(6, 3, multiply));

		// lambda expression for single parameter
		// This expression implements 'FunctionalInterface2' interface
		FunctionalInterface2 fobj = message ->System.out.println("Hello " + message);
		fobj.sayMessage("Professor Payne");
	}
}

// Reference: https://www.geeksforgeeks.org/lambda-expressions-java-8/