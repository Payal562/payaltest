package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.List;

public class Firefox {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();     //System.setProperty("webdriver.gecko.driver", "/Users/payal/Documents/drivers/geckodriver"); // Set the path to geckodriver
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize(); // Maximize the browser window
        driver.get("https://testautomationpractice.blogspot.com/"); // Navigate to Google
        System.out.println(driver.getTitle()); // Print the title of the page
        // driver.quit(); // Close the browser
        System.out.println(driver.findElement(By.xpath("//div[@id='header-inner']/div[1]/h1")).getText());
        System.out.println(driver.findElement(By.cssSelector("#header-inner > div.descriptionwrapper > p")).getText());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));

        //To check all link should be clikaable and working fine
        driver.findElement(By.linkText("Home")).click();
        //Thread.sleep(2000);
        driver.findElement(By.linkText("Udemy Courses")).click();
        System.out.println(driver.getTitle());
        driver.navigate().back();
        driver.findElement(By.linkText("Online Trainings")).click();
        driver.navigate().back();
        // Enter form details
        driver.findElement(By.id("name")).sendKeys("payal");
        driver.findElement(By.id("email")).sendKeys("payal@ranium.in");
        driver.findElement(By.cssSelector("#phone")).sendKeys("1234567890");
        driver.findElement(By.id("textarea")).sendKeys("Ambar Tilak");
        driver.findElement(By.xpath("//div[@id=\"post-body-1307673142697428135\"]/div[3]"));
        driver.findElement(By.xpath("//*[@id=\"post-body-1307673142697428135\"]/div[3]/div[1]")).click();
        //days selected 4 options
        //List<WebElement> days = driver.findElements(By.xpath("//*[@id=\"post-body-1307673142697428135\"]/div[4]"));

        }

    }
}
