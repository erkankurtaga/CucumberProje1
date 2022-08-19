package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BillPayContent extends Parent{

    public BillPayContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(linkText = "Bill Pay")
    private WebElement billPayLink;

    @FindBy(name="payee.name")
    private WebElement payeeNameInput;

    @FindBy(name="payee.address.street")
    private WebElement addressInput;

    @FindBy(name="payee.address.city")
    private WebElement cityInput;

    @FindBy(name="payee.address.state")
    private WebElement stateInput;

    @FindBy(name="payee.address.zipCode")
    private WebElement zipCodeInput;

    @FindBy(name="payee.phoneNumber")
    private WebElement phoneInput;

    @FindBy(name = "payee.accountNumber")
    private WebElement ssnInput;

    @FindBy(name = "payee.accountNumber")
    private WebElement accountInput;

    @FindBy(name = "verifyAccount")
    private WebElement verifyAccountInput;

    @FindBy(name = "amount")
    private WebElement amountInput;

    @FindBy(xpath = "//input[@value='Send Payment']")
    private WebElement sendPaymentButton;

    @FindBy(xpath = "(//h1[@class='title'])[2]")
    private WebElement title;

    WebElement myElement;
    public void findAndSend(String strElement, String value){  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement)
        {
            case "payeeName" : myElement = payeeNameInput; break;
            case "address" : myElement = addressInput; break;
            case "city" : myElement = cityInput; break;
            case "state" : myElement = stateInput; break;
            case "zipCode" : myElement = zipCodeInput; break;
            case "phone" : myElement = phoneInput; break;
            case "amount" : myElement = amountInput; break;
            case "account" : myElement = accountInput; break;
            case "verifyAccount" : myElement = verifyAccountInput; break;
        }

        sendKeysFunction(myElement, value);
    }

    public void findAndClick(String strElement){  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement)
        {
            case "billPay" : myElement =billPayLink; break;
            case "sendPayment" : myElement =sendPaymentButton; break;
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
