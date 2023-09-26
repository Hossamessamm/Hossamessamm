import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P2_LoginPage extends BasePage {

    public P2_LoginPage(WebDriver driver){
        super(driver);}
    private By emil_ele = By.className("email");
    private By password_ele = By.className("password");
    private By login_ele = By.cssSelector("button[class=\"button-1 login-button\"]");
    private By remember_me_ele = By.id("RememberMe");
    private By forgot_password_ele = By.className("forgot-password");
    private By wrong_message_ele = By.xpath("//*[@id=\"Email-error\"]");

    public WebElement email(){
       return driver.findElement(emil_ele);
    }
    public WebElement password(){
        return driver.findElement(password_ele);
    }
    public WebElement login_btn(){
        return driver.findElement(login_ele);
    }
    public WebElement remember_me(){
        return driver.findElement(remember_me_ele);
    }
    public WebElement forgot_password(){
        return driver.findElement(forgot_password_ele);
    }
    public WebElement wrong_message(){
        return driver.findElement(wrong_message_ele);
    }

}
