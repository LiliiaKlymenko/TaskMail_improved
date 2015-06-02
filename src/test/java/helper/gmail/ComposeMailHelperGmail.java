package helper.gmail;

import pageObjects.gmail.ComposeMailPage;
import pageObjects.gmail.Drafts;

/**
 * Created by Liliia_Klymenko on 25-May-15.
 */
public class ComposeMailHelperGmail {

    ComposeMailPage composeMailPage = new ComposeMailPage();
    Drafts drafts = new Drafts();


    public ComposeMailHelperGmail composeMail(String recipient, String subject, String mailText){        
        composeMailPage.
                fillRecipient(recipient).
                fillSubject( subject).
                fillMailText(mailText).
                saveAsDraft();
        return this;
    }


    public ComposeMailHelperGmail sendMail(){
        drafts.sendMail().openSentMail();
        return this;
    }


}
