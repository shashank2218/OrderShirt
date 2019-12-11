package managers;

import org.openqa.selenium.WebDriver;
import pages.*;

public class PageObjectManager {
    WebDriver driver;
    HomePage homePage;
    SignIn signIn;
    CreateAcc createAcc;
    MyAccount myAccount;
    TShirt tShirt;
    CartSummary cartSummary;
    Addresses addresses;
    Shipping shipping;
    Payment payment;
    OrderSummary orderSummary;
    OrderConfirmation orderConfirmation;
    PersonalInfo personalInfo;


    public PageObjectManager(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage getHomePage(){
        return homePage = new HomePage(driver);
    }

    public SignIn getSignInPage(){
        return signIn = new SignIn(driver);
    }

    public CreateAcc getCreateAccPage() {
        return createAcc = new CreateAcc(driver);
    }

    public MyAccount getMyAccountPage(){
        return myAccount = new MyAccount(driver);
    }

    public TShirt getTShirtPage(){
        return tShirt = new TShirt(driver);
    }

    public CartSummary getCartSummaryPage() {
        return cartSummary = new CartSummary(driver);
    }


    public Addresses getAddressesPage(){
        return addresses = new Addresses(driver);
    }

    public Shipping getShippingPage(){
        return shipping = new Shipping(driver);
    }

    public Payment getPaymentPage(){
        return payment = new Payment(driver);
    }

    public OrderSummary getOrderSummaryPage(){
        return orderSummary = new OrderSummary(driver);
    }

    public OrderConfirmation getOrderConfirmationPage(){
        return orderConfirmation = new OrderConfirmation(driver);
    }

    public PersonalInfo getPersonalInfoPage() {
        return personalInfo = new PersonalInfo(driver);
    }

}
