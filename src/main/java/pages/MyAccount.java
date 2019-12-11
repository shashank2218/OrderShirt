package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccount {

    WebDriver driver;

    @FindBy(xpath = "//*[@id='block_top_menu']/ul/li[3]")
    WebElement lblTShirt;

    @FindBy(xpath = "//*[@id='footer']/div/section[5]/div/ul/li[4]/a")
    WebElement lblPersonalInfo;

    public MyAccount(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clkTShirt() {
        lblTShirt.click();
    }

    public void clkPersonalInfo() {
        lblPersonalInfo.click();
    }
}
