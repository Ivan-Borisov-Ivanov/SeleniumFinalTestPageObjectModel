package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class TitlePage {

    @FindBy(xpath = "//*[@class='caret'] /..")
    private static WebElement myAccountButton;

    @FindBy(xpath = "//*[text()='Register']")
    private static WebElement registerButton;

    static {
        PageFactory.initElements(Browser.driver, TitlePage.class);
    }

    /**
     * This method redirects you to the 'Login' page.
     */
    public static void goTo() {
        Browser.driver.get("http://shop.pragmatic.bg");
    }

    /**
     * This method clicks of My Account button.
     */
    public static void clickOfMyAccountButton() {
        myAccountButton.click();
    }

    /**
     * This method choose registration button.
     */

    public static void clickOfRegistrationButton() {
        registerButton.click();
    }
}
