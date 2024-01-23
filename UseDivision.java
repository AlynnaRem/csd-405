/*     
       Name: Alynna Rem
       Course: CSD-405
       Course Description: Intermediate Java Programming 
       Instructor: Darrell Payne
       File Name: UseDivision.java
       Date: 06/26/2022
       Instructions: 

            1. Create an abstract Division class with fields for a company's division name and account number, and an abstract display() method that will be defined in the subclasses.
            2. Use a constructor in the superclass that requires values for both fields.
            3. Create two subclasses named InternationalDivision and DomesticDivision.
                   The InternationalDivision class includes a field for the country in which the division is located, a field for the language spoken, and a constructor that requires all fields when created.
                   The DomesticDivision class includes a field for the state in which the division is located and a constructor that requires all fields when created.
          * 4. Write an application named UseDivision that creates two instances of each of these concrete classes (4 total instances).
          * 5. Save the files as: Division, InternationalDivision, DomesticDivision, and UseDivision.
            
*/


public class UseDivision { // create an application named UseDivision

    public static void main(String [] args){ // Declare the main method to execute the program

       InternationalDivision internationaldivision1 = new InternationalDivision("International Division 1", 1234567, "France", "French"); // create an instance of InternationalDivision 
       InternationalDivision internationaldivision2 = new InternationalDivision("International Division 2", 12345678, "Mexico", "Spanish"); // create a 2nd instances of InternationalDivision
       DomesticDivision domesticdivision1 = new DomesticDivision("Domestic Division 1", 12345, "California"); // create an instance of DomesticDivision
       DomesticDivision domesticdivision2 = new DomesticDivision("Domestic Division 2", 123456, "Texas"); // create a 2nd instance of DomesticDivision

       System.out.println();
       System.out.println("-- Here's a list of divisions --\n");
       internationaldivision1.display(); // call to the display method to print the 1st instance of InternationalDivision
       internationaldivision2.display(); // call to the display method to print the 2nd instance of InternationalDivision
       domesticdivision1.display(); // call to the display method to print the 1st instance of DomesticDivision
       domesticdivision2.display(); // call to the display method to print the 2nd instance of DomesticDivision
}
}
