package tests.yandex;

import helper.yandex.ComposeMailHelper;
import helper.yandex.LoginHelper;
import org.testng.annotations.BeforeClass;
import pageObjects.yandex.Drafts;
import pageObjects.yandex.MailBoxPage;
import pageObjects.yandex.SentMailPage;

/**
 * Created by Liliia_Klymenko on 02-Jun-15.
 */
public class BaseTestYandex {


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
