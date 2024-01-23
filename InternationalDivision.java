/*     
       Name: Alynna Rem
       Course: CSD-405
       Course Description: Intermediate Java Programming 
       Instructor: Darrell Payne
       File Name: InternationalDivision.java
       Date: 06/26/2022
       Instructions: 

            1. Create an abstract Division class with fields for a company's division name and account number, and an abstract display() method that will be defined in the subclasses.
            2. Use a constructor in the superclass that requires values for both fields.
          * 3. Create two subclasses named InternationalDivision and DomesticDivision.
                 * The InternationalDivision class includes a field for the country in which the division is located, a field for the language spoken, and a constructor that requires all fields when created.
                   The DomesticDivision class includes a field for the state in which the division is located and a constructor that requires all fields when created.
            4. Write an application named UseDivision that creates two instances of each of these concrete classes (4 total instances).
            5. Save the files as: Division, InternationalDivision, DomesticDivision, and UseDivision.
            
*/

class InternationalDivision extends Division { // create a subclass named InternationalDivision
    
    String country; // field for location of division
    String language; // field for language spoken

    InternationalDivision(String companyName, int accountNumber, String country, String language){ // A constructor that requires all fields
        super(companyName, accountNumber); // take and set the fields from superclass
        this.country = country; // take and set the field from this subclass
        this.language = language; // take and set the field from this subclass
    }

    @Override // override the display method, so it will no longer be abstract
    void display() { // define display method
       System.out.println("Company Name: " + this.companyName); // print company name
       System.out.println("Account Number: " + this.accountNumber); // print account number
       System.out.println("Location: " + this.country); // print country
       System.out.println("Language: " + this.language); // print language
       System.out.println();
   }
}
