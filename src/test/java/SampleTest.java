import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;


public class SampleTest {
    @Test
    void openbrower() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));

        driver.get("https://testautomationpractice.blogspot.com");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        driver.findElement(By.id("name")).click();
        driver.findElement(By.id("name")).sendKeys("payal");

        //driver.quit();

    }
}