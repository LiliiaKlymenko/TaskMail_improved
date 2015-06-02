package pageObjects.yandex;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import webDriverFactory.BrowserAction;

/**
 * Created by Liliia_Klymenko on 26-May-15.
 */
public class SentMailPage extends Page {

    private BrowserAction action = new BrowserAction();

    @FindBy(xpath = "(//*[@class='b-messages__from__text'])[3]")
    private WebElement lastMailRecipient;

    @FindBy(xpath = ".header-user-name.js-header-user-name")
    private WebElement buttonSettings;

    @FindBy(xpath = ".//*[@id='user-dropdown-popup']/div/div/div[11]/a")
    private WebElement buttonExit;




    public static SentMailPage getSentMailPage() {
        SentMailPage sentMailPage = new SentMailPage();
        InitPage(sentMailPage);
        return sentMailPage;
    }

    public String getActualLastMailRecipient() {
        String actualLastMailRecipient = lastMailRecipient.getText();
        return actualLastMailRecipient;
    }

    public void exit() {
        action.buttonClick(buttonSettings);
        waiter.Waiter.waitForPresenceOfElementLocated(buttonExit, driver);
        action.buttonClick(buttonExit);
    }
}
