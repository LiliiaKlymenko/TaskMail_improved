package pageObjects.gmail;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageObjects.iua.Page;
import webDriverFactory.BrowserAction;

/**
 * Created by Liliia_Klymenko on 26-May-15.
 */
public class SentMailPage extends Page {

    private BrowserAction action = new BrowserAction();

    @FindBy(xpath = "//div[4]/div/div/table/tbody/tr/td[4]/div[2]")
    private WebElement lastMailRecipient;

    @FindBy(xpath = "//a[contains(text(),'liliia.klymenko@gmail.com')]")
    private WebElement buttonSettings;

    @FindBy(xpath = "//a[contains(@href, 'https://mail.google.com/mail/logout?hl=ru')]")
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
