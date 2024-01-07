package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    private WebDriver driver;

    @FindBy(xpath = "(//img[@alt=\"logo.png\"])[2]")
    WebElement Homelogo_WebElement;

    @FindBy(xpath = "//a[text()='Logout']")
    WebElement Logout_Link;

    public HomePage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public boolean homeLogoisDisplayed(){
        return Homelogo_WebElement.isDisplayed();
    }

    public void click_logout(){
        Logout_Link.click();
    }
}
