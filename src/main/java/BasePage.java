import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {

    protected static WebDriver driver;
    public BasePage(WebDriver driver ){
        this.driver = driver;

    }
}
