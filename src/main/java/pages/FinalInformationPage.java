package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.Browser;

public class FinalInformationPage {

    @FindBy(css = "[id=content] h1")
    private static WebElement informationBar;

    static {
        PageFactory.initElements(Browser.driver, FinalInformationPage.class);
    }

    /**
     * This method Assert if account is created.
     */
    public static void AssertIfAccountIsCreated() {
        Assert.assertEquals(informationBar.getText(),"Your Account Has Been Created!");
    }
}
