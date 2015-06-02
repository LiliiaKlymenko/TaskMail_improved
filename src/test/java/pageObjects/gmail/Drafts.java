package pageObjects.gmail;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageObjects.iua.Page;
import webDriverFactory.BrowserAction;

/**
 * Created by Liliia_Klymenko on 25-May-15.
 */
public class Drafts extends Page {


    @FindBy(xpath = "//div[2]/span/input[1]")
    private WebElement subjectTextField;

    @FindBy(xpath = "//td[2]/div[2]/div")
    private WebElement mailTextField;

    @FindBy(xpath = "//button[@id='compose-submit']")
    private WebElement buttonSend;

    @FindBy(xpath = "//div[4]/div/div/table/tbody/tr/td[4]/div[2]")
    private WebElement lastMailRecipient;

    @FindBy(xpath = "//a[contains(@href, 'https://mail.google.com/mail/#sent')]")
    private WebElement linkSentMail;

    @FindBy(xpath = "//a[contains(@href, 'https://mail.google.com/mail/#drafts')]")
    private WebElement toDrafts;



    private BrowserAction action = new BrowserAction();
    public static Drafts getDraftsPage() {
        Drafts drafts = new Drafts();
        InitPage(drafts);
        return drafts;
    }

    public String getActualLastMailRecipient() {
        waiter.Waiter.waitForPresenceOfElementLocated(lastMailRecipient, driver);
        String actualLastMailRecipient = lastMailRecipient.getText().trim();
        return actualLastMailRecipient;
    }

    public Drafts openDrafts() {
        waiter.Waiter.waitForPresenceOfElementLocated(toDrafts, driver);
        action.buttonClick(toDrafts);
        return getDraftsPage();
    }

    public String getActualSubject() {
        String actualSubject = subjectTextField.getText().trim();
       return actualSubject;
    }

    public String getActualMail() {
        String actualMail = mailTextField.getText().trim();
        return actualMail;

    }


    public Drafts openDraftMail() {
        action.buttonClick(lastMailRecipient);
        return getDraftsPage();
    }


    public Drafts sendMail() {
        action.buttonClick(buttonSend);
        return getDraftsPage();
    }

    public Drafts openSentMail() {
        action.buttonClick(linkSentMail);
        return getDraftsPage();
    }




}
