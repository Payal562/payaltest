package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.time.Duration;

public class Locators {

    public static void main(String[] args) {
        // Locators are used to find elements on a web page
        // There are 8 types of locators in Selenium
        // 1. ID
        // 2. Name
        // 3. Class Name
        // 4. Tag Name
        // 5. Link Text
        // 6. Partial Link Text
        // 7. CSS Selector
        // 8. XPath
//       Invoke browser  // for preety code cmd+Alt+ l
        //how to comment out code in intellj
        // Ctrl + / to comment out code in intellj

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
       // driver.findElement(By.tagName("h1").getText("Automation Testing Practice");
        driver.findElement(By.id("name")).sendKeys("payal ");
        driver.findElement(By.id("email")).sendKeys("payal@ranium.in");
        driver.findElement(By.id("phone")).sendKeys("7788999990");
        driver.findElement(By.id("textarea")).sendKeys("Ambar Tilak1222");
        driver.findElement(By.name("gender")).click();           //name locator
       // driver.quit();
        // To open browser in different browser


    }
}
