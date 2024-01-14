import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyFirstTest {

    public int add(int a, int b) {
        return a+b;
    }

    public int multiply(int a, int b) {
        return a*b;
//        return 4;
    }

    @Test
    public void addPositiveNumbers() {
        Assert.assertEquals(add(2, 3), 5);
    }

    @Test
    public void multiplyPositiveNumbers() {
        Assert.assertEquals(multiply(2,3), 6);
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("run before each test");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("run after each test");
    }
}
