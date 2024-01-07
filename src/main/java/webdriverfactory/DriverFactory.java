package webdriverfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class DriverFactory {
    public WebDriver driver;
    public static ThreadLocal<WebDriver> threadLocal = new ThreadLocal<>();

    public WebDriver initWebDriver(String browser){
        switch (browser){
            case "chrome":
                threadLocal.set(new ChromeDriver());
                break;
            case "firefox":
                threadLocal.set(new FirefoxDriver());
                break;
            case "edge":
                threadLocal.set(new EdgeDriver());
                break;
            default:
                System.out.println("Invalid Browser Selected; Supported browsers are Chrome, Edge and Firefox");
        }
getDriver().manage().window().maximize();
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        return null;
    }


    public static synchronized WebDriver getDriver(){
        return threadLocal.get();
    }
}
