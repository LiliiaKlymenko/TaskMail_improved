package tests.iua;

import helper.iua.ComposeMailHelper;
import helper.iua.LoginHelper;
import org.testng.annotations.BeforeClass;
import pageObjects.iua.Drafts;
import pageObjects.iua.MailBoxPage;
import pageObjects.iua.SentMailPage;

public class BaseTestIua {


    protected static LoginHelper loginHelper;
    protected static ComposeMailHelper composeMailHelper;
    protected static MailBoxPage mailBoxPage;
    protected static SentMailPage sentMailPage;
    protected static Drafts drafts;



    @BeforeClass
    public void initPages() {
        loginHelper = new LoginHelper();
        composeMailHelper = new ComposeMailHelper();
        mailBoxPage = MailBoxPage.getMailBoxPage();
        sentMailPage = SentMailPage.getSentMailPage();
        drafts = Drafts.getDraftsPage();
    }


}
