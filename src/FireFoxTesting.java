import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FireFoxTesting {
    public static void main(String[] args) {
        String baseUrl= "https://demo.nopcommerce.com/";
        System.setProperty("webdriver.gecko.driver","driver/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get(baseUrl); // lunch the URL.
        driver.manage().window().maximize();// maximise window
        // We give implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        // get the title of the page
        String title =driver.getTitle();
        System.out.println(title);
        // get the current url
        String url=driver.getCurrentUrl();
        System.out.println("current url "+url);
        //login url
        String loginUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        driver.navigate().to(loginUrl);
        System.out.println("login url"+loginUrl);
        //find email field element
        WebElement emailField =driver.findElement(By.id("Email"));
        // sending email to email field element
        emailField.sendKeys("mit.pat@yahoo.com");
        //find password element
        WebElement passwordField= driver.findElement(By.name("Password"));
        //sending password to password field element
        passwordField.sendKeys("965050");
        // close the browser
        driver.close();


    }
}
