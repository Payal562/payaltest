public class Stringconcetnation
        {
            public static void main(String[] args) {
                int a = 100;
                int b = 200;

                String A1 = "test1";
                String Y1 = "test2";

                double d = 100.5;
                double d1 = 200.5;


                System.out.println(a+b);
                System.out.println(A1 + Y1);
                System.out.println(a+Y1+b+A1);
// EXECUTION Will be happens left to right
            System.out.println(A1+Y1+a+b);    // execution will be happens left to right
// when u add integer with string, integer will be converted to string and then concatenated

           System.out.println(d+d1);
           System.out.println(Y1+A1+(d+d1)); // + is used for concatenation in Java
           System.out.println(d+d1+(a+b));
           System.out.println(d+d1+(A1+Y1));
           System.out.println("This is my first string program: "+a);

           // Difference between print and println - for example
            System.out.print("Welcome to Ranium"); // ln means line, print will not add a new line after the output
            System.out.println("First day of R1"); // print will not add a new line after the output, println will add a new line



    }
}
