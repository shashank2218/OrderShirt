package stepDef;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import managers.DriverManager;
import managers.FileReaderManager;
import managers.PageObjectManager;
import pages.*;
import pages.SignUpDet;


public class StepDefinitionOrder {

    DriverManager driverManager;
    PageObjectManager pom;
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

    @Given("^user is on home page$")
    public void navToHomePage() throws Throwable {
        pom = new PageObjectManager(driverManager.getDriver());
        homePage = pom.getHomePage();
        homePage.clkSignIn();
    }

    @When("^user sign up to the application$")
    public void signUpApplication() throws Throwable {

        signIn = pom.getSignInPage();
        SignUpDet signUpDet = FileReaderManager.getInstance().getJsonReader().getCustomerData();
        signIn.createEmail(signUpDet);

        createAcc = pom.getCreateAccPage();
        createAcc.selectGender();
        createAcc.fillDetails(signUpDet);
        createAcc.clkRegister();
    }

    @And("^order a shirt$")
    public void orderAShirt() throws Throwable {

        myAccount = pom.getMyAccountPage();
        myAccount.clkTShirt();

        tShirt = pom.getTShirtPage();
        tShirt.selectTshirt();

        cartSummary = pom.getCartSummaryPage();
        cartSummary.clkProccedToCheckout();

        addresses = pom.getAddressesPage();
        addresses.clkProccedToCheckout();

        shipping = pom.getShippingPage();
        shipping.clkChkTerms();
        shipping.clkProccedToCheckout();

        payment = pom.getPaymentPage();
        payment.clkPayBankWire();

        orderSummary = pom.getOrderSummaryPage();
        orderSummary.clkConfirmOrder();

    }

    @Then("^success msg is displayed$")
    public void successMsgDisplayed() throws Throwable {

        orderConfirmation = pom.getOrderConfirmationPage();
        orderConfirmation.confirmMsg();
    }

}
