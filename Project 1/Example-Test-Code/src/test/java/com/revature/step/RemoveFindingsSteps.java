package com.revature.step;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RemoveFindingsSteps {
    @Given("the user is logged in and on their home page.")
    public void the_user_is_logged_in_and_on_their_home_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("the user has selected {string} on their drop down.")
    public void the_user_has_selected_on_their_drop_down(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("the user provides the valid data for the Planet they wish to delete.")
    public void the_user_provides_the_valid_data_for_the_planet_they_wish_to_delete() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("the user presses the {string} button.")
    public void the_user_presses_the_button(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("expected result should be that the table is refresh with the correct data deleted.")
    public void expected_result_should_be_that_the_table_is_refresh_with_the_correct_data_deleted() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }



    @When("the user provides the valid data for the Moon they wish to delete.")
    public void the_user_provides_the_valid_data_for_the_moon_they_wish_to_delete() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    //Sad path testing for deleteing planets

    @When("the user provides invalid name for the planet {string} they wish to delete.")
    public void the_user_provides_invalid_name_for_the_planet_they_wish_to_delete(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("expected result should be an Alert message \"\"Invalid planet name\"\"")
    public void expected_result_should_be_an_alert_message_invalid_planet_name() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    // Sad path testing for deleting moon
    @When("the user provides invalid name for the moon {string} they wish to delete.")
    public void the_user_provides_invalid_name_for_the_moon_they_wish_to_delete(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("expected result should be an Alert message \"\"Invalid moon name\"\"")
    public void expected_result_should_be_an_alert_message_invalid_moon_name() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
