public class ArrayConcept {

//    // Array is a collection of similar data types, it is a fixed size data structure
    // Array can hold multiple values of same data type
    // Array index starts from 0, so the first element is at index 0 and
    // the last element is at index length-1

    // for example i want to store 5 value in one singlle variable if i write int a = 20 , int a = 10 its throw an error
    // because variable name is same, so we can use array to store multiple values in a single variable
    public static void main(String[] args) {

        int i[] = new int[5];
        i[0] = 10;
        i[1] = 20;
        i[2] = 30;
        i[3] = 40;
        i[4] = 50;

        System.out.println(i[0]);
        System.out.println(i[1]);
        System.out.println(i[2]);
        System.out.println(i[3]);
        System.out.println(i[4]);
        // System.out.println(i[5]);

        //Find the missing number in an array of 1 to n.
        // Input: {1, 2, 4, 5} (Assuming n = 5)
        // Expected Output: 3
        System.out.println(i.length);   // length of the array
        //print all the values in the array using for loop
// size is fixed is called static array
             for (int j = 0; j < i.length; j++) {
            System.out.println("Value at index : " + j + " is: " + i[j]);

            // double array
            double d[] = new double[3];
            d[0] = 10.5;
            d[1] = 20.5;
            d[2] = 30.5;
            System.out.println(d.length);    //if write in double cote it will give output as text only


            // char array
            char c[] = new char[3];
            c[0] = 'A';
            c[1] = 'B';
            c[2] = 'C';
            System.out.println(c.length);    //if write in double cote it will give output as

            //boolena array
            boolean b[] = new boolean[2];
            b[0] = true;
            b[1] = false;
            System.out.println("boolean array print: " + b[1]);
            System.out.println(b.length);

            //FLOAT ARRYA
            float f[] = new float[2];
            f[0] = 10.5f;
            f[1] = 20.5f;
            System.out.println("This is the float array : +" + f.length);

            //String array
            String s[] = new String[2];
            s[0] = "R1";
            s[1] = "R2";
            System.out.println("this is the string array:" + s.length);

            // object array- object can store multiple data types
            Object o[] = new Object[6];
            o[0] = "Ranium"; // string
            o[1] = 26;     //integer
            o[2] = 20.5;   // double
            o[3] = 'A';  // char
            o[4] = true;   // boolean
            o[5] = 19 / 9 / 1997; // date
            System.out.println("This is the object array :" + o.length);

            //print all the values in the object array by using for loop
            for (int l = 0; l < o.length; l++) {
                System.out.println("Print all the values of the array :" + o[l]);
            }
        }
    }
    }

