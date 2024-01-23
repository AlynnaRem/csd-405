/*
    Name: Alynna Rem
    Date: March 27th, 2022
    Assignment: Module 7
    File Name: Password_Validation.java

    Description: Some Websites impose certain rules for passwords. Write a method that checks whether a user's input String is a valid password. Suppose the password rules are as follows:
          A password must have at least eight characters.
          A password must contain both letters and digits.
          A password must contain at least one uppercase character.
          A password must contain at least one lowercase character.
*/
import java.util.Scanner; // import scanner to enable user input

// Declare a class named Password_Validation for user input and system output
public class Password_Validation {
	public static void main(String[] args) { // Declare the main method (entry point where the program begins execution)

		// Password criteria
		final int MAX = 8; // At least eight characters
		final int numDigits = 1; // At least one digit
		final int minUppercase = 1; // Minimum of one uppercase character
		final int minLowercase = 1; // Minimum of one lowercase character

		// Declare variables for password counters and set them equal to 0
		int digitCount = 0;
		int uppercaseCount = 0;
		int lowercaseCount = 0;

// Prompt the user to enter a password
Scanner input = new Scanner(System.in); // Create a Scanner for user input
System.out.print("Enter a password: ");
String password = input.nextLine(); // Assign and save the user's input to a variable named password.

		// Increment counters based on user's input     
        for (int i = 0; i < password.length(); i++ ) {
        	char c = password.charAt(i);
            if (Character.isUpperCase(c)) 
                uppercaseCount++;
            else if(Character.isLowerCase(c)) 
                lowercaseCount++;
            else if(Character.isDigit(c)) 
                digitCount++;
        }
    }

		// Print Valid Password if the user's input meet's the password criteria. If not, print the criteria missing.
		if (password.length() >= MAX); && digitCount >= numDigits && uppercaseCount >= minUppercase && lowercaseCount >= minLowercase) { 
			System.out.println("Valid Password");}
        else {
            System.out.println("Your password does not contain the following:");
            if(password.length() < MAX)
            	System.out.println("At least 8 characters");
            if (lowercaseCounter < minUppercase) 
                System.out.println("Minimum uppercase letters");
            if (uppercaseCounter < minLowercase) 
                System.out.println("Minimum lowercase letters");
            if(digitCounter < numDigits) 
                System.out.println("Minimum number of numeric digits");
        }
    }


