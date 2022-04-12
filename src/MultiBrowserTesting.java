import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowserTesting {
    static String browser="chrome";
    static String baseurl="https://demo.nopcommerce.com/login?returnUrl=%2F";
    static WebDriver driver;
    public static void main(String[] args) {
    if (browser.equalsIgnoreCase("chrome")){
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        driver= new ChromeDriver();
    }else if (browser.equalsIgnoreCase("edge")){
        System.setProperty("webdriver.edge.driver","driver/msedgedriver.exe");
        driver=new EdgeDriver();
    }else if (browser.equalsIgnoreCase("firefox")){
        System.setProperty("webdriver.gecko.driver","driver/geckodriver.exe");
        driver=new FirefoxDriver();
    }else{
        System.out.println("Use correct browser");
    }
    driver.get(baseurl);
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    driver.close();
    }
}
