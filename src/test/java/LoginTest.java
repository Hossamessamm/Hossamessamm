import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginTest extends BaseTest{
//    private static WebDriver driver;
    //    extends BaseTest
    private final P1_HomePage homePage =new P1_HomePage(driver);


    SoftAssert softAssert = new SoftAssert();



    @Test
    public void step1() throws InterruptedException {
        homePage.login().click();
        P2_LoginPage loginPage =new P2_LoginPage(driver);
        loginPage.email().sendKeys("tahermagdy90@gmail.com");
        loginPage.password().sendKeys("01286481826");
        Thread.sleep(1000L);
        loginPage.login_btn().click();



    }

   }