import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P6_SearchPage extends BasePage{
    public P6_SearchPage(WebDriver driver) {
        super(driver);
    }
    public WebElement noProducts(){

        return  driver.findElement(By.className("no-result"));
    }
}
