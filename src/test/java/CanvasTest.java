import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.File;
import org.apache.commons.io.FileUtils;

import java.lang.reflect.AccessibleObject;

public class CanvasTest extends Utilities {
    Utilities utilities = new Utilities();
    @Test
    public void testCanvas() throws Exception {
        driver = utilities.fireFox();
        driver.get("https://www.online-calculator.com/full-screen-calculator/");
        driver.switchTo().frame("fullframe");
        WebElement canvasElement = driver.findElement(By.id("animation_container"));
        Actions action = new Actions(driver);
        action.moveByOffset(670,254).click().build().perform();
        this.takeSnapShot(driver, "/Users/cb-vinayak/work/canvastest/test.png") ;
        Assert.assertTrue(compareImage(new File("/Users/cb-vinayak/work/canvastest/test.png"),new File("/Users/cb-vinayak/work/canvastest/test1.png")));

    }


}
