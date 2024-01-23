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

public class Password_Validation { // Declare a class named Password_Validation
public static final int PASSWORD_LENGTH = 8; // Set the password length to eight digits
public static void main(String[] args) { // Declare the main method to execute the program

        Scanner input = new Scanner(System.in); // Create a scanner for user input
        // Print message to display the password criteria and prompt the user to enter a password
        System.out.print(
                "1. A password must have at least eight characters.\n" +
                "2. A password must contain both letters and digits.\n" +
                "3. A password must contain at least one uppercase character. \n" +
                "4. A password must contain at least one lowercase character. \n\n" +
                "Enter a password: ");
        // Assign the user's input to String s
        String s = input.nextLine();

        // Call to is_Valid_Password method to check if the password entered by the user meets the password criteria.
        if (is_Valid_Password(s)) {
            // If password is valid, print password is valid message
            System.out.println("Password is valid: " + s);
        } 
        else {
            // If password is invalid, print password is invalid message
            System.out.println("Not a valid password: " + s);
        }

    }
 
    // Declare a method called is_Valid_Password to check the password entered against the password criteria
    public static boolean is_Valid_Password(String password) {

        // If password length is less than PASSWORD_LENGTH (8), return false
        if (password.length() < PASSWORD_LENGTH) 
            return false;

        // Declare variables for uppercase, lowercase, and number counts and assign them to 0
        int uppercaseCount = 0;
        int lowercaseCount = 0;
        int numCount = 0;

        // loop if i = 0, stop if i is less than password length, increment i through each loop.
        for (int i = 0; i < password.length(); i++) {

            // Declare variable ch
            char ch = password.charAt(i);

            // increment count of numeric, uppercase, and lowercase based on characters in password entered and criteria of methods.
            if (is_Numeric(ch)) numCount++;
            else if (is_Uppercase(ch)) uppercaseCount++;
            else if (is_Lowercase(ch)) lowercaseCount++;
            else return false;
        }

        // return true if the password fits the following criteria
        return (uppercaseCount >= 1 && lowercaseCount >=1 && numCount >= 1);
    }

    // Declare a method named is_Uppercase to check for uppercase characters
    public static boolean is_Uppercase(char ch) {
        ch = Character.toUpperCase(ch);
        return (ch >= 'A' && ch <= 'Z');
    }

    // Declare a method named is_Lowercase to check for lowercase characters
    public static boolean is_Lowercase(char ch) {
        ch = Character.toLowerCase(ch);
        return (ch >= 'a' && ch <= 'z');
    }

    // Declare a method named is_Numeric to check for numeric characters
    public static boolean is_Numeric(char ch) {

        return (ch >= '0' && ch <= '9');
    }

}