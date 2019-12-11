package stepDef;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import managers.DriverManager;
import managers.FileReaderManager;
import managers.PageObjectManager;
import pages.MyAccount;
import pages.PersonalInfo;
import pages.SignIn;
import pages.SignUpDet;

public class StepDefChangeName {

    DriverManager driverManager;
    PageObjectManager pom;
    SignIn signIn;
    MyAccount myAccount;
    PersonalInfo personalInfo;



    @When("^user sign into the account$")
    public void signIntoAccount() throws Throwable {
        pom = new PageObjectManager(driverManager.getDriver());
        signIn = pom.getSignInPage();
        SignUpDet signUpDet = FileReaderManager.getInstance().getJsonReader().getCustomerData();
        signIn.signIn(signUpDet);
    }


    @And("^change first name on Personal Information page$")
    public void changeName() throws Throwable {
        myAccount = pom.getMyAccountPage();
        myAccount.clkPersonalInfo();

        personalInfo = pom.getPersonalInfoPage();
        SignUpDet signUpDet = FileReaderManager.getInstance().getJsonReader().getCustomerData();
        personalInfo.changeName(signUpDet);
    }

    @Then("^changed name is displayed Personal Information page$")
    public void nameChangeMsgIsDisplayed() throws Throwable {
        personalInfo = pom.getPersonalInfoPage();
        SignUpDet signUpDet = FileReaderManager.getInstance().getJsonReader().getCustomerData();
        personalInfo.verifyChangedName(signUpDet);

    }
}
