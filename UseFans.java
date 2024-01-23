/*     
       Name: Alynna Rem
       Course: CSD-405
       Course Description: Intermediate Java Programming 
       Instructor: Darrell Payne
       File Name: UseFans.java
       Date: 7/23/2022
       Assignment: Module 12 (Redo UseFans.java from Module 2)
       Instructions: 
             Starting with your code from Module 1 create the following new class titled UseFans:
                 1. Create a collection of Fan instances.
                 2. Create a method taking a collection of Fan instances for displaying without using the toString() method.
                 3. Create a method that takes a single instance of a Fan for displaying without using the toString() method.
                 4. Use the this reference throughout the Fan class where allowed.
                 5. Write test code that creates a collection of Fans and displays the functionality of all of the Fan instances in the collection.

*/

import java.util.*;

public class UseFans{

    // Declare main method to execute the program for testing
    public static void main(String[] args) {

        // Create two Fan objects/instances
		Fan fan1 = new Fan();
		Fan fan2 = new Fan();

        // Use the default constructor
		fan1.getSpeed();
		fan1.getRadius();
		fan1.getColor();
		fan1.isOff();

        // Use the argument constructor
        fan2.setSpeed(Fan.FAST);
        fan2.setRadius(4);
        fan2.setColor("black");
        fan2.setOff(false);
        
        // Create a collection of fan instances
        UseFans f1_2 = new UseFans();
        Fan collection[] = new Fan[2];

        collection[0] = fan1; // add fan1 to the collection
        collection[1] = fan2; // add fan2 to the collection

        /* loop through each instance of the collection and call to the printFanCollection method 
        to display the parameters in a message */
        for(int i = 0; i < collection.length; ++i){
            
            if (i == 0){ // if i = 0, print Fan Collection and Fan 1:
            System.out.println("\n --- Fan Collection ---");
            System.out.println("\nFan 1: ");
            }
            
            else { // else, print Fan 2:
            System.out.println("\nFan 2: ");
            }

            f1_2.printFanCollection(collection[i]);
            }
        
        /* pass the index of a single instance to the printFan method to display the parameters 
        for a single instances in a message */
        f1_2.printFan(collection[1]);
    }

    // Declare a method to print all fan instances in the collection
    public void printFanCollection(Fan collection){

        System.out.println("Speed = " + collection.getSpeed());
        System.out.println("Radius = " + collection.getRadius());
        System.out.println("Color = " + collection.getColor());
        System.out.println("Fan Off = " + collection.isOff());
        }

    // Declare a method to print a single instance of a fan
    public void printFan(Fan collection){

        System.out.println("\nHere's a single instance of a fan:");
        System.out.println("Speed = " + collection.getSpeed());
        System.out.println("Radius = " + collection.getRadius());
        System.out.println("Color = " + collection.getColor());
        System.out.println("Fan Off = " + collection.isOff());
    }
}


// Declare class named Fan
class Fan {
    
    public static final int STOPPED = 0; // first constant for Fan stopped
    public static final int SLOW = 1; // second constant for Fan speed slow
    public static final int MEDIUM = 2; // third constant for Fan speed medium
    public static final int FAST = 3; // fourth constant for Fan speed fast

    private int fanSpeed; // A private field named speed that holds one of the constant values
    private boolean fanOff; // A private Boolean field titled on that specifies whether the fan is on or off
    private double fanRadius; // A private field named radius that holds the radius of the fan
    private String fanColor; // A String field that holds the color
    
    // A no-argument constructor that sets all fields with a default value 
    Fan () {
        fanSpeed = 0; // Set default of speed to stopped
        fanRadius = 6; // Set default of radius to 6
        fanColor = "white"; // Set default of color to white
        fanOff = true;
    }

    // A constructor taking arguments and setting values
    Fan (int initSpeed, double initRadius, String initColor, boolean initOff) {
        fanSpeed = initSpeed;
        fanRadius = initRadius;
        fanColor = initColor;
        fanOff = initOff;
    }

    // Getter and Setter methods for fan speed
    public int getSpeed() {
        return fanSpeed;
    }
    public void setSpeed(int speed) {
        this.fanSpeed = speed;
    }

    // Getter and Setter methods for on or off
    public boolean isOff() {
        return fanOff;
    }
    public void setOff(boolean off) {
        this.fanOff = off;
    }

    // Getter and Setter methods for radius
    public double getRadius() {
        return fanRadius;
    }
    public void setRadius(double radius) {
        this.fanRadius = radius;
    }

    // Getter and Setter methods for color
    public String getColor() {
        return fanColor;
    }
    public void setColor(String color) {
        this.fanColor = color;
    }

    /* Write a toString() method that returns a description of the Fans state.
    public String toString() {
        // If fan is off, return the following message
        if (isOff()) {
            return "\n\nSpeed: " + getSpeed() + "\nColor: " + getColor() + "\nRadius: " + getRadius() + "\nThe fan is OFF.";
        // else, return the following message
        } else {
            return "\n\nSpeed: " + getSpeed() + "\nColor: " + getColor() + "\nRadius: " + getRadius() + "\nThe fan is ON";
        }
    }
    */
}

    
