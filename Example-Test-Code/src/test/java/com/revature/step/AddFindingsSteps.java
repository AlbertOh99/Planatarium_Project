package com.revature.step;

import static com.revature.TestRunner.*;

import com.revature.pom.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;

public class AddFindingsSteps {

    // Shared for all
    @Given("the user has selected {string} on their drop down")
    public void the_user_has_selected_planet_on_their_drop_down(String type) {
        homePage.selectType(type);
    }
    @When("the user clicks on the Submit button")
    public void the_user_clicks_on_the_submit_button() {
        homePage.clickSubmitButton();
    }

    @And("the user remains on home page")
    public void the_user_remains_on_home_page(){
        Assert.assertEquals(homePage.getTitle(), driver.getTitle());
    }

    // Shared for Planets
    @When("the user provides details for their planet name {string}")
    public void the_user_provides_valid_details_for_their_planet_name(String name) {
        homePage.enterPlanetName(name);
    }
    @When("the user provides file type for their planet image {string}")
    public void the_correct_file_type_if_they_want_to_add_a_picture_to_their_discovered_planet(String fileLocation) {
        homePage.enterPlanetImage(fileLocation);
    }



    // Happy path for Planets
    // Note - Also shared with moon happy path
    @Then("expected result should be the table refreshes with the correct updated information with celestial name {string}")
    public void expected_result_should_be_the_table_refreshes_with_the_correct_updated_information_with_planet_name(String newName) {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(homePage.getTableSize());
        Assert.assertFalse(homePage.findNewRow(newName).isEmpty());
    }

    // Sad path for planets
    // Note - Also shared with moon sad path
    @And("the user remains on an unchanged home page")
    public void the_user_remain_on_an_unchanged_home_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    // Shared for Moon
    @When("the user provides details for their moon name {string}")
    public void the_user_provides_details_for_their_moon_name(String name) {
        homePage.enterMoonName(name);
    }

    @When("the user provides details for the planetID {int}")
    public void the_user_provides_details_for_the_planet_id(int id) {
        homePage.enterPlanetId(id);
    }

    @When("the user provides file type for their moon image {string}")
    public void the_user_provides_file_type_for_their_moon_image(String fileLocation) {
        homePage.enterMoonImage(fileLocation);
    }



    // Happy path for Moons
    // Note - see happy path for Planet


    // Sad path for moons
    // Note - see sad path for Moon
}
