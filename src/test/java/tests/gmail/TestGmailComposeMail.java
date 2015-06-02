package tests.gmail;


import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Liliia_Klymenko on 25-May-15.
 */
 public class TestGmailComposeMail extends BaseTestGmail {

    String MAIL_TEXT = "hello";
    String RECIPIENT = "lilialexxx@mail.ru";
    String SUBJECT = "tests";

    String LOGIN = "liliia.klymenko";
    String PASS = "Mun123456";
    String GMAIL = "https://mail.google.com/";
    String DISPLAYED_USERNAME = "liliia.klymenko@gmail.com";




    @Test
    public void testMailBox() {
        loginHelperGmail.
                signIn(GMAIL, LOGIN, PASS);
        Assert.assertEquals(mailBoxPage.getActualUserName(), DISPLAYED_USERNAME);
        mailBoxPage.startCreatingNewMail();
        composeMailHelperGmail.composeMail(RECIPIENT, SUBJECT, MAIL_TEXT);
        drafts.openDrafts();
        Assert.assertEquals(drafts.getActualLastMailRecipient(), RECIPIENT, "Wrong recipient " + drafts.getActualLastMailRecipient());
        drafts.openDraftMail();
        Assert.assertEquals(drafts.getActualSubject(), SUBJECT, "Wrong subject " + drafts.getActualSubject());
        Assert.assertEquals(drafts.getActualMail(), MAIL_TEXT, "Wrong mail text " + drafts.getActualMail());
        composeMailHelperGmail.sendMail();
        Assert.assertEquals(sentMailPage.getActualLastMailRecipient(), RECIPIENT, "Wrong recipient " + sentMailPage.getActualLastMailRecipient());
        sentMailPage.exit();
    }

}
