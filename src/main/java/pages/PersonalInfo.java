package pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.junit.Assert;



public class PersonalInfo {

    WebDriver driver;
    private Logger logger;

    @FindBy(id = "firstname")
    WebElement txtFirstname;

    @FindBy(id = "old_passwd")
    WebElement txtCurrentPass;

    @FindBy(xpath = "//*[@id='center_column']/div/form/fieldset/div[11]/button")
    WebElement btnSave;

    @FindBy(xpath =  "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]")
    WebElement lblName;

    public PersonalInfo(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        logger=Logger.getLogger(OrderConfirmation.class.getName());
    }

    public void clearFName() {
        txtFirstname.clear();
    }

    public void enterFirstName(String fname) {
        txtFirstname.sendKeys(fname);
    }

    public void enterCurrPass(String pass) {
        txtCurrentPass.sendKeys(pass);
    }

    public void clkSave() {
        btnSave.click();
    }

    public void verifyChangedName(SignUpDet signUpDet) {
        Assert.assertTrue(signUpDet.getChangeName(),lblName.getText().contains(signUpDet.getChangeName()));
    }

    //Change name
    public void changeName(SignUpDet signUpDet) {
        clearFName();
        enterFirstName(signUpDet.getChangeName());
        enterCurrPass(signUpDet.getPassword());
        clkSave();
        logger.info("Name changed successfully");

    }
}