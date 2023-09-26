import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P3_RegisterPage extends BasePage {
    public P3_RegisterPage(WebDriver driver){
        super(driver);}
    private By gender_male_ele = By.id("gender-male");
    private By firstName_ele = By.id("FirstName");
    private By lastName_ele = By.id("LastName");
    private By dateOfBirthDay_ele = By.name("DateOfBirthDay");
    private By dateOfBirthMonth_ele = By.name("DateOfBirthMonth");
    private By dateOfBirthYear_ele = By.name("DateOfBirthYear");
    private By email_ele = By.id("Email");
    private By company_ele = By.id("Company");
    private By password_ele = By.id("Password");
    private By confirmPassword_ele = By.id("ConfirmPassword");
    private By registerBtn_ele = By.name("register-button");
    private By result_ele =  By.className("result");
    private By continueBtn_ele =  By.className("button-1");

    public WebElement gender_male(){
        return driver.findElement(gender_male_ele) ;
    }
    public WebElement firstName(){
        return driver.findElement(firstName_ele) ;
    }
    public WebElement lastName(){
        return driver.findElement(lastName_ele) ;
    }
    public WebElement dateOfBirthDay(){
        return driver.findElement(dateOfBirthDay_ele) ;
    }
    public WebElement dateOfBirthMonth(){
        return driver.findElement(dateOfBirthMonth_ele) ;
    }
    public WebElement dateOfBirthYear(){
        return driver.findElement(dateOfBirthYear_ele) ;
    }
    public WebElement email(){
        return driver.findElement(email_ele) ;
    }
    public WebElement company(){
        return driver.findElement(company_ele) ;
    }
    public WebElement password(){
        return driver.findElement(password_ele) ;
    }
    public WebElement confirmPassword(){
        return driver.findElement(confirmPassword_ele) ;
    }
    public WebElement registerBtn(){

        return driver.findElement(registerBtn_ele) ;
    }
    public WebElement result(){
        return driver.findElement(result_ele);
    }
    public WebElement continueBtn(){
        return  driver.findElement(continueBtn_ele);
    }

}
