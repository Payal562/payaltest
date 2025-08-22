public class Datatypes {
    // in Java, there are 8 primitive data types
    // 1. byte
    // 2. short
    // 3. int
    // 4. long
    // 5. float
    // 6. double
    // 7. char
    // 8. boolean
    public static void main(String[] args) {
        int a = 10;
        // we can can not create duplicate variable with same name in same class
        // int a = 20; // this will give error
        //variable name should be unique in same class

        double d = 20.5;
        double d1 = 100; // this will give error, variable name should be unique in same class
        //100 is treated as double i.e 100.oo


        char c = 'A'; // single character
        char c1 = 'B'; // single character
        // char c2 = 'AB'; // this will give error, char can only hold one character

        System.out.println(a);
        System.out.println(d + d1);
        System.out.println("This is all data types in : " + (c + c1));
        ;

        String str = "Hello World"; // String is a non-primitive data type
        String str1 = "Java Programming"; // String is a non-primitive data type
        String str2 = "Ranium Academy"; // String is a non-primitive data type
        {
            System.out.println(" This is all string data types in :" + str + str1 + str2);
        }

        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(arr[2]);
    }
}
