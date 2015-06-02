package helper.gmail;

import pageObjects.gmail.Page;
import pageObjects.gmail.SigninPage;

/**
 * Created by Lili on 24.05.2015.
 */
public class LoginHelperGmail {



    SigninPage signinPage = new SigninPage();

    public LoginHelperGmail signIn(String gmail, String login, String pass) {
        Page.InitPage(signinPage);
        signinPage.
                openSignInPage(gmail).
                enterLogin(login).
                clickNextButton().
                enterPassword(pass).
                clickLoginButton();
        return this;
    }

}
