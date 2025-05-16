package com.revature.step;

import static com.revature.TestRunner.*;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RemoveFindingsSteps {


    // Shared steps
    @When("the user presses the Delete button")
    public void the_user_presses_the_button() {
        homePage.clickDeleteButton();
    }
    @Then("expected result should be that the table is refresh with the correct data deleted {string}")
    public void expected_result_should_be_that_the_table_is_refresh_with_the_correct_data_deleted(String name) {

        Assert.assertTrue(homePage.findNewRow(name).isEmpty());
    }

    // Happy Path
    @When("the user provides details for the celestial name {string} they wish to delete")
    public void the_user_provides_invalid_name_for_the_celestial_name_they_wish_to_delete(String name) {
        homePage.enterDeleteInput(name);
    }

    //Sad path testing for deleting planet
    // Shares with happy path for planet

    // Sad path testing for deleting moon
    // Shares with happy path for moon
}
