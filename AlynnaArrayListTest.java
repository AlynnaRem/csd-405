/*     
       Name: Alynna Rem
       Course: CSD-405
       Course Description: Intermediate Java Programming 
       Instructor: Darrell Payne
       File Name: AlynnaArrayListTest.java
       Date: 06/12/2022
       Instructions: 
             Create a class <yourName>ArrayListTest .  Examples:
                 TomArrayListTest
                 SueArrayListTest
                 CindyArrayListTest
                 Etc.

        This class is to contain:
            1. A method that receives an ArrayList populated with an Integer data type holding the integers received from user input.
            2. The user input is to accept Integers that are then assigned to the ArrayList until a value of 0 is entered, which is also assigned to the ArrayList.
            3. The ArrayList is then to be sent to the method.
            4. The method is then to return the largest value in the ArrayList.
            5. If the ArrayList is sent in empty, the method will then return 0.
            6. The method signature is to be: public static Integer max (ArrayList list).
            7. Write additional code for testing your method.
            8. The method will return the largest value that is displayed to the user.
*/

// Import java utility package
import java.util.*;

// Declare a class named AlynnaArrayListTest
public class AlynnaArrayListTest {

        // (1 and 6) Method Signature: public static Integer max (ArrayList list).        
        public static Integer max(ArrayList<Integer> list) {
                //check if arraylist is empty
                if (list.size() == 0) {
                        //  (5) If the ArrayList is sent in empty, the method will then return 0.
                        return 0;
                }
                //identify the max value in the list
                Integer max = list.get(0);
                for (int i = 0; i < list.size(); i++) {
                        if (list.get(i) > max) {
                                max = list.get(i);
                        }
                }
                // (4) The method is then to return the largest value in the ArrayList.
                return max;
        }

        // (7) Declare main method to execute and test the program
        public static void main(String[] args) {

                // Prompt the user to enter integers    
                System.out.println("\nPlease enter integers. Enter 0 when you are finished: ");
                // (2) The user input is to accept Integers that are then assigned to the ArrayList until a value of 0 is entered, which is also assigned to the ArrayList.
                Scanner sc = new Scanner(System.in); 
                int input = sc.nextInt(); 

                //creating arraylist
                ArrayList<Integer> list = new ArrayList<Integer>();
                //adding elements to the arraylist until the user enters 0
                //While input is not 0, continue loop.
                while(input!=0) {
                        list.add(input);
                        input = sc.nextInt();
                }
                list.add(input); 
                // (3) The ArrayList is then to be sent to the method.
                // (8) The method will return the largest value that is displayed to the user.
                System.out.println("\nThe maximum value is " + max(list));
                sc.close();
        }

}