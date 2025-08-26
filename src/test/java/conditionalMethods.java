import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class conditionalMethods {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://staging-deeprootsbible.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getCurrentUrl());
        //System.out.println(driver.getPageSource());
        // Get the window handle method
        String windowId = driver.getWindowHandle();
        System.out.println("windowID :" + windowId);
        // Get the window handles method
        driver.findElement(By.linkText("Home")).click();
        Set<String> windowIds = driver.getWindowHandles();
        System.out.println("windowIDs :" + windowIds);
        //is displayed method Testcase1 : To check if the deeproots logo is displayed on the homepage

        WebElement logo = driver.findElement(By.linkText("DeepRoots"));
        logo.isDisplayed();
        System.out.println("Logo is displayed on the homepage : " + logo.isDisplayed());

        //Testcase2: dropdown // get all the links inside the dropdowwn and print them
        WebElement dropdown = driver.findElement(By.linkText("Take A Tour"));
        dropdown.click();
        System.out.println("Dropdown is displayed : " + dropdown.isDisplayed());
        List<WebElement> links = driver.findElements(By.cssSelector("dropdown-menu show"));
        System.out.println("Total links in the dropdown :" + links.size());
        //for loop to print all the links





        }

    }
}

