public class Ifelse {

    // In Java, if-else statements are used to perform different actions based on different conditions.
    // If start with the keyword `if`, followed by a condition in parentheses.
    //if start with small letter `i` and `else` start with small letter `e`
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        if (b > a) {
            System.out.println("b is greater than a");
        } else {
            System.out.println("a is greater than b ");
        }
        // all code return inside the main method will be executed
        // comparison operators in java
        // 1. == (equal to)
        int c = 30;
        int d = 40;
        if (c == d) {
            System.out.println("c is equal to d");
        } else {
            System.out.println("c is not equal to d");

        }

        // write a logic to check highest number between 3 numbers
        // using nested if-else statements
        int x = 10;
        int y = 20;
        int z = 30;

        if (x > y & x > z) {
            System.out.println("x is highest number");
        } else if (y > z & y > x) {
            System.out.println("y is highest number");
        } else if (z > x & z > y) {
            System.out.println("z is himbghest nuer");
        } else {
            System.out.println("All numbers are equal");
        }
    }
    // 2. != (not equal to)


}


