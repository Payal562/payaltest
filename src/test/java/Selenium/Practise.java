package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Practise {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
        //Testcase1: To check each section should be clickable and navigate to respective page
        driver.get("https://testautomationpractice.blogspot.com/");
        List<WebElement> Links = driver.findElements(By.xpath("//div[@class='tabs-outer']"));
        driver.findElement(By.id("crosscol")).click();
        driver.navigate().back();
        driver.findElement(By.xpath("//a[normalize-space()='Online Trainings']")).click();
        driver.navigate().back();
        driver.findElement(By.xpath("//a[normalize-space()='Blog']")).click();
        driver.navigate().back();
        driver.findElement(By.xpath("//a[normalize-space()='PlaywrightPractice']")).click();
        driver.navigate().back();

        //Testcase2:
        driver.findElement(By.xpath("//div[@class='post hentry uncustomized-post-template']"));
        driver.findElement(By.id("name")).sendKeys("payal");
        driver.findElement(By.id("email")).sendKeys("payal@ranium.in");
        driver.findElement(By.id("phone")).sendKeys("7788999990");
        driver.findElement(By.id("textarea")).sendKeys("Testlocation");

        //To checck only one radio button is clickable at a time
        driver.findElement(By.xpath("(//div[@class='form-group'])[3]"));
        driver.findElement(By.id("female")).click();

        //To check days
        List<WebElement> days = driver.findElements(By.xpath("//label[normalize-space()='Days:']"));
        driver.findElement(By.id("sunday")).click();
        driver.findElement(By.id("monday")).click();


        //country
        driver.findElement(By.xpath("//label[normalize-space()='Country:']"));
        driver.findElement(By.id("country")).click();
        driver.findElement(By.xpath("//option[@value='canada']")).click();

       // Sorted list
        driver.findElement(By.xpath("(//div[@class='form-group'])[7]")).click();
        driver.findElement(By.xpath("//option[@value='cat']")).click();
        System.out.println("cat is selected");


    }


}


//







