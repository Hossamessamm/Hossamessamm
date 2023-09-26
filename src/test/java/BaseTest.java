import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    protected static WebDriver driver;


    @BeforeTest

    public void openDriver() throws InterruptedException {
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.navigate().to("https://demo.nopcommerce.com/");
    }
    @AfterTest
    public static void quitDriver() throws InterruptedException {
        driver.quit();
        Thread.sleep(3000);
    }
}
