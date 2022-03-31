package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class RegisterAccountPage {

    @FindBy(id = "input-firstname")
    private static WebElement firstNameBar;

    @FindBy(id = "input-lastname")
    private static WebElement lastNameBar;

    @FindBy(id = "input-email")
    private static WebElement email;

    @FindBy(id = "input-telephone")
    private static WebElement phoneNumber;

    @FindBy(id = "input-password")
    private static WebElement passwordBar;

    @FindBy(id = "input-confirm")
    private static WebElement confirmPasswordBar;

    @FindBy(name = "agree")
    private static WebElement privacyPolicyBox;

    @FindBy(css = "[value='Continue']")
    private static WebElement continueButton;

    static {
        PageFactory.initElements(Browser.driver, RegisterAccountPage.class);
    }

    /**
     * This method inserts the Firstname.
     */
    public static void writeInTheFirstnameInputField(String firstname) {
        firstNameBar.sendKeys(firstname);
    }

    /**
     * This method inserts the Lastname.
     */
    public static void writeInTheLastnameInputField(String lastname) {
        lastNameBar.sendKeys(lastname);
    }

    /**
     * This method inserts random email.
     */
    public static void writeEmail(String randomMail) {
        email.sendKeys(randomMail);
    }

    /**
     * This method inserts random phone number.
     */
    public static void writePhoneNumber(String randomNumber) {
        phoneNumber.sendKeys(randomNumber);
    }

    /**
     * This method inserts password.
     */
    public static void writePassword(String pass) {
        passwordBar.sendKeys(pass);
    }

    /**
     * This method confirm password.
     */
    public static void confirmPassword(String pass) {
        confirmPasswordBar.sendKeys(pass);
    }

    /**
     * This method check privacy policy box.
     */
    public static void checkPrivacyPolicyBox() {
        if(!privacyPolicyBox.isSelected());
        privacyPolicyBox.click();
    }

    /**
     * This method click of the continue button.
     */
    public static void clickOfTheContinueButton() {
        continueButton.click();
    }
}