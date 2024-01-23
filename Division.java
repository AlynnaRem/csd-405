/*     
       Name: Alynna Rem
       Course: CSD-405
       Course Description: Intermediate Java Programming 
       Instructor: Darrell Payne
       File Name: Division.java
       Date: 06/26/2022
       Instructions: 

          * 1. Create an abstract Division class with fields for a company's division name and account number, and an abstract display() method that will be defined in the subclasses.
          * 2. Use a constructor in the superclass that requires values for both fields.
            3. Create two subclasses named InternationalDivision and DomesticDivision.
                   The InternationalDivision class includes a field for the country in which the division is located, a field for the language spoken, and a constructor that requires all fields when created.
                   The DomesticDivision class includes a field for the state in which the division is located and a constructor that requires all fields when created.
            4. Write an application named UseDivision that creates two instances of each of these concrete classes (4 total instances).
            5. Save the files as: Division, InternationalDivision, DomesticDivision, and UseDivision.
            
*/

abstract class Division{ // Create an abstract Division class

       String companyName; // field for company's division name
       int accountNumber; // field for company's account number

       abstract void display(); // abstract display() method

       Division(String companyName, int accountNumber){ // A constructor in the superclass that takes requires values for both fields

              this.companyName = companyName; // take and set the company name
              this.accountNumber = accountNumber; // take and set the account number

              }

       }

