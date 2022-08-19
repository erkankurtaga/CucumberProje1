package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterContent extends Parent{

    public RegisterContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(linkText = "Register")
    private WebElement registerLink;

    @FindBy(id="customer.firstName")
    private WebElement firstNameInput;

    @FindBy(id="customer.lastName")
    private WebElement lastNameInput;

    @FindBy(id="customer.address.street")
    private WebElement addressInput;

    @FindBy(id="customer.address.city")
    private WebElement cityInput;

    @FindBy(id="customer.address.state")
    private WebElement stateInput;

    @FindBy(id="customer.address.zipCode")
    private WebElement zipCodeInput;

    @FindBy(id = "customer.phoneNumber")
    private WebElement phoneInput;

    @FindBy(id = "customer.ssn")
    private WebElement ssnInput;

    @FindBy(id = "customer.username")
    private WebElement userNameInput;

    @FindBy(id = "customer.password")
    private WebElement passwordInput;

    @FindBy(id = "repeatedPassword")
    private WebElement confirmPasswordInput;

    @FindBy(xpath = "//input[@value='Register']")
    private WebElement registerButton;

    @FindBy(css = "[id='rightPanel'] p")
    private WebElement success;

    WebElement myElement;
    public void findAndSend(String strElement, String value){  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement)
        {
            case "firstName" : myElement = firstNameInput; break;
            case "lastName" : myElement = lastNameInput; break;
            case "address" : myElement = addressInput; break;
            case "city" : myElement = cityInput; break;
            case "state" : myElement = stateInput; break;
            case "zipCode" : myElement = zipCodeInput; break;
            case "phone" : myElement = phoneInput; break;
            case "ssn" : myElement = ssnInput; break;
            case "userName" : myElement = userNameInput; break;
            case "password" : myElement = passwordInput; break;
            case "confirmPassword" : myElement = confirmPasswordInput; break;
        }

        sendKeysFunction(myElement, value);
    }

    public void findAndClick(String strElement){  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement)
        {
            case "registerLink" : myElement =registerLink; break;
            case "registerButton" : myElement =registerButton; break;
        }

        clickFunction(myElement);
    }

    public void findAndContainsText(String strElement, String text){  // 2.aşama
        // burda string isimden weblemente ulaşıcam

        switch (strElement)
        {
            case "successfully" : myElement =success; break;
        }

        verifyContainsText(myElement,text);
    }

}
