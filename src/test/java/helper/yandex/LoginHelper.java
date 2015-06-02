package helper.yandex;

import pageObjects.yandex.Page;
import pageObjects.yandex.SigninPage;

/**
 * Created by Lili on 24.05.2015.
 */
public class LoginHelper {



    SigninPage signinPage = new SigninPage();

    public LoginHelper signIn(String yandex, String login, String pass) {
        Page.InitPage(signinPage);
        signinPage.
                openSignInPage(yandex).
                enterLogin(login).
                enterPassword(pass).
                clickLoginButton();
        return this;
    }

}
