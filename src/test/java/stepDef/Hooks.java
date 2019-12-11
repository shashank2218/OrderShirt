package stepDef;

import com.google.common.io.Files;
import com.vimalselvam.cucumber.listener.Reporter;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import utils.PropReader;
import managers.DriverManager;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class Hooks {

    WebDriver driver;
    PropReader propReader = new PropReader();
    DriverManager driverManager = new DriverManager();

    @Before
    public void setUp() {
        PropertyConfigurator.configure("config/log4j.properties");
        driver = driverManager.getDriver();
        driver.get(propReader.getApplicationUrl());

    }

    @After(order = 1)
    public void afterScenario(Scenario scenario) {

        if (scenario.isFailed()) {
            String ssName = scenario.getName().replaceAll(" ", "_");
            try {
                File srcPath = ((TakesScreenshot)driverManager.getDriver()).getScreenshotAs(OutputType.FILE);

                File destPath = new File(System.getProperty("user.dir") + "/target/cucumber-reports/screenshots/" + ssName + ".png");

                Files.copy(srcPath, destPath);

                Reporter.addScreenCaptureFromPath(destPath.toString());
            } catch (IOException e) {
            }
        }
    }

    @After(order = 0)
    public void tearDown() {

        driverManager.closeDriver();

    }

}
