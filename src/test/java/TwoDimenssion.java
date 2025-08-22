public class TwoDimenssion {
   public static void main(String[] args) {
       // 2D array is an array of arrays
       // it is used to store data in a tabular format
       // it is also called as matrix
       // it is used to store data in rows and columns
       // it is used to store data in a grid format

       //iNteger 2d array
       //int i[] = new int[3]; // 1D ARRAY
       int i[][] = new int[2][3]; //2d array
            i[0][0] = 10;
            i[0][1] = 20;
            i[0][2] = 30;
            i[1][0] = 40;
            i[1][1] = 50;
            i[1][2] = 60;
            System.out.println("This is the 2D array: ");
            System.out.println(i.length);


            for(int k=0; k<i.length;k++){

                System.out.println("print all values :"+ i[k]);
            }

   }


}



