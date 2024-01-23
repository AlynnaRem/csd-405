/*     
       Name: Alynna Rem
       Course: CSD-405
       Course Description: Intermediate Java Programming 
       Instructor: Darrell Payne
       File Name: ArrayListTryCatch.java
       Date: 06/19/2022
       Instructions: 
             Program 1: Write a program that uses an ArrayList filled with a minimum of 10 Strings. 
             Use a ‘for-each’ loop to print the ArrayList collection. 
             Then ask a user which element they would like to see again. 
             Then, attempt printing the element in a try/catch format which will result in the element being display. 
             If the element value received is invalid, display a message that an Exception has been thrown displaying Out of Bounds. 
             In this program, include the use of Autoboxing/Auto-Unboxing, working with a user String input.
*/

// import java util ArrayList and Scanner
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTryCatch{ // declare a class named ArrayListTryCatch

    public static void main (String[] args){ // declare the main method to test/execute the program

        System.out.println("\n\n-- Movie List --"); // print the title of the ArrayList to the user

        ArrayList<String> movieList = new ArrayList<String>(); // create an arraylist of Strings

        // add 10 Strings to the ArrayList
        movieList.add("1. Fast Five");
        movieList.add("2. Spider-Man: No Way Home");
        movieList.add("3. Stay Quiet");
        movieList.add("4. Avengers");
        movieList.add("5. Star Wars");
        movieList.add("6. First They Killed My Father");
        movieList.add("7. Raya and The Last Dragon");
        movieList.add("8. Doctor Strange");
        movieList.add("9. Eternals");
        movieList.add("10. Iron Man");

        // Use a 'for-each' loop to print the ArrayList collection.
        for(int i = 0; i < movieList.size();i++ ){
            System.out.print("\n\t"+movieList.get(i)+"\n");
    }

        Scanner scan = new Scanner(System.in); // create a scanner for user input

        System.out.print("\nEnter the element you would like to see again: "); // prompt the user to enter the index of the String they would like to see again.
        
        String input= scan.next(); // read the user's input

        int index = Integer.valueOf(input); // use the Auto unboxing object Integer to primitive conversion int
        
        // execute try/except to catch an ArrayIndexOutofBounds Exception
        try{
            if( index>=1 && index <= movieList.size() ) // if index is in the array index, print message displaying the element of index entered
                System.out.println("\nThe element is : "+movieList.get(index-1));  
            else // else, throw an out of bounds exception
                throw new Exception("Out of Bounds");    
        }
        catch(Exception e){ // catch and handle exception
           System.out.println(e);
        } 
        finally{
            System.out.print("\nPress any key to exit...\n");
            String exit = scan.next();
            System.exit(0);
        }     
    }
}