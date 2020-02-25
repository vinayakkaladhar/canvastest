import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

public class CanvasTestPage extends Utilities{

    public WebDriver driver;
Actions action;

    @FindBy(name="uid")
    WebElement canvasElement;

    public CanvasTestPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public WebElement canvas(){
        return canvasElement;
    }

    public void moveInCanvas(int x, int y){
        action = new Actions(driver);
        action.moveByOffset(x,y).click().build().perform();
    }


}
