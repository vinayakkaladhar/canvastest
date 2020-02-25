import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.WebDriver;
import java.lang.reflect.AccessibleObject;

public class CanvasTest{
   public WebDriver driver;
    CanvasTestPage canvasTestPage;
    WebElement canvasElement;
    Actions action;
    Utilities utilities = new Utilities();

    @BeforeClass
    public void driver() throws Exception {
        driver = utilities.fireFox();
        canvasTestPage = new CanvasTestPage(driver);
        action = new Actions(driver);
    }
    @Test
    public void testCanvasSubtraction() throws Exception {
        driver.get("https://www.online-calculator.com/full-screen-calculator/");
        driver.manage().window().maximize();
        driver.switchTo().frame("fullframe");
        canvasElement = canvasTestPage.canvas();
        canvasTestPage.moveInCanvas(658,457);
        canvasTestPage.moveInCanvas(654,547);
        canvasTestPage.moveInCanvas(933,458);
        canvasTestPage.moveInCanvas(658,457);
        canvasTestPage.moveInCanvas(654,547);
        canvasTestPage.moveInCanvas(1019,546);
        utilities.takeSnapShot(driver, "./resources/canvastest/test.png") ;
        //Assert.assertTrue(utilities.compareImage(new File("./resources/canvastest/test.png"),new File("./resources/test1.png")));

    }


}
