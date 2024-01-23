
public class JavaNumberPatternPyramid {
    public static void printSpaces(int n) {
        for (int i = 0; i < n; i++)
            System.out.print(" ");
    }

    public static void printPadding(int x) {
        if (x < 10) {
            System.out.print("   ");//3 spaces
        } else if (x > 9 && x < 99) {
            System.out.print("  ");//2 spaces
        } else {
            System.out.print(" ");
        }
    }

    public static void main(String[] args) {

        for (int i = 1; i <= 8; i++) {
            printSpaces(32 - i*4);//here you need more spaces
            for (int j = 0; j < i; j++) {

                int x = (int)Math.pow(2, j);
                printPadding(x);
                System.out.print(x);
            }
            for (int j = i - 2; j >= 0; j--) {
                int x = (int)Math.pow(2, j);
                printPadding(x);
                System.out.print(x);
            }
            System.out.println();
        }

    }
}