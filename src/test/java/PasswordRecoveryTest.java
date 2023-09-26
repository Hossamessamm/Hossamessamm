import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class PasswordRecoveryTest extends BaseTest {


    P2_LoginPage loginPage;
    P4_RecoveryPassword recoveryPassword;

    @And("user click on forgot password")
    public void user_click_on_forgot_password() {
       loginPage.forgot_password().click();
    }
    @Then("user fill email with valid email")
    public void user_fill_email_with_valid_email() {
        loginPage.email().sendKeys("tahermagdy90@gmail.com");
    }

    @And("user click on Recover button")
    public void user_click_on_recover_button() {
        recoveryPassword.recoveryButton().click();
    }
    @Then("user should see message")
    public void user_should_see_message() {
        String expected = "Email with instructions has been sent to you";
        String actual = recoveryPassword.message().getText();
        Assert.assertTrue(actual.contains(expected));
    }

}
