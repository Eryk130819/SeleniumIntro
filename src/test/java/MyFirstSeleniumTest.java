import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyFirstSeleniumTest extends TestBase {

    @Test
    public void openExampleCom() {
        driver.get("https://example.com");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Assert.assertEquals(1, 2);
    }

    @Test
    public void openExampleCom2() {
        driver.get("https://example.com/");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
