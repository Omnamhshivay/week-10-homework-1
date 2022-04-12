import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgeTesting {
    public static void main(String[] args) {
        String baseUrl="https://demo.nopcommerce.com/login?returnUrl=%2F";
        System.setProperty("webdriver.edge.driver","driver/msedgedriver.exe");
        WebDriver driver= new EdgeDriver();
        // Lunch the Url
        driver.get(baseUrl);
        // Maximise window
        driver.manage().window().maximize();
        // We give implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //Get the title of the page
        String title = driver.getTitle();
        System.out.println(title);
        //Get the current Url
        String url=driver.getCurrentUrl();
        System.out.println("Current Url "+ url);
        // Print the page source
        String pageSource=driver.getPageSource();
        System.out.println("Page source "+ pageSource);
        // find email field element
        WebElement emailField = driver.findElement(By.id("Email"));
        // Sending email to email field element
        emailField.sendKeys("mitesh.patel@yahooo.com");
        // Find password field element
        WebElement passwordfield= driver.findElement(By.name("Password"));
        // Sending password to password field element
        passwordfield.sendKeys("965050");
        // Close browser
        driver.close();
    }
}
