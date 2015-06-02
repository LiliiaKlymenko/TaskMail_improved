package pageObjects.gmail;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import webDriverFactory.BrowserAction;


/**
 * Created by Lili on 24.05.2015.
 */
public class MailBoxPage extends Page {

    @FindBy(xpath = "//div[2]/div/div/div/div[2]/div/div/div/div/div")
    private WebElement linkCreateNewMail;

    @FindBy (xpath = "//div[4]/div/a")
    private WebElement linkUserName;

    private BrowserAction action = new BrowserAction();


    public static MailBoxPage getMailBoxPage() {
        MailBoxPage mailBoxPage = new MailBoxPage();
        InitPage(mailBoxPage);
        return mailBoxPage;
    }


    public MailBoxPage startCreatingNewMail(){
        action.buttonClick(linkCreateNewMail);
        return getMailBoxPage();
    }

    public String getActualUserName() {
        String actualUserName = linkUserName.getText().trim();
        return  actualUserName;
    }


}


