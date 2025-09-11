package Testng;

import org.testng.annotations.Test;

public class Thirdclass {
    @Test(dependsOnMethods = {"secondclass"})
    public void test5(){
        System.out.println("This is third class");

    }
}
