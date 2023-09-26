import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class RegisterTest extends BaseTest {
    P1_HomePage homePage ;
    P3_RegisterPage registerPage;



    @Given("user go to register page")
    public void user_go_to_register_page() {
        homePage.register().click();
    }
    @When("user select gender type")
    public void user_select_gender_type() {
        registerPage.gender_male().click();
    }
    @And("^user enter first name \"(.*?)\" and last name \"(.*?)\"")
    public void user_enter_first_name_and_last_name(String firstname, String lastname) {
        registerPage.firstName().sendKeys(firstname);
        registerPage.lastName().sendKeys(lastname);
    }
    @And("user enter date of birth")
    public void user_enter_date_of_birth() {
        Select select = new Select(registerPage.dateOfBirthDay());
        select.selectByIndex(10);
        select = new Select(registerPage.dateOfBirthMonth());
        select.selectByVisibleText("December");
        select=new Select(registerPage.dateOfBirthYear());
        select.selectByValue("1998");
    }
    @And("^user enter email \"(.*?)\" field")
    public void user_enter_email_field(String email) {
        registerPage.email().sendKeys(email);
    }
    @And("user enter company name")
    public void user_enter_company_name() {
        registerPage.company().sendKeys("T_M");
    }
    @And("^user fills Password fields \"(.*?)\" and \"(.*?)\"")
    public void user_fills_password_fields_and(String pw1, String pw2) {
        registerPage.password().sendKeys(pw1);
        registerPage.confirmPassword().sendKeys(pw2);
    }
    @And("user clicks on register button")
    public void user_clicks_on_register_button() {
        registerPage.registerBtn().click();
    }
    @Then("success message is displayed")
    public void success_message_is_displayed() {
        String expected = "Your registration completed";
        String actual = registerPage.result().getText();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(actual.contains(expected));
        softAssert.assertAll();
    }

}
/*
 @Given("user go to register page")
    public void user_go_to_register_page() {
        homePage.register().click();
    }
    @When("user select gender type")
    public void user_select_gender_type() {
        registerPage.gender_male().click();
    }
    @And("^user enter first name \"(.*?)\" and last name \"(.*?)\"")
    public void user_enter_first_name_and_last_name(String string, String string2) {
        registerPage.firstName().sendKeys();
*/
