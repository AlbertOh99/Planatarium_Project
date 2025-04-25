package com.revature.step;

import static com.revature.TestRunner.*;

import com.revature.pom.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import java.util.List;

public class ViewFindingsSteps {



    @Given("the user logs in with their username {string} and password {string}")
    public void the_user_logs_in_with_their_username_and_password(String username, String password){
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickLoginButton();
    }
    @When("the new user creates an account")
    public void the_new_user_creates_an_account(){
        loginPage.clickRegistrationLink();
        registrationPage.enterUsername("viewTest");
        registrationPage.enterPassword("viewTest1");
        registrationPage.clickRegisterButton();
    }

    @Then("user should see a table of their own planets and moons")
    public void user_should_see_a_table_of_their_own_planets_and_moons() {
        Assert.assertTrue(homePage.getTableSize() > 1);
    }

    @Then("user should see an empty table of their own planets and moons")
    public void user_should_see_an_empty_table_of_their_own_planets_and_moons() {
        Assert.assertEquals(1, homePage.getTableSize());
    }

    @Then("Moon inputs should be present")
    public void Moon_inputs_should_be_present(){
        Assert.assertTrue(homePage.validateMoonInputs());
    }
}
