package com.cydeo.step_definitions;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FindTransactionStepDefs {
    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        Driver.getDriver().get("http://zero.webappsecurity.com/login.html");

    }
    @Given("User logins with username {string} and password {string}")
    public void user_logins_with_username_and_password(String username, String password) {
        Driver.getDriver().findElement(By.id("user_login")).sendKeys(username);
        Driver.getDriver().findElement(By.id("user_password")).sendKeys(password+ Keys.ENTER);
        Driver.getDriver().navigate().back();
    }
    @Given("the user navigates to {string} menu")
    public void the_user_navigates_to_menu(String string) {
        Driver.getDriver().findElement(By.id("account_activity_link")).click();
    }
    @Given("the user accesses the Find Transactions tab")
    public void the_user_accesses_the_find_transactions_tab() {
        Driver.getDriver().findElement(By.linkText("Find Transactions")).click();
    }
    @When("the user enters date range from {string} to {string}")
    public void the_user_enters_date_range_from_to(String fromDate, String toDate) {
  //  2012-09-01   : format of the date  yyyy-MM-dd
        Driver.getDriver().findElement(By.id("aa_fromDate")).sendKeys(fromDate);
        Driver.getDriver().findElement(By.id("aa_toDate")).sendKeys(toDate);



    }
    @When("clicks search")
    public void clicks_search() {
        Driver.getDriver().findElement(By.xpath("//button[.='Find']")).click();
    }
    @Then("results table should only show transactions dates between {string} to {string}")
    public void results_table_should_only_show_transactions_dates_between_to(String fromDate, String toDate) {

        List<WebElement> allDates = Driver.getDriver().findElements(By.xpath("//div[@id='filtered_transactions_for_account']//tr//td[1]"));
        List<String> allDatesString = BrowserUtils.getElementsText(allDates);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        List<Date> actualDates = new ArrayList<>();

        //  dd - MM - yyyy   ----------- MM - dd - yyyy
        try {
            Date fromD = dateFormat.parse(fromDate);
            Date toD = dateFormat.parse(toDate);
            for(String eachActualDateString : allDatesString){
                actualDates.add(dateFormat.parse(eachActualDateString));
            }
            for(Date actualDate : actualDates){
                boolean isBetween = (actualDate.after(fromD)||actualDate.equals(fromD)) && (actualDate.before(toD)||actualDate.equals(toD));
              //  Assert.assertTrue("Date is OUT of Range",isBetween);
                System.out.println("isBetween = " + isBetween);
                System.out.println("actualDate = " + actualDate);
            }

        } catch (ParseException e) {
            e.printStackTrace();
        }



    }
    @Then("the results should be sorted by most recent date")
    public void the_results_should_be_sorted_by_most_recent_date() {

    }
    @Then("the results table should only not contain transactions dated {string}")
    public void the_results_table_should_only_not_contain_transactions_dated(String string) {

    }
}
