/*     
       Name: Alynna Rem
       Course: CSD-405
       Course Description: Intermediate Java Programming 
       Instructor: Darrell Payne
       File Name: CreateNewFile.java
       Date: 06/19/2022
       Instructions: 
             Program 2: Write a program to create a new file titled data.file, if the file does not exist. 
             Then write to the new file, adding 10 randomly generated numbers, or append 10 randomly generated numbers to a previous file. 
             Each integer is to be separated by a space. Close the file, then reopen the file and read the data from the file and display it.
*/

// Import java packages.
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class CreateNewFile { // declare a class named CreateNewFile
    
   public static void main( String[] args ) { // declare the main method to test/execute the program

      System.out.println("\n\nThis program will create/write to a file titled data.file and add 10 random numbers to it."); // print the title of the ArrayList to the user

      String fileName = "data.file"; // declare a variable named fileName to hold the name of the new file
      
      appendFile(fileName);  // append data in txt file 
      readFile(fileName); // read txt file data.
   }

    private static void appendFile(String fileName) { // declare a method to append data to file
        try { // If the file exists, write to the file. If not, create a new file
             File file = new File(fileName);
             if(!file.exists()) {
                file.createNewFile();
             }
             FileWriter fileWriter = new FileWriter(file.getName(),true); // use the FileWriter class and write () method to write text to the file created
             BufferedWriter bufferWriter = new BufferedWriter(fileWriter); //adding 10 randomly generated numbers, or  append 10 randomly generated numbers to a previous file. Each integer is to be separated by a space.
               
             Random random = new Random();  // create an object of Random class 
             for(int i =0;i<10;i++){                
                int num = random.nextInt(1000);  // Generate random integers between 0 and 999  
                bufferWriter.write(num+" "); // write in file and add space between each integer
             }
             bufferWriter.write("\n"); // write new line in file 
             
             bufferWriter.close(); //close file
             fileWriter.close();
          }
          catch(IOException e){ // catch and handle exception
             System.out.println("Error: "+ e);
          }
      }

    private static void readFile(String fileName){ // declare a method to read data in file
        
        try{ // If the file exists, read the file
            File file = new File(fileName);// File path is passed as parameter
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferReader = new BufferedReader(fileReader);
            String line;
            System.out.println("\nThe file titled " + fileName + " contains the following randomly generated numbers: \n"); // display message to user
            // read file data
            while ((line = bufferReader.readLine()) != null){
                System.out.println(line);// print the data
            } 
            bufferReader.close(); // close file;
            fileReader.close();
        }
        catch(FileNotFoundException e){ // catch the FileNotFoundException and handle it.
            System.out.println("Error: "+ e);
        }
        catch(IOException e){ // catch the IOException and handle it.
            System.out.println("Error: "+ e);
        }
        finally{ // print message for user to exit.
            System.out.print("\nExiting Program...\n");
            System.exit(0); // exit the program
   }

}
}
   