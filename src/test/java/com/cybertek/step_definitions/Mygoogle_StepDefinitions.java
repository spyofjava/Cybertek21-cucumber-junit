package com.cybertek.step_definitions;

import com.cybertek.pages.GoogleSearchPage;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class Mygoogle_StepDefinitions {

    GoogleSearchPage googleSearchPage = new GoogleSearchPage();

    @Given("User is on google home page")
    public void user_is_on_google_home_page() {

        String url = ConfigurationReader.getProperty("google");
        Driver.getDriver().get(url);
    }


    @When("User user types {string} in the google search box")
    public void user_user_types_in_the_google_search_box(String string) {

       googleSearchPage.searchBar.sendKeys(string+ Keys.ENTER);

    }


    @Then("User sees {string} in google title")
    public void user_sees_in_google_title(String string) {

        String actual =Driver.getDriver().getTitle();
        String expected = string+" - Google Search";

        Assert.assertTrue(actual.equals(expected));

    }
}
