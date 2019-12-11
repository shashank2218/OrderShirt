package runner;
import com.vimalselvam.cucumber.listener.Reporter;
import managers.FileReaderManager;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

import java.io.File;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/resources",
        glue = {"stepDef"},
        tags = {"@OrderTShirt"},
        plugin = { "com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
        monochrome = true

)
public class TestRunner {
    @AfterClass
    public static void writeReport() {
        Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getPropReader().getReportConfigPath()));
    }

}
