package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class CreateAcc {

    WebDriver driver;

    @FindBy(id="id_gender1")
    WebElement rdbGender;

    @FindBy(id="customer_firstname")
    WebElement txtFName;

    @FindBy(id="customer_lastname")
    WebElement txtLName;

    @FindBy(id="passwd")
    WebElement txtPass;

    @FindBy(id="days")
    WebElement ddDays;

    @FindBy(id="months")
    WebElement ddMonth;

    @FindBy(id="years")
    WebElement ddYear;

    @FindBy(id="address1")
    WebElement txtAdd1;

    @FindBy(id="city")
    WebElement txtCity;

    @FindBy(id="id_state")
    WebElement ddState;

    @FindBy(id="postcode")
    WebElement txtZip;

    @FindBy(id="phone_mobile")
    WebElement txtMob;

    @FindBy(id="submitAccount")
    WebElement btnRegister;



    public CreateAcc(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void selectGender() throws InterruptedException {
        Thread.sleep(2000);
        rdbGender.click();
    }

    public void enterFName(String fname) {
        txtFName.sendKeys(fname);
    }

    public void enterLName(String lname) {
        txtLName.sendKeys(lname);
    }

    public void enterPass(String pass) {
        txtPass.sendKeys(pass);
    }

    public void selectDay(String date) {
        Select day = new Select(ddDays);
        day.selectByValue(date);
    }

    public void selectMonth(String mnth) {
        Select month = new Select(ddMonth);
        month.selectByValue(mnth);
    }

    public void selectYear(String yr) {
        Select year = new Select(ddYear);
        year.selectByValue(yr);
    }

    public void enterAdd(String add){
        txtAdd1.sendKeys(add);
    }

    public void enterCity(String city) {
        txtCity.sendKeys(city);
    }

    public void selectState(String st) {
        Select state = new Select(ddState);
        state.selectByVisibleText(st);
    }

    public void enterZip(String zp) {
        txtZip.sendKeys(zp);
    }

    public void enterMob(String mob) {
        txtMob.sendKeys(mob);
    }

    public void clkRegister() {
        btnRegister.click();
    }

    //Fill details for sign up
    public void fillDetails(SignUpDet signUpDet) {
        enterFName(signUpDet.getFirstName());
        enterLName(signUpDet.getLastName());
        enterPass(signUpDet.getPassword());
        selectDay(signUpDet.getDay());
        selectMonth(signUpDet.getMonth());
        selectYear(signUpDet.getYear());
        enterAdd(signUpDet.getAdd1());
        enterCity(signUpDet.getCity());
        selectState(signUpDet.getState());
        enterZip(signUpDet.getZip());
        enterMob(signUpDet.getMob());
    }
}
