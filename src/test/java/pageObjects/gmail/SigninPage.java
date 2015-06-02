package pageObjects.gmail;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import webDriverFactory.BrowserAction;

/**
 * Created by Lili on 24.05.2015.
 */
public class SigninPage extends Page {

    @FindBy (xpath = "//input[contains(@name,'Email')]")
    private WebElement usernameTextBox;

    @FindBy (xpath = "//input[contains(@name,'Passwd')]")
    private WebElement passwordTextBox;

    @FindBy (xpath = "//input[@id='signIn']")
    private WebElement loginButton;

    @FindBy (xpath = "//input[contains(@id,'next')]")
    private WebElement nextButton;


    private BrowserAction action = new BrowserAction();



    public static SigninPage getSigninPage() {
        SigninPage signinPage = new SigninPage();
        InitPage(signinPage);
        return signinPage;
        }

    public SigninPage openSignInPage(String iua) {
        driver.get(iua);
        return getSigninPage();
    }

    public SigninPage enterLogin(String login){
        waiter.Waiter.waitForPresenceOfElementLocated(usernameTextBox, driver);
        action.textSet(usernameTextBox, login);
        return getSigninPage();
    }

    public SigninPage enterPassword(String pass){
        waiter.Waiter.waitForVisibilityOfElementLocated(passwordTextBox, driver);
        action.textSet(passwordTextBox, pass);
        return getSigninPage();
    }

    public SigninPage clickLoginButton(){
        action.buttonClick(loginButton);
        return getSigninPage();
    }

    public SigninPage clickNextButton(){
        action.buttonClick(nextButton);
        return getSigninPage();
    }



}
