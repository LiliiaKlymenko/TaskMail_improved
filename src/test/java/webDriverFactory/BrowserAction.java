package webDriverFactory;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

/**
 * Created by Lili on 24.05.2015.
 */
public class BrowserAction {

    public  void textSet(WebElement element, String text){
        element.sendKeys(text);
    }

    public  void buttonClick(WebElement element){
        element.click();
    }

    public  void sendKey(WebElement element){
        element.sendKeys(Keys.CONTROL, Keys.ENTER);
    }




}
