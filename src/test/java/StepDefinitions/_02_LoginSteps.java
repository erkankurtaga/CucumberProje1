package StepDefinitions;

import Pages.LoginContent;
import io.cucumber.java.en.*;

public class _02_LoginSteps {
    LoginContent lc = new LoginContent();
    @When("Enter username as {string} and password as {string} and click login button")
    public void enterUsernameAsAndPasswordAsAndClickLoginButton(String userName, String password) {
        lc.findAndSend("username",userName);
        lc.findAndSend("password",password);
        lc.findAndClick("loginButton");
    }

    @Then("User should login successfuly")
    public void userShouldLoginSuccessfuly() {
        lc.findAndContainsText("title","Accounts Overview");
        //lc.findAndClick("logoutLink");
    }

    @Then("User should login unsuccessfuly")
    public void userShouldLoginUnsuccessfuly() {
        lc.findAndContainsText("title","Error");
    }
}
