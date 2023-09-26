import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class HoverCategoriesTest extends BaseTest{
    P1_HomePage homePage;
    String subCategoryName;
    @When("user hover category and select subcategory")
    public void step1() throws InterruptedException {
       /*
        subCategoryName = homePage.desktops().getText().toLowerCase();*/
        Actions action = new Actions(driver);
        action.moveToElement(homePage.computers()).perform();
        homePage.desktops().click();
        Thread.sleep(1000);
    }

    @And("user click on subcategory")
    public void step2(){ homePage.desktops().click();
    }

    @Then("user go to relative product page")
    public void step3(){
        Assert.assertTrue(homePage.desktopInPage().getText().contains("Desktops"));

    }
}

