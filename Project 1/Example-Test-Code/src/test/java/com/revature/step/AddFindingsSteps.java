package com.revature.step;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddFindingsSteps {
    // Happy path for Planets
    @Given("the user is logged in and on their home page.")
    public void the_user_is_logged_in_and_on_their_home_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("the user has selected Planet on their drop down.")
    public void the_user_has_selected_planet_on_their_drop_down() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("the user provides valid details for their planet name")
    public void the_user_provides_valid_details_for_their_planet_name() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("the correct file type if they want to add a picture to thier discovered planet.")
    public void the_correct_file_type_if_they_want_to_add_a_picture_to_thier_discovered_planet() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("the user clicks on the Submit Planet button")
    public void the_user_clicks_on_the_submit_planet_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("expected result should be the table refreshes with the correct updated information")
    public void expected_result_should_be_the_table_refreshes_with_the_correct_updated_information() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }



    // Happy path for Moons
    @Given("the user has selected Moon on their drop down.")
    public void the_user_has_selected_moon_on_their_drop_down() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("the user provides correct details and files to create their Moon.")
    public void the_user_provides_correct_details_and_files_to_create_their_moon() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("the correct file type if they want to add a picture to their discovered Moon.")
    public void the_correct_file_type_if_they_want_to_add_a_picture_to_their_discovered_moon() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("the user clicks on the Submit Moon button")
    public void the_user_clicks_on_the_submit_moon_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    // Sad path for planets
    @When("the user provides invalid details for their planet name {string}")
    public void the_user_provides_invalid_details_for_their_planet_name(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("the user provides invalid file type for their planet image {string}")
    public void the_user_provides_invalid_file_type_for_their_planet_image(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("should get an Alert message {string}")
    public void should_get_an_alert_message(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("should remain on an unchanged home page.")
    public void should_remain_on_an_unchanged_home_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    // Sad path for moons
    @When("the user provides invalid details for their moon name {string}")
    public void the_user_provides_invalid_details_for_their_moon_name(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("the user provides invalid details for the planetID {string}")
    public void the_user_provides_invalid_details_for_the_planet_id(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("the user provides invalid file type for their moon image {string}")
    public void the_user_provides_invalid_file_type_for_their_moon_image(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("they should remain on an unchanged home page.")
    public void they_should_remain_on_an_unchanged_home_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
