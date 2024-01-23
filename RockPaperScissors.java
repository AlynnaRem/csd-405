// Alynna Rem. April 3rd, 2022. Module 3 Assignment.
/* This program is similar to the game titled "Rock-Paper-Scissors."
This program will randomly generate a number of 1, 2, or 3 with 1 being Rock, 2 being Paper, and 3 being Scissors. 
Then this program will prompt the user to enter a value of 1, 2, or 3. Next, the program will display a clear readable 
message displaying both the computer's selection, the user's selection, and the results. */

// Import the Random class to enable random generation of a number.
import java.util.Random;
// Import the Scanner class to enable user input.
import java.util.Scanner;

// Declare a public class named RockPaperScissors.
public class RockPaperScissors {

	 // Declare the main method to start the program.
	public static void main(String[]args) {

		// Display a welcome message with name of this program.
        System.out.println("Welcome to Rock-Paper-Scissors!");

        // Get random input of 1, 2, or 3 from computer.
        Random random = new Random();
        int randomNumber = random.nextInt(3) + 1;

        // Create a Scanner Object for user input.
		Scanner scan = new Scanner(System.in);

        // Display a message to prompting the user to enter 1 for Rock, 2 for Paper, or 3 for Scissors.
        System.out.println("Make a move!");
        System.out.println("Enter 1 for Rock, 2 for Paper, or 3 for Scissors: ");
        int userMove = scan.nextInt();

        // Evaluate the user's input and print a message based on their input.
        if (userMove == 1) {
            System.out.println("You have chosen Rock!");}
        else if (userMove == 2) {
        	System.out.println("You have chosen Paper!");}
        else if (userMove == 3) {
        	System.out.println("You have chosen Scissors!");}

        // Compare userMove to randomNumber (computer input).
        // If userMove is the same as randomNumber, display message to the user: "It's a tie!"
        if (userMove == randomNumber) { 
            System.out.println("It's a tie!");
            System.out.println("");}
        // else if randomNumber is Rock and userMove is Scissors, display a message to the user: "The computer chose Rock!" and "Rock beats Scissors, so the computer wins!"
        else if (randomNumber == 1 && userMove == 3){
            System.out.println("The computer chose Rock!");
            System.out.println("Rock beats Scissors, so the computer wins!");}
        // else if randomNumber is Rock and userMove is Paper, display a message to the user: "The computer chose Rock!" and "Paper beats Rock, so you win!"
        else if (randomNumber == 1 && userMove == 2) {
            System.out.println("The computer chose Rock!");
            System.out.println("Paper beats Rock, so you win!");}
        // else if randomNumber is Paper and userMove is Scissors, display a message to the user: "The computer chose Paper!" and "Scissors beats Paper, so you win!"
        else if (randomNumber == 2 && userMove == 3) {
            System.out.println("The computer chose Paper!");
            System.out.println("Scissors beats Paper, so you win!");}
        // else if randomNumber is Paper and userMove is Rock, display a message to the user: "The computer chose Paper!" and "Paper beats Rock, so the computer wins!"
        else if (randomNumber == 2 && userMove == 1) {
            System.out.println("The computer chose Paper!");
            System.out.println("Paper beats Rock, so the computer wins!");}
        // else if randomNumber is Scissors and userMove is Rock, display a message to the user: "The computer chose Scissors!" and "Rock beats Scissors, so you win!"
        else if (randomNumber == 3 && userMove == 1) {
            System.out.println("The computer chose Scissors!");
            System.out.println("Rock beats Scissors, so you win!");}
        // else if randomNumber is Scissors and UserMove is Paper, display a message to the user: "The computer chose Scissors!" and "Scissors beats Paper, so the computer wins!"
        else if (randomNumber == 3 && userMove == 2) {
            System.out.println("The computer chose Scissors!");
            System.out.println("Scissors beats Paper, so the computer wins!");}
        }
    }

/* References:
Saomi, David. "How to code a simple Rock-Paper-Scissors game in Java".  Medium. https://medium.com/geekculture/how-to-code-a-simple-rock-paper-scissors-game-in-java-7ec5dda68be1. Nov. 22, 2021.
"Java Data Types". W3 Schools. https://www.w3schools.com/java/java_data_types.asp. (N.D.) Accessed on March 27, 2022.
 Liang, Y. Daniel. (2015). Introduction to java programming and Data Structures: 12th Edition. Boston :Pearson. 
Wikipedia. "Rock paper scissors". Wikipedia. https://en.wikipedia.org/wiki/Rock_paper_scissors. Mar 24th, 2022. */