package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartSummary {

    WebDriver driver;

    @FindBy(xpath = "//*[@id='center_column']/p[2]/a")
    WebElement btnProcessToCheckout;

    public CartSummary(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clkProccedToCheckout() {
        btnProcessToCheckout.click();
    }


}
