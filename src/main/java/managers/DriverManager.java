package managers;

import enums.BrowserType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import java.util.concurrent.TimeUnit;

public class DriverManager {

    public static WebDriver driver;
    public static BrowserType browserType;

    public DriverManager() {
        browserType = FileReaderManager.getInstance().getPropReader().getBrowser();
    }

    public static WebDriver getDriver() {
        if(driver == null)
            driver = driverSetup();
        return driver;
    }


    public static WebDriver driverSetup() {
        switch (browserType) {
            case CHROME:
                System.setProperty("webdriver.chrome.driver", FileReaderManager.getInstance().getPropReader().getDriverPath());
                driver = new ChromeDriver();
                break;
            case FIREFOX:
                System.setProperty("webdriver.gecko.driver", FileReaderManager.getInstance().getPropReader().getDriverPath());
                driver = new FirefoxDriver();
                break;
            case INTERNETEXPLORER:
                System.setProperty("webdriver.ie.driver", FileReaderManager.getInstance().getPropReader().getDriverPath());
                driver = new InternetExplorerDriver();
                break;
        }

        if (FileReaderManager.getPropReader().getBrWinSize())
            driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(FileReaderManager.getPropReader().getImplicitlyWait(), TimeUnit.SECONDS);
    return driver;
    }


    public static WebDriver closeDriver() {
        driver.quit();
        return driver= null;
    }
}
