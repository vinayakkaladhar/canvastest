import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;

public class Utilities {
WebDriver driver;

public WebDriver fireFox(){
    System.setProperty("webdriver.gecko.driver", "/Users/cb-vinayak/Downloads/geckodriver");
    driver = new FirefoxDriver();
    return driver;
}

}
