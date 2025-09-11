package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.time.Duration;

public class Staticdropdown {
    @Test
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver =  new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        System.out.println(driver.getTitle());
        // When Option in this dropdown is fixed we can use static dropdown
        // its webelement with select tag
        WebElement StaticDropdown =  driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        // create object ofh select classh
        // TESTCASE 1: To check defult value
        Select dropdown =    new Select(StaticDropdown);
        //dropdown.selectByIndex(3);// select by index
        dropdown.getFirstSelectedOption().getText();  // get the text of selected option
        System.out.println(dropdown.getFirstSelectedOption().getText());

        //to check all option in the dropdown present so there is 4 option present in the dropdown
        dropdown.getOptions();
        System.out.println("Total option in dropdown:"+ dropdown.getOptions().size());

        //To check select one option - select 2nd option //AED
        dropdown.selectByIndex(2);
        System.out.println(dropdown.getFirstSelectedOption().getText());

        // To check select by value
        dropdown.selectByValue("USD");
        System.out.println("Value checked :"+ dropdown.getFirstSelectedOption().getText());

        // To check select by visible text
        dropdown.selectByVisibleText("INR");
        System.out.println("Value checked :"+ dropdown.getFirstSelectedOption().getText());
        driver.quit();





    }
}
