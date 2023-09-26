import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class CurrencyTest extends BaseTest{

    P1_HomePage homePage;
    @Given("user navigate to homepage")
    public void step1(){
        String expected = "https://demo.nopcommerce.com/";
        String actual = driver.getCurrentUrl();
        Assert.assertEquals(expected,actual);
    }
    @When("user change current currency to Euro")
    public void step2() throws InterruptedException {
        Select select=new Select(homePage.currency());
        select.selectByVisibleText("Euro");
        Thread.sleep(1000);
    }
    @Then("user should found all products prices in Euro")
    public void step3(){

        /*JavascriptExecutor js = (JavascriptExecutor) Hooks.driver;
        js.executeScript("window.scrollBy(0,1400)", "");

        int count=sign().size();
        for (int i=0;i<count;i++)
        {
            sign().get(i).getText();*/
        //String expected = "€";
        String actual = homePage.sign().getText();
            Assert.assertTrue(actual.contains("€"));
        }


    @When("user change current currency to Dollar")
    public void step4() throws InterruptedException {
        Select select=new Select(homePage.currency());
        select.selectByVisibleText("US Dollar");
        Thread.sleep(1000);
    }
    @Then("user should found all products prices in Dollar")
    public void step5(){
       /* int count=homePage.sign().size();
        for (int i=0;i<count;i++)
        {
            sign().get(i).getText();*/
        String actual = homePage.sign().getText();
            Assert.assertTrue(actual.contains("$"));
        }
    }

