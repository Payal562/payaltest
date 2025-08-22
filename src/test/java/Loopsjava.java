public class Loopsjava {

//Loops are used to execute a block of code repeatedly until a specified condition is met.
    public static void main(String[] args) {
        // 1. for loop
        // 2. While loop
        // 3. do-while loop
// ;looping means executing a block of code repeatedly until a specified condition is met
      //While loop
        // it will give you infinite loop if you don't increment the value of i
      int i = 1;   // initialization
      while(i<=10)    // conditional
        {
          System.out.println(i);
           i= i + 1; // incrementing the value of i by 1

        }
         System.out.println("########");
      // for loo[
        for (int j =1; j<=10; j++) {  // initialization, condition, increment
            System.out.println(j);
        }

         System.out.println("reverse order 10 to 1");
        //print 10 to 1
        for(int k =10; k>=1; k--) {  // initialization, condition, decrement
            System.out.println(k);
        }
    }
}
