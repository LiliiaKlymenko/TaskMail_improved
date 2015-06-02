package helper.iua;

import pageObjects.iua.ComposeMailPage;
import pageObjects.iua.Drafts;
import pageObjects.iua.Page;

/**
 * Created by Liliia_Klymenko on 25-May-15.
 */
public class ComposeMailHelper {

    ComposeMailPage composeMailPage = new ComposeMailPage();
    Drafts drafts = new Drafts();


    public ComposeMailHelper composeMail(String recipient, String subject, String mailText){
        Page.InitPage(composeMailPage);
        composeMailPage.
                fillRecipient(recipient).
                fillSubject( subject).
                fillMailText(mailText).
                saveAsDraft();
        return this;
    }


    public ComposeMailHelper sendMail(){
        drafts.sendMail().openSentMail();
        return this;
    }


}
