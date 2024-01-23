/*          
            Name: Alynna Rem
            Date: May 13th, 2022
            Assignment: Module 12 - Redo Module 1 Programming Assignment
            File Name: MathFunctions.java
            Instructions:
            Write a program that displays the results of:
            4 x ( 1.0 - 1.0 / 3.0 + 1.0 / 5.0 - 1.0 / 7.0 + 1.0 / 9.0 - 1.0 / 11.0 + 1.0 / 13.0 )
            And
            4 x ( 1 - 1 / 3 + 1 / 5 - 1 / 7 + 1 / 9 - 1 / 11 + 1 / 13 )
            In your comments, add a discussion on the difference between the two outputs and the cause. Which is best? Why?

*/

// declare a class named MathFunctions
public class MathFunctions {
    // declare main method to execute the program
    public static void main(String[] args) {
        
        // Print the first math formula
        System.out.println("\nHere is the first formula and result: ");
        System.out.print("4 x ( 1.0 - 1.0 / 3.0 + 1.0 / 5.0 - 1.0 / 7.0 + 1.0 / 9.0 - 1.0 / 11.0 + 1.0 / 13.0 ) = ");
        // Print the result of the first math formula
        System.out.println(4* ( 1.0 - (1.0 / 3.0) + (1.0 / 5.0) - (1.0 / 7.0) + (1.0 / 9.0) - (1.0 / 11.0) + (1.0 / 13.0) ));
        
        // Print the second math formula
        System.out.println("\nHere is the second formula and result: ");
        System.out.print("4 x ( 1 - 1 / 3 + 1 / 5 - 1 / 7 + 1 / 9 - 1 / 11 + 1 / 13 ) = ");
        // Print the result of the second math formula
        System.out.println(4* ( 1 - (1 / 3) + (1 / 5) - (1 / 7) + (1 / 9) - (1 / 11) + (1 / 13) ));
    }
}

/* The difference between the two outputs of the formulas above is that one of them is displayed as a float and 
the other is displayed as an integer. The cause of the difference is the data type used in the formula. 
The first formula contains float numbers instead of integers and the second one contains vice-versa. 
It appears the type of data in the outputs are consistent with the data type that is inputted. 
I believe the first formula is better because it's more accurate, especially if you're working with the calculation
of cost or a number that will determine cost. The output I saw for the first formula is 3.2837384837384844, whereas
the output for the second formula is 4. Although the output is lengthy, I would still use it and find a function/method to
return just two numbers after the decimal. */

// Reference: Liang, Daniel Y. "Introduction to Java Programming and Data Structures". Pearson. Oct 2021.