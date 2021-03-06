package tests.yandex;

import org.testng.Assert;
import org.testng.annotations.Test;
/**
 * Created by Liliia_Klymenko on 25-May-15.
 */
 public class TestYandexComposeMailYandex extends BaseTestYandex {

    String MAIL_TEXT = "hello";
    String RECIPIENT = "lilialexxx@mail.ru";
    String SUBJECT = "tests";

    String LOGIN = "liliia.klymenko";
    String PASS = "Mun123456";
    String YANDEX = "http://www.yandex.ua/";
    String DISPLAYED_USERNAME = "liliia.klymenko@yandex.ru";



    @Test
    public void testMailBox()  {
        loginHelper.
                signIn(YANDEX, LOGIN, PASS);
        Assert.assertEquals(mailBoxPage.getActualUserName(), DISPLAYED_USERNAME);
        mailBoxPage.startCreatingNewMail();
        composeMailHelper.composeMail(RECIPIENT, SUBJECT, MAIL_TEXT);
        drafts.openDrafts();
        Assert.assertEquals(drafts.getActualLastMailRecipient(), RECIPIENT, "Wrong recipient " + drafts.getActualLastMailRecipient());
        drafts.openDraftMail();
        Assert.assertEquals(drafts.getActualSubject(), SUBJECT, "Wrong subject " + drafts.getActualSubject());
        Assert.assertEquals(drafts.getActualMail(), MAIL_TEXT, "Wrong mail text " + drafts.getActualMail());
        composeMailHelper.sendMail();
        Assert.assertEquals(sentMailPage.getActualLastMailRecipient(), RECIPIENT, "Wrong recipient " + sentMailPage.getActualLastMailRecipient());
        sentMailPage.exit();
    }

}