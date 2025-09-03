package Selenium;

//import org.junit.jupiter.api.Test;
import org.testng.annotations.Test;

public class Testng {
    @Test(priority = 2)
    public void test1(){
        System.out.println("Testng class 1");
    }
     @Test(priority = 1)
     public void test2()
     {
         System.out.println("Testng class 2");
     }
}

