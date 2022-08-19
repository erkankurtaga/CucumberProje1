package StepDefinitions;

import Pages.BillPayContent;
import Pages.LoginContent;
import io.cucumber.java.en.*;

public class _03_BillPaySteps {
    LoginContent lc = new LoginContent();
    BillPayContent bc = new BillPayContent();
    @And("Enter Payee Name as {string} Amount as {string} Address as {string} City as {string} State as {string} ZipCode as {string} Phone as {string} Account as {string}  click send payment button")
    public void enterPayeeNameAsAmountAsAddressAsCityAsStateAsZipCodeAsPhoneAsAccountAsClickSendPaymentButton(String payeeName, String amount, String adress, String city, String state, String zipCode, String phone, String account) {
        bc.findAndSend("payeeName",payeeName);
        bc.findAndSend("address",adress);
        bc.findAndSend("city",city);
        bc.findAndSend("state",state);
        bc.findAndSend("zipCode",zipCode);
        bc.findAndSend("phone",phone);
        bc.findAndSend("account",account);
        bc.findAndSend("verifyAccount",account);
        bc.findAndSend("amount",amount);
        bc.findAndClick("sendPayment");
    }

    @Then("User should be payed the bill successfully")
    public void userShouldBePayedTheBillSuccessfully() {
        bc.findAndContainsText("title","Bill Payment Complete");
    }

    @When("Click Bill Pay Link")
    public void clickBillPayLink() {
        bc.findAndClick("billPay");
    }

    @When("Enter valid username as {string} and password as {string} click login button")
    public void enterValidUsernameAsAndPasswordAsClickLoginButton(String userName, String password) {
        lc.findAndSend("username",userName);
        lc.findAndSend("password",password);
        lc.findAndClick("loginButton");
    }
}
