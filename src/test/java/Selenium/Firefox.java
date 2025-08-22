package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();     //System.setProperty("webdriver.gecko.driver", "/Users/payal/Documents/drivers/geckodriver"); // Set the path to geckodriver
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize(); // Maximize the browser window
        driver.get("http://www.rahulshettyacademy.com/locatorspractice/"); // Navigate to Google
        System.out.println(driver.getTitle()); // Print the title of the page
       // driver.quit(); // Close the browser

    }
}
