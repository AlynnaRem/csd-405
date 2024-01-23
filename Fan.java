/*     Name: Alynna Rem
       Course: CSD-405
       Course Description: Intermediate Java Programming 
       Instructor: Darrell Payne
       File Name: Fan.java
       Date: 05/29/2022
       Instructions: 
          Write a program with a class titled Fan. This class is to contain:
            1. Four constants named STOPPED, SLOW, MEDIUM, and FAST. The constants are to hold the values of 0, 1, 2, and 3 respectively.
            2. A private field named speed that holds one of the constant values with the default being STOPPED.
            3. A private Boolean field titled on that specifies whether the fan is on or off.
            4. A private field named radius that holds the radius of the fan with a default value of 6.
            5. A String field that holds the color, with the default being white.
            6. Setter and getter methods for all mutable fields.
            7. A no-argument constructor that sets all fields with a default value.
            8. A constructor taking arguments and setting values.
            9. Write a toString() method that returns a description of the Fans state.
            10. Write test code that creates two instances of the Fan class, one using the default 
                 constructor and the other using the argument constructor. Write code that displays the functionality of the Fan class methods.
*/

// Declare class named Fan
public class Fan {
    
    public static final int STOPPED = 0; // first constant for Fan stopped
    public static final int SLOW = 1; // second constant for Fan speed slow
    public static final int MEDIUM = 2; // third constant for Fan speed medium
    public static final int FAST = 3; // fourth constant for Fan speed fast

    private int fanSpeed; // A private field named speed that holds one of the constant values
    private boolean fanOff; // A private Boolean field titled on that specifies whether the fan is on or off
    private double fanRadius; // A private field named radius that holds the radius of the fan
    private String fanColor; // A String field that holds the color
    
    // A no-argument constructor that sets all fields with a default value 
    public Fan () {
        fanSpeed = 0; // Set default of speed to stopped
        fanRadius = 6; // Set default of radius to 6
        fanColor = "white"; // Set default of color to white
        fanOff = true;
    }

    // A constructor taking arguments and setting values
    public Fan (int initSpeed, double initRadius, String initColor, boolean initOff) {
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
        fanSpeed = speed;
    }

    // Getter and Setter methods for on or off
    public boolean isOff() {
        return fanOff;
    }
    public void setOff(boolean off) {
        fanOff = off;
    }

    // Getter and Setter methods for radius
    public double getRadius() {
        return fanRadius;
    }
    public void setRadius(double radius) {
        fanRadius = radius;
    }

    // Getter and Setter methods for color
    public String getColor() {
        return fanColor;
    }
    public void setColor(String color) {
        fanColor = color;
    }

    // Write a toString() method that returns a description of the Fans state.
    public String toString() {
        // If fan is off, return the following message
        if (isOff()) {
            return "\n\nSpeed: " + getSpeed() + "\nColor: " + getColor() + "\nRadius: " + getRadius() + "\nThe fan is OFF.";
        // else, return the following message
        } else {
            return "\n\nSpeed: " + getSpeed() + "\nColor: " + getColor() + "\nRadius: " + getRadius();
        }
    }

    /* 
    Write test code that creates two instances of the Fan class, one using the default constructor 
    and the other using the argument constructor. Write code that displays the functionality of the Fan class methods.
    */

    // Declare main method to execute the program for testing
    public static void main(String[] args) {

        // Create two Fan objects
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

		// Display the objects by invoking their toString method
		System.out.println("\n\nFan 1: "+fan1.toString());
		System.out.println("\n\nFan 2: "+fan2.toString());
	}
}

