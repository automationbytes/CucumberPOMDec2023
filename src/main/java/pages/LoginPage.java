package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private WebDriver driver;

    @FindBy(css = "input[name=\"Email\"]")
    WebElement username_WebEdit;
    @FindBy(css = "input[name=\"Password\"]")
    WebElement password_WebEdit;
    @FindBy(css = "button[type=\"submit\"]")
    WebElement login_Button;

    @FindBy(xpath = "//h1")
    WebElement logo_webElement;
    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void enterUsername(String username){
        username_WebEdit.clear();
        username_WebEdit.sendKeys(username);
    }

    public void enterPassword(String password){
        password_WebEdit.clear();
        password_WebEdit.sendKeys(password);
    }

    public void clickLogin(){
        login_Button.click();
    }

    public String pageTitle(){
        return driver.getTitle();
    }

    public boolean logoisDisplayed(){
        return logo_webElement.isDisplayed();
    }
}
