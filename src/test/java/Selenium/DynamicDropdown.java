package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class DynamicDropdown {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        // Dynamic dropdown - when option in this dropdown is not fixed we can use dynamic dropdown
        WebElement options = driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT"));
        options.click();
        System.out.println("Dropdown all options displayed :" + options.isDisplayed());
        WebElement test = driver.findElement(By.xpath("//a[@value='AMD']"));
        test.click();
        System.out.println(test.getText());
        WebElement Test1 = driver.findElement(By.xpath("(//a[@value='ATQ'])[2]"));
        Test1.click();
        System.out.println(Test1.getText());
        driver.close();
        driver.quit();


    }

}
