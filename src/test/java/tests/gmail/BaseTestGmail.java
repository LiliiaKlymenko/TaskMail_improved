package tests.gmail;

import helper.gmail.ComposeMailHelperGmail;
import helper.gmail.LoginHelperGmail;
import org.testng.annotations.BeforeClass;
import pageObjects.gmail.Drafts;
import pageObjects.gmail.MailBoxPage;
import pageObjects.gmail.SentMailPage;

/**
 * Created by Liliia_Klymenko on 02-Jun-15.
 */
public class BaseTestGmail {


    protected static LoginHelperGmail loginHelperGmail;
    protected static ComposeMailHelperGmail composeMailHelperGmail;
    protected static MailBoxPage mailBoxPage;
    protected static SentMailPage sentMailPage;
    protected static Drafts drafts;



    @BeforeClass
    public void initPages() {
        loginHelperGmail = new LoginHelperGmail();
        composeMailHelperGmail = new ComposeMailHelperGmail();
        mailBoxPage = MailBoxPage.getMailBoxPage();
        sentMailPage = SentMailPage.getSentMailPage();
        drafts = Drafts.getDraftsPage();
    }


}
