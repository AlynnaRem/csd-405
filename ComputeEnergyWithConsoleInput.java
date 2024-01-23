// Alynna Rem. March 27th, 2022. Module 2 Programming Assignment.
/* The purpose of this program is to calculate the energy needed to heat water from an initial temperature to a final temperature. 
This program will prompt the user to enter the amount of water in kilograms, the initial temperature, and the final temperature of the water with the following formula:
Q = waterMass ( finalTemperature – initialTemperature ) x 4184
waterMass is water weight in kilograms
finalTemperature and initialTemperature are temperatures in Celsius
Q is the results in Joules */

// Import the Scanner class
import java.util.Scanner; 

// Declare a class named ComputeEnergyWithConsoleInput
public class ComputeEnergyWithConsoleInput {
    // Declare the main method (entry point where the program begins execution).
    public static void main (String[] args) { 
 
        //Display welcome message with name of calculator
        System.out.println("Welcome to the Energy Calculator!");
        
        //Create a Scanner Object for user input
        Scanner input = new Scanner(System.in);
        
        //Display a message to prompt the user to enter the amount of water in kilograms
        System.out.print("Enter the amount of water weight in kilograms: ");
        //Declare waterMass to be a double variable. Double primitive data type stores fractional numbers and is sufficient for storing 15 decimal digits.
        double waterMass = input.nextDouble();
        
        //Display a message to prompt the user to enter the initial temperature of the water in celsius
        System.out.print("Enter the initial temperature of the water in celsius: ");
        //Declare initialTemperature to be a double variable. Double primitive data type stores fractional numbers and is sufficient for storing 15 decimal digits.
        double initialTemperature = input.nextDouble();
        
        //Display a message to prompt the user to enter the desired temperature of the water
        System.out.print("Enter the desired temperature of the water in celsius: ");
        //Declare finalTemperature to be a double variable. Double primitive data type stores fractional numbers and is sufficient for storing 15 decimal digits.
        double finalTemperature = input.nextDouble();
        
        //Compute energy needed to heat water from the initial temperature to the final temperature based on water mass.
        //Declare energy to be a double variable. Double primitive data type stores fractional numbers and is sufficient for storing 15 decimal digits.
        double energy = (waterMass*(finalTemperature - initialTemperature))*4184;
        
        //Display results in a message to the user
        System.out.println("The amount of energy required to heat " + waterMass + " kilograms of water from " + initialTemperature + " celsius to " + finalTemperature + " celsius is " + energy + " joules.");
    }
}

/* Reference:

"Java Data Types". W3 Schools. https://www.w3schools.com/java/java_data_types.asp. (N.D.) Accessed on March 27, 2022.
 Liang, Y. Daniel. (2015). Introduction to java programming and Data Structures: 12th Edition. Boston :Pearson.

 

