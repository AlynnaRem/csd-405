// Alynna Rem. April 17th, 2022. Module 6 Programming Assignment.
/* The purpose of this program is to use nested for loops to output the following with the shown display format:
                                   1               @
                                 1 2 1             @
                               1 2 4 2 1           @
                             1 2 4 8 4 2 1         @
                          1 2 4 8 16 8 4 2 1       @
                       1 2 4 8 16 32 16 8 4 2 1    @
                    1 2 4 8 16 32 64 32 16 8 4 2 1 @ 
*/

// Declare a class named NestedForLoopPyramid.
public class NestedForLoopPyramid {

    // Declare the spaces method to add spaces when the method is called.
    public static void spaces(int space) {
        // set variable a = 0, condition for continuation to a is less than space, and increment the value of variable a by 1 each loop.
        for (int a = 0; a < space; a++)
            // print 1 space
            System.out.print(" ");
    }
    
    // Declare the printAlignment method to align the output when the method is called.
    public static void printAlignment(int x) {
        // use the if/else-if/else statement to print spaces based on a criteria
        // If variable x is less than 10 add 3 spaces, else-if variable x is greater than 9 add 2 spaces, else print 1 space.
        if (x < 10) {
            // print 3 spaces
            System.out.print("   ");
        } else if (x > 9) {
            // print 2 spaces
            System.out.print("  ");
        } else {
            // print 1 space
            System.out.print(" ");
        }
    }

    // Execute the main method to start the program.
    public static void main(String[] args) {
        // For the outter for loop, set variable a = 1
        // condition for continuation is if variable a is less than or equal to 7 for the number of rows.
        // increment the value of variable a by 1 through each iteration.
        for (int a = 1; a <= 7; a++) {
            // call the spaces method to add more spaces
            spaces(32 - a*4);

            // For the first nested for loop (left side of the pyramid), set variable b = 0
            // condition for continuation is if variable b is less than variable a
            // increment the value of variable b by 1 through each iteration.
            for (int b = 0; b < a; b++) {
                // use the Math.pow method to print 2 to the power of the value of variable b through each iteration.
                int x = (int)Math.pow(2, b);
                // call the printAlignment method.
                printAlignment(x);
                // print spaces based on the criteria of the printAlignment method.
                System.out.print(x);

                // use the if statement to add the @ symbol on the right side of the pyramid if variable a is equal to 1 (Row 1)
                if (a == 1){
                // print spaces based on criteria in printAlignment method.
                    spaces(32 - a*4); 
                    // print the @ symbol
                    System.out.print("@");
                }
                // else continue the loop.
                else
                    continue;
            }

            // For the second nested for loop (right side of the pyramid), set the variable b = a - 2
            // condition for continuation is if b is greater than or equal to 0
            // decrement variable b by 1 through each iteration.
            for (int b = a - 2; b >= 0; b--) {
                // use the Math.pow method to print 2 to the power of the value of variable b through each iteration.
                int x = (int)Math.pow(2, b);
                // call the printAlignment method.
                printAlignment(x);
                // print spaces based on the criteria of the printAlignment method.
                System.out.print(x);

                // use the if statement to add the @ symbol on the right side of the pyramid if variable x is equal to 1 (after the number 1 is printed)
                if (x == 1){
                // print spaces based on criteria in printAlignment method.
                    spaces(32 - a*4);
                    // print the @ symbol
                    System.out.print("@");
                }
                // else continue the loop
                else
                    continue;

            }
            // print output
            System.out.println();
        }

    }
}

/* References: 

"Java Data Types". W3 Schools. https://www.w3schools.com/java/java_data_types.asp. (N.D.) Accessed on March 27, 2022.
 Liang, Y. Daniel. (2015). Introduction to java programming and Data Structures: 12th Edition. Boston :Pearson.

Java For Loop. (n.d.). W3 Schools. Retrieved April 17, 2022, from https://www.w3schools.com/java/java_for_loop.asp

Java If . . . Else. (n.d.). W3 Schools. Retrieved April 17, 2022, from https://www.w3schools.com/java/java_conditions.asp

Using Math.pow in Java. (2021, May 6). Baeldung. Retrieved April 17, 2022, from https://www.baeldung.com/java-math-pow

Java Break and Continue. (n.d.). W3 Schools. Retrieved April 17, 2022, from https://www.w3schools.com/java/java_break.asp

*/
