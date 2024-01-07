package StepDefn;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import util.ConfigReader;
import webdriverfactory.DriverFactory;

import java.util.Properties;

public class ApplnHooks {
    public static ConfigReader configReader;
    public static Properties properties;
    private WebDriver driver;
    private DriverFactory driverFactory;
    @Before
    public void getBrowser(){
        configReader = new ConfigReader();
        driverFactory = new DriverFactory();
        driver = driverFactory.initWebDriver(configReader.getConfigProperty("browser"));


    }

    @After
    public void CloseBrowser(){
        DriverFactory.getDriver().close();
        DriverFactory.getDriver().quit();
    }




    @AfterStep(order = 1)
    public void takeScreenshot(Scenario scenario){
        //if(scenario.isFailed()){
        byte[] source =   ((TakesScreenshot)DriverFactory.getDriver()).getScreenshotAs(OutputType.BYTES);
        scenario.attach(source,"image/png",scenario.getName());
        //}
    }


}
