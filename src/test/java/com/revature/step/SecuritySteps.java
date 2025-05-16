package com.revature.step;

import static com.revature.TestRunner.*;

import com.revature.pom.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SecuritySteps {


//   Shared Steps

    @When("the user provides their login username {string}")
    public void the_user_provides_their_login_username(String username) {
        loginPage.enterUsername(username);
    }
    @And("the user provides their login password {string}")
    public void the_user_provides_their_login_password(String password) {
        loginPage.enterPassword(password);
    }
    @And("the user clicks on login")
    public void the_user_clicks_on_login() {
        loginPage.clickLoginButton();
    }


//  Happy Path
    @Then("the user should be redirected to their home page")
    public void the_user_should_be_redirected_to_their_home_page() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
        wait.until(driver -> homePage.getTitle().equals("Home"));
        Assert.assertEquals(homePage.getTitle(), driver.getTitle());
    }


//  Sad Path

    @Then("the user should be remain on the login page")
    public void the_user_should_be_remain_on_the_login_page() {
        Assert.assertEquals(loginPage.getTitle(), driver.getTitle());
    }

}
