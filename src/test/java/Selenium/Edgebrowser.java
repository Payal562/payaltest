package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edgebrowser {
    public static void main(String[] args) {
       //
         //WebDriverManager.edgedriver().setup();
        System.setProperty("webdriver.edge.driver","/Users/payal/Downloads/edgedriver_arm64/msedgedriver");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize(); // Maximize the browser window
        driver.get("http://www.rahulshettyacademy.com/locatorspractice/"); // Navigate to Google
        System.out.println(driver.getTitle()); // Print the title of the
    }
}
