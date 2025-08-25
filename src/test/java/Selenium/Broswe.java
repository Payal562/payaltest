package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broswe {
    public static void main(String[] args) {
        //System.setProperty("webdriver.chrome.driver","/Users/payal/documents/drivers/chromedriver"); // Set the path to chromedriver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.rahulshettyacademy.com/locatorspractice");
        System.out.println(driver.getTitle());
        driver.findElement(By.id("inputUsername")).sendKeys("rahul");
        driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
        driver.findElement(By.id("chkboxOne")).click();
        driver.findElement(By.className("submit")).click();  // Uncomment this line to use EdgeDriver instead
        driver.close();


    }

}
