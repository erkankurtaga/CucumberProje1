package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginContent extends Parent{

    public LoginContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }


    @FindBy(name = "username")
    private WebElement userNameInput;

    @FindBy(name = "password")
    private WebElement passwordInput;

    @FindBy(xpath = "//input[@value='Log In']")
    private WebElement loginButton;

    @FindBy(css = "div[id='rightPanel'] h1")
    private WebElement title;

    @FindBy(linkText = "Log Out")
    private WebElement logoutLink;
    WebElement myElement;
    public void findAndSend(String strElement, String value){  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement)
        {
            case "username" : myElement = userNameInput; break;
            case "password" : myElement = passwordInput; break;
        }

        sendKeysFunction(myElement, value);
    }

    public void findAndClick(String strElement){  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement)
        {
            case "loginButton" : myElement =loginButton; break;
            case "logoutLink"  : myElement = logoutLink; break;
        }

        clickFunction(myElement);
    }

    public void findAndContainsText(String strElement, String text){  // 2.aşama
        // burda string isimden weblemente ulaşıcam

        switch (strElement)
        {
            case "title" : myElement =title; break;
        }

        verifyContainsText(myElement,text);
    }

}
