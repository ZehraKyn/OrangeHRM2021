package com.OrangeHrm.stepdefinitions;

import com.OrangeHrm.base.ConfigReader;
import com.OrangeHrm.pages.HomePage;
import com.OrangeHrm.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class LoginPageStepD {


    @Given("User on the login page")
    public void verifyTitleTest() {
        Assert.assertEquals("OrangeHRM", LoginPage.verifyTitle());
    }
    @When("User enter correct username in the username field")
    public void userEnterCorrectUsername() {
        LoginPage.enterUsername(ConfigReader.getProperty("username"));
    }

    @And("User enter correct password in the password field")
    public void userEnterCorrectPassword() {
        LoginPage.enterPassword(ConfigReader.getProperty("password"));
    }

    @And("User click on the login button")
    public void userClickOnTheLoginButton() {
        LoginPage.clickOnLoginBtn();
    }

    @Then("User see the home page")
    public void goToHomePage() {
        Assert.assertEquals("OrangeHRM", HomePage.verifyTitle());
    }

    @When("User enter incorrect username in the username field")
    public void enterInvalidUsername() {
        LoginPage.enterUsername(ConfigReader.getProperty("invalidusername"));
    }

    @And("User enter incorrect password in the password field")
    public void enterInvalidPassword(){
        LoginPage.enterPassword(ConfigReader.getProperty("invalidpassword"));
    }

    @Then("User see the error message on the login page")
    public void verifyErrorMessage(){
        Assert.assertEquals("Invalid credentials", LoginPage.getErrorMessage());
    }


}
