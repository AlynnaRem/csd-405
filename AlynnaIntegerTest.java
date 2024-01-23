/*     
       Name: Alynna Rem
       Course: CSD-405
       Course Description: Intermediate Java Programming 
       Instructor: Darrell Payne
       File Name: Integer.java
       Date: 06/12/2022
       Instructions: 
             Create a class titled Integer.  Examples:
                AnnaInteger
                LarryInteger
                SueInteger
                Etc.

        This class is to contain:
            1. An int data field titled with your first name.
            2. A constructor that takes and sets the initial value.
            3. Getter and setter methods.
            4. Non-Static methods titled isEven(), isOdd(), and isPrime() returning true or false based on the variable’s value.
            5. Static methods with signatures isEven(int), isOdd(int), and isPrime(int) with the same basic logic as the previous methods with results based on the parameter.
            6. Static methods with signatures isEven( Integer), isOdd( Integer), and isPrime( Integer) with the same basic logic as the previous methods with results based on the parameter.
            7. The methods equals(int) and equals( Integer) which returns true if int values are equal and false if they are not.
            8. Write test code that creates three instances, two with the same value, and one with a different value.
            9. Write test code that ensures all methods function correctly.

*/

public class AlynnaInteger {
    // 1. An int data field titled with your first name.
    int AlynnaInteger;

    // 2. A constructor that takes and sets the initial value.
    public AlynnaInteger(int AlynnaInteger) {
        this.AlynnaInteger = AlynnaInteger;
    }

    // 3. Getter and setter methods.
    public int getAlynnaInteger() {
        return AlynnaInteger;
    }

    public void setAlynnaInteger(int AlynnaInteger) {
        this.AlynnaInteger = AlynnaInteger;
    }

    // 4. Non-Static methods titled isEven(), isOdd(), and isPrime() returning true or false based on the variable’s value.
    public boolean isEven() {
        if (AlynnaInteger % 2 == 0) {
            return true;
        } 
        else {
            return false;
        }
    }

    public boolean isOdd() {
        if (AlynnaInteger % 2 != 0) {
            return true;
        } 
        else {
            return false;
        }
    }

    public boolean isPrime() {
        for (int i = 2; i < AlynnaInteger; i++) {
            if (AlynnaInteger % i == 0) {
                return false;
            }
        }
        return true;
    }


    // 5. Static methods with signatures isEven(int), isOdd(int), and isPrime(int) with the same basic logic as the previous methods with results based on the parameter.
    public static boolean isEven(int AlynnaInteger) {
        return AlynnaInteger % 2 == 0;
    }

    public static boolean isOdd(int AlynnaInteger) {
        return AlynnaInteger % 2 != 0;
    }

    public static boolean isPrime(int AlynnaInteger) {
        for (int i = 2; i < AlynnaInteger; i++) {
            if (AlynnaInteger % i == 0) {
                return false;
            }
        }
        return true;
    }
    

    // 6. Static methods with signatures isEven( Integer), isOdd( Integer), and isPrime( Integer) with the same basic logic as the previous methods with results based on the parameter.
    public static boolean isEven(Integer AlynnaInteger) {
        return AlynnaInteger % 2 == 0;
    }

    public static boolean isOdd(Integer AlynnaInteger) {
        return AlynnaInteger % 2 != 0;
    }

    public static boolean isPrime(Integer AlynnaInteger) {
        for (int i = 2; i < AlynnaInteger; i++) {
            if (AlynnaInteger % i == 0) {
                return false;
            }
        }
        return true;
    }

    // 7. The methods equals(int) and equals( Integer) which returns true if int values are equal and false if they are not.
    public boolean equals(int AlynnaInteger) {
        return this.AlynnaInteger == AlynnaInteger;
    }

    public boolean equals(Integer AlynnaInteger) {
        return this.AlynnaInteger == AlynnaInteger.intValue();
    }
}

class AlynnaIntegerTest {
    public static void main(String[] args) {

        // Create three instances, two with the same value, and one with a different value.
        AlynnaInteger AlynnaInteger1 = new AlynnaInteger(5);
        AlynnaInteger AlynnaInteger2 = new AlynnaInteger(5);
        AlynnaInteger AlynnaInteger3 = new AlynnaInteger(8);

        // Test methods
        System.out.println(AlynnaInteger1.isEven());
        System.out.println(AlynnaInteger1.isOdd());
        System.out.println(AlynnaInteger1.isPrime());
        
        // Giving int as parameter
        System.out.println(AlynnaInteger.isEven(2));
        System.out.println(AlynnaInteger.isOdd(17));
        System.out.println(AlynnaInteger.isPrime(52));

        // Giving Integer as parameter
        System.out.println(AlynnaInteger.isEven(Integer.valueOf(10)));
        System.out.println(AlynnaInteger.isOdd(Integer.valueOf(4)));
        System.out.println(AlynnaInteger.isPrime(Integer.valueOf(3)));

        // Test equals method
        System.out.println(AlynnaInteger1.equals(AlynnaInteger2.getAlynnaInteger()));
        System.out.println(AlynnaInteger1.equals(AlynnaInteger3.getAlynnaInteger()));
    }
}