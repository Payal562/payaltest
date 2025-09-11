import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class codetest {

    public static void main(String[] args) throws InterruptedException {

        // Set path to chromedriver executable if needed:
        // System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");

        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://testautomationpractice.blogspot.com/");
            driver.manage().window().maximize();

            // Fill form fields
            driver.findElement(By.id("first_name")).sendKeys("John");
            driver.findElement(By.id("ts_last_name")).sendKeys("Doe");
            driver.findElement(By.id("ts_email")).sendKeys("john.doe@example.com");
            driver.findElement(By.id("ts_phone")).sendKeys("1234567890");
            driver.findElement(By.id("ts_address")).sendKeys("123 Main St, Springfield");

            // Gender radio button (Male)
            driver.findElement(By.id("ts_gender_male")).click();

            // Select days checkboxes: Sunday and Monday
            driver.findElement(By.id("ts_day_sun")).click();
            driver.findElement(By.id("ts_day_mon")).click();

            // Select country dropdown
            Select countryDropdown = new Select(driver.findElement(By.id("ts_country")));
            countryDropdown.selectByVisibleText("India");

            // Select favorite color dropdown
            Select colorDropdown = new Select(driver.findElement(By.id("ts_favcolor")));
            colorDropdown.selectByVisibleText("Blue");

            // Select multiple items in sorted list - Two and Four
            driver.findElement(By.xpath("//option[text()='Two']")).click();
            driver.findElement(By.xpath("//option[text()='Four']")).click();

            // Submit the form
            driver.findElement(By.id("ts_submit")).click();

            Thread.sleep(2000); // Wait for 2 seconds

            // Date Picker - select date 15
            WebElement datePicker = driver.findElement(By.id("datepicker"));
            datePicker.click();
            Thread.sleep(1000);

            driver.findElement(By.xpath("//a[text()='15']")).click();

            String selectedDate = datePicker.getAttribute("value");
            System.out.println("Selected Date: " + selectedDate);

            Thread.sleep(1000);

            // Handle Simple Alert
            System.out.println("Testing Simple Alert...");
            driver.findElement(By.xpath("//button[contains(text(),'Simple Alert')]")).click();
            Alert simpleAlert = driver.switchTo().alert();
            System.out.println("Alert text: " + simpleAlert.getText());
            simpleAlert.accept();

            Thread.sleep(1000);

            // Handle Confirmation Alert
            System.out.println("Testing Confirmation Alert...");
            driver.findElement(By.xpath("//button[contains(text(),'Confirmation Alert')]")).click();
            Alert confirmAlert = driver.switchTo().alert();
            System.out.println("Alert text: " + confirmAlert.getText());
            confirmAlert.accept();  // or confirmAlert.dismiss();

            Thread.sleep(1000);

            // Handle Prompt Alert
            System.out.println("Testing Prompt Alert...");
            driver.findElement(By.xpath("//button[contains(text(),'Prompt Alert')]")).click();
            Alert promptAlert = driver.switchTo().alert();
            System.out.println("Alert text: " + promptAlert.getText());
            promptAlert.sendKeys("This is a test input");
            promptAlert.accept();

            Thread.sleep(1000);

            System.out.println("All tests executed successfully.");

        } finally {
            driver.quit();
        }
    }
}
