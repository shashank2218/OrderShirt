package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignIn {
    WebDriver driver;

    @FindBy(id="email_create")
    WebElement txtCreateEmail;

    @FindBy(id="SubmitCreate")
    WebElement btnCreateEmail;

    @FindBy(id="email")
    WebElement txtEmail;

    @FindBy(id="passwd")
    WebElement txtPassword;

    @FindBy(id="SubmitLogin")
    WebElement btnSignIn;

    public SignIn(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterEmail(String email) {
        txtCreateEmail.sendKeys(email);
    }

    public void clkCreateEmail() {
        btnCreateEmail.click();
    }

    public void createEmail(SignUpDet signUpDet) {
        enterEmail(signUpDet.getEmail());
        clkCreateEmail();
    }

    public void enterId(String id) {
        txtEmail.sendKeys(id);
    }

    public void enterPass(String pass) {
        txtPassword.sendKeys(pass);
    }

    public void clkSignIn() {
        btnSignIn.click();
    }

    public void signIn(SignUpDet signUpDet) {
        enterId(signUpDet.getEmail());
        enterPass(signUpDet.getPassword());
        clkSignIn();
    }
}
