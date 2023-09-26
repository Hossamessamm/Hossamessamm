import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

public class SearchTest extends BaseTest {

    P6_SearchPage searchPage;
    P1_HomePage homePage;
    @When("user click on search bar")
    public void step1() {
        homePage.searchBar().click();
    }

    @And("user search for product like \"(.*)\"$")
    public void step2(String search) {
        homePage.searchBar().sendKeys(search);
    }

    @And("user click on search Button")
    public void step3() {
        homePage.searchButton().click();
    }

    @Then("user could search successfully and go to search page")
    public void step4() {
        // First Assertion
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(driver.getCurrentUrl().contains("https://demo.nopcommerce.com/search?q=Apple"), "search URL");
    }
    //Second Scenario
    @Then("user could search successfully with SKU")
    public void step5() {
        // First Assertion
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(driver.getCurrentUrl().contains("https://demo.nopcommerce.com/search?q=AP_MBP_13"), "URL after search");
    }
    //Third Scenario
    @Then("user could not search")
    public void step6() {
        SoftAssert soft = new SoftAssert();
        String actual = searchPage.noProducts().getText();
        soft.assertTrue(actual.contains("No products"));
        // another kind of assertion
        soft.assertTrue(searchPage.noProducts().isDisplayed(),"No products");
    }
}
