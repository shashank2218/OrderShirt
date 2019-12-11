package pages;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class OrderConfirmation {

    WebDriver driver;
    private Logger logger;


    @FindBy(xpath = "//*[@id='center_column']/div/p/strong")
    WebElement lblSuccessMsg;


    public OrderConfirmation(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        logger=Logger.getLogger(OrderConfirmation.class.getName());
    }

    public void confirmMsg() {
        lblSuccessMsg.isDisplayed();
        logger.info("Order is placed successfully");
    }

}
