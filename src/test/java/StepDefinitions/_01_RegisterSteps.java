package StepDefinitions;

import Pages.RegisterContent;
import Utilities.GWD;
import io.cucumber.java.en.*;

public class _01_RegisterSteps {

    RegisterContent rc = new RegisterContent();

    @Given("Navigate to parasoft")
    public void navigateToParasoft() {
        GWD.getDriver().get("https://parabank.parasoft.com");
        GWD.getDriver().manage().window().maximize();
    }

    @When("Click register link")
    public void clickRegisterLink() {
        rc.findAndClick("registerLink");
    }

    @And("Enter valid user information to register form and Click register button")
    public void enterValidUserInformationToRegisterFormAndClickRegisterButton() {
        rc.findAndSend("firstName","Group6");
        rc.findAndSend("lastName","TechnoStudy");
        rc.findAndSend("address","Turkey");
        rc.findAndSend("city","Bursa");
        rc.findAndSend("state","Turkey");
        rc.findAndSend("zipCode","12345");
        rc.findAndSend("phone","0123456789");
        rc.findAndSend("ssn","0123456789");
        rc.findAndSend("userName","group6");
        rc.findAndSend("password","123456");
        rc.findAndSend("confirmPassword","123456");
        rc.findAndClick("registerButton");
    }

    @Then("User should be registered successfully")
    public void userShouldBeRegisteredSuccessfully() {
        rc.findAndContainsText("successfully","successfully");
    }
}
