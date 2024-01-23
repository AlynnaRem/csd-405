/*
    Name: Alynna Rem
    Date: April 25th, 2022
    Assignment: Module 8
    File Name: yearlyService.java

    Description: This program will calculate the cost of a yearly auto service visit. This program will contain four methods with the same name.

    1. yearlyService(no parameters) - Will return the standard service charge.
    2. yearlyService(one parameter) - Will return the standard service charge with an added oil change fee.
    3. yearlyService(two parameters) - Will return the standard service charge with an added oil change fee and a tire rotation charge.
    4. yearlyService(three parameters) - Will return the standard service charge with an added oil change fee, a tire rotation charge, along with a coupon amount that will be deducted from the total cost.
*/


// declare the helper class
public class yearlyService {

	// declare the first yearlyService method with one parameter
	public double yearlyService(){
		double sum = 100.00;
		return sum;
	}

    // declare the second yearlyService method with two parameters
	public double yearlyService(double a){
		double sum = 100.00 + a;
		return sum;
	}

    // declare the third yearlyService method with three parameters
	public double yearlyService(double a, double b){
		double sum = 100.00 + a + b;
		return sum;
	}

    // declare the fourth yearlyService method with four parameters
	public double yearlyService(double a, double b, double c){
		double sum = 100 + a + b + c;
		return sum;
	}

    // declare the main method to execute the program and display results
    public static void main(String[] args) {

    	yearlyService ob = new yearlyService();

        // declare variables for each service type/coupon
        double standard_service_charge = 100.00;
        double oil_change_fee = 25.00;
        double tire_rotation = 150.00;
        double coupon = -50.00;

        // declare variables to add the values for each method.
        double sum1 = ob.yearlyService();
        double sum2 = ob.yearlyService(oil_change_fee);
        double sum3 = ob.yearlyService(oil_change_fee, tire_rotation);
    	double sum4 = ob.yearlyService(oil_change_fee, tire_rotation, coupon);

        // print results for each method in a message twice
    	System.out.println("The total cost of yearly service is $" + sum1 + ".");
    	System.out.println("The total cost of yearly service is $" + sum1 + ".");
    	System.out.println("The total cost of yearly service is $" + sum2 + ".");
    	System.out.println("The total cost of yearly service is $" + sum2 + ".");
    	System.out.println("The total cost of yearly service is $" + sum3 + ".");
    	System.out.println("The total cost of yearly service is $" + sum3 + ".");
    	System.out.println("The total cost of yearly service is $" + sum4 + ".");
    	System.out.println("The total cost of yearly service is $" + sum4 + ".");

    }
}

/* Reference:

"Java Data Types". W3 Schools. https://www.w3schools.com/java/java_data_types.asp. (N.D.) Accessed on March 27, 2022.
 Liang, Y. Daniel. (2015). Introduction to java programming and Data Structures: 12th Edition. Boston :Pearson.

*/