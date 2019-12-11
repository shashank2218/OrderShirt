package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TShirt {

    WebDriver driver;

    @FindBy(xpath = "//*[@id='center_column']/ul/li/div/div[2]/div[2]/a[1]")
    WebElement btnAddToCart;

    @FindBy(xpath = "//*[@id='layer_cart']/div[1]/div[2]/div[4]/a")
    WebElement btnProcessToCheckout;

    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img")
    WebElement imgHover;

    public TShirt(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clkAddToCart() {

        Actions action = new Actions(driver);
        WebElement target = imgHover;
        action.moveToElement(target).perform();
        btnAddToCart.click();
    }

    public void clkProceedToCheckout() {
        btnProcessToCheckout.click();
    }

    public void selectTshirt() {
        clkAddToCart();
        clkProceedToCheckout();
    }


}
