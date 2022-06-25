package com.cydeo.step_definitions;

import com.cydeo.pages.CloudTablePage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CloudTables {

    CloudTablePage cloudTablePage = new CloudTablePage();
    @Given("User is on cloudTables homepage")
    public void user_is_on_cloud_tables_homepage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("cloudtables.url"));
    }
    @When("User clicks on New button")
    public void user_clicks_on_new_button() {
        cloudTablePage.newPerson.click();
    }
    @When("User enters {string} to firstname field")
    public void user_enters_to_firstname_field(String string) {

    }
    @When("User enters {string} to lastname field")
    public void user_enters_to_lastname_field(String string) {

    }
    @When("User enters {string} to position field")
    public void user_enters_to_position_field(String string) {

    }
    @When("User enters {string} to salary field")
    public void user_enters_to_salary_field(String string) {

    }
    @When("User clicks on create button")
    public void user_clicks_on_create_button() {

    }
    @Then("User should be able to find person at the search box")
    public void user_should_be_able_to_find_person_at_the_search_box() {

    }
}
