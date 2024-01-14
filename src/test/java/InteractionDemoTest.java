import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InteractionDemoTest extends TestBase{

    @Test
    public void shouldFailLogin() {
        driver.get("http://146.59.32.4/index.php?controller=authentication&back=my-account");

        driver.findElement(By.cssSelector("#login-form [name='email']")).sendKeys("awdasdaw@awd");

        driver.findElement(By.cssSelector("[name='password']")).sendKeys("passwrod123");

        driver.findElement(By.cssSelector("#submit-login")).click();

        String msg = driver.findElement(By.cssSelector(".alert-danger")).getText();

        Assert.assertEquals(msg, "Authentication failed.");
    }
}
