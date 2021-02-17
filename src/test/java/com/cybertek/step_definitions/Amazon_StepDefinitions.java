package com.cybertek.step_definitions;

import com.cybertek.pages.AmazonSearchPage;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class Amazon_StepDefinitions {

AmazonSearchPage amazonSearchPage = new AmazonSearchPage();


    @Given("user is on the Amazon landing page")
    public void user_is_on_the_amazon_landing_page() {

        String url = ConfigurationReader.getProperty("amazonUrl");
        Driver.getDriver().get(url);
    }


    @Then("user should see Amazon title as expected")
    public void user_should_see_amazon_title_as_expected() {

        String actual = Driver.getDriver().getTitle();
        String expected = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";

        Assert.assertTrue(actual.equals(expected));
    }


    @When("users search for {string}")
    public void usersSearchFor(String arg0) {

        amazonSearchPage.searchBox.sendKeys(arg0+ Keys.ENTER);
    }

    @Then("user should see {string} in the Amazon title")
    public void userShouldSeeInTheAmazonTitle(String arg0) {

        String actual = Driver.getDriver().getTitle();
        String expected = arg0;
        Assert.assertTrue(actual.contains(expected));
    }
}

