import org.testng.annotations.Test;

public class CanvasTest extends Utilities {
    Utilities utilities = new Utilities();
    @Test
    public void testCanvas() {
        driver = utilities.fireFox();
        driver.get("https://www.google.com");

    }


}
