package Testng;

import org.testng.annotations.Test;

public class firstclass {
    @Test(groups = "{sanity}")
    public void LoginTests1()
    {
        System.out.println("Login test 1");
    }

    @Test
    public void loginTest2(){
        System.out.println("Login test 2");
    }


}
