package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shipping {

    WebDriver driver;

    @FindBy(id = "cgv")
    WebElement chkbxTermsCond;

    @FindBy(xpath = "//*[@id='form']/p/button")
    WebElement btnProcessToCheckout;

    public Shipping(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clkChkTerms() {
        chkbxTermsCond.click();
    }

    public void clkProccedToCheckout() {
        btnProcessToCheckout.click();
    }
}
