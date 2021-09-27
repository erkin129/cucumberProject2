package com.amazon.step_definitions;

import com.amazon.pages.Loginpage;
import com.amazon.utilities.ConfigurationReader;
import com.amazon.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefs {
    Loginpage loginpage = new Loginpage();
    String email,password;
    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        Driver.get().get(ConfigurationReader.get("url"));
    }
    @When("the user enter the valid credentials")
    public void the_user_enter_the_valid_credentials() {
        email = ConfigurationReader.get("email");
        loginpage.putUsername(email);
        password = ConfigurationReader.get("password");
        loginpage.putPassword(password);
    }
    @Then("the user should be logged in")
    public void the_user_should_be_logged_in() {
        System.out.println("true");
    }
}
