import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class HomePageTest extends BaseTest{


    public void testPageTitle(){
        String expected = "https://demo.nopcommerce.com/";
        String actual = driver.getCurrentUrl();
        Assert.assertEquals(expected,actual);
    }
}
