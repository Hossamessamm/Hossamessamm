import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P1_HomePage extends BasePage{

    public P1_HomePage(WebDriver driver) {
        super(driver);
    }

    public WebElement register(){

        return  driver.findElement(By.className("ico-register"));
    }
    public WebElement login() {
        return driver.findElement(By.cssSelector("a[class=\"ico-login\"]"));
    }
    public WebElement currency(){
        return driver.findElement(By.id("customerCurrency"));
    }
/*    public List<WebElement> sign(){
        return driver.findElement(By.xpath("(//div[@class='prices'])[1]"));
    }*/
    public WebElement sign(){
        return driver.findElement(By.xpath("(//div[@class='prices'])[1]"));
    }
    public WebElement searchBar(){
        return driver.findElement(By.id("small-searchterms"));
    }
    public WebElement searchButton(){
        return driver.findElement(By.cssSelector("button[class=\"button-1 search-box-button\"]"));
    }

   /* public WebElement categoryList(){
        return driver.findElement(By.cssSelector("div[class=\"page-title\"]"));
    }*/
    public WebElement desktopInPage(){
        return driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[1]/h1"));
    }
    public WebElement computers(){
        return driver.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"] [href=\"/computers\"]"));
    }
    public WebElement desktops(){ //(//a[@href='/desktops'])[2]
        return driver.findElement(By.xpath("//a[@href='/desktops'])[2]"));
    }
    public WebElement slider(String sliderNum){
        return driver.findElement(By.xpath("(//a[@href=\"http://demo.nopcommerce.com/\"])["+sliderNum+"]"));
    }
    public WebElement facebook() {
        return driver.findElement(By.xpath("//a[@href=\"http://www.facebook.com/nopCommerce\"]"));
    }
    public WebElement twitter() {
        return driver.findElement(By.xpath("//a[@href=\"https://twitter.com/nopCommerce\"]"));
    }
    public WebElement rss() {
        return driver.findElement(By.xpath("//a[@href=\"/news/rss/1\"]"));
    }

    public WebElement youtube() {
        return driver.findElement(By.xpath("//a[@href=\"http://www.youtube.com/user/nopCommerce\"]"));
    }
    public WebElement wishList() {
        return driver.findElement(By.cssSelector("div[class=\"header-links\"] [href=\"/wishlist\"]"));
    }
    public List<WebElement> addWishList() {
        return driver.findElements(By.cssSelector("button[class=\"button-2 add-to-wishlist-button\"]"));
    }

    public WebElement closeB() {
        return driver.findElement(By.cssSelector("span[class=\"close\"]"));
    }

}
