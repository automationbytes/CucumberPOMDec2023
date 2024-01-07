package Runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        features = {"src/test/resources/Features/Demo.feature"},
        glue ={"StepDefn"},
        plugin = {"pretty",
                "html:reports/html-reports/reports.html",
                "json:reports/json-reports/reports.json",
                "junit:reports/junit-reports/reports.xml",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "summary"},
        publish = true
)
public class TestngRunner extends AbstractTestNGCucumberTests {
    @DataProvider(parallel = true)
    public Object[][] scenarios(){
        return super.scenarios();
    }
}
