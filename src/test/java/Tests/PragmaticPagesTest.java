package Tests;

import Core.BaseTest;
import org.testng.annotations.Test;
import pages.FinalInformationPage;
import pages.RegisterAccountPage;
import pages.TitlePage;

public class PragmaticPagesTest extends BaseTest {

    @Test
    public void titlePageManipulation(){
        TitlePage.goTo();
        TitlePage.clickOfMyAccountButton();
        TitlePage.clickOfRegistrationButton();
    }

    public void writeInRegisterAccountPage(){
        RegisterAccountPage.writeInTheFirstnameInputField("Ivan");
        RegisterAccountPage.writeInTheLastnameInputField("Ivanov");
        RegisterAccountPage.writeEmail("something@pragmatic.bg");
        RegisterAccountPage.writePhoneNumber("0884567892");
        RegisterAccountPage.writePassword("11111");
        RegisterAccountPage.confirmPassword("11111");
        RegisterAccountPage.checkPrivacyPolicyBox();
        RegisterAccountPage.clickOfTheContinueButton();
    }

    public void checkWithAssert(){
        FinalInformationPage.AssertIfAccountIsCreated();
    }
}
