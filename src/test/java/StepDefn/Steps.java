package StepDefn;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import pages.LoginPage;
import util.ConfigReader;
import webdriverfactory.DriverFactory;

public class Steps {

    private ConfigReader configReader = new ConfigReader();
    private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
    private HomePage homePage = new HomePage(DriverFactory.getDriver());

    @Given("the user launches the NOPAdmin URL")
    public void the_user_launches_the_nop_admin_url() {

        DriverFactory.getDriver().get(configReader.getConfigProperty("url"));

        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
    @Then("the user verifies the loginpage is loaded")
    public void the_user_verifies_the_loginpage_is_loaded() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        Assert.assertTrue(loginPage.logoisDisplayed());
    }
    @When("the user enters the username and password")
    public void the_user_enters_the_username_and_password() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        loginPage.enterUsername(configReader.getConfigProperty("username"));
        loginPage.enterPassword(configReader.getConfigProperty("password"));

    }
    @When("the user clicks on the login button")
    public void the_user_clicks_on_the_login_button() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        loginPage.clickLogin();
    }
    @Then("the user verifies the homepage is loaded")
    public void the_user_verifies_the_homepage_is_loaded() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        Assert.assertTrue(homePage.homeLogoisDisplayed());
    }
    @Then("the user performs logout")
    public void the_user_performs_logout() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        homePage.click_logout();
    }

}
