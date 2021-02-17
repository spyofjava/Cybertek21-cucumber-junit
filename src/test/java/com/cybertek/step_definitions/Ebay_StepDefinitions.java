package com.cybertek.step_definitions;

import com.cybertek.pages.EbaySearchPage;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class Ebay_StepDefinitions {

    EbaySearchPage ebaySearchPage =new EbaySearchPage();

    @Given("user is on the Ebay home page")
    public void user_is_on_the_ebay_home_page() {

        String url = ConfigurationReader.getProperty("ebayUrl");
        Driver.getDriver().get(url);

    }


    @Then("user should see Ebay title as expected")
    public void user_should_see_ebay_title_as_expected() {

        String expected ="Electronics, Cars, Fashion, Collectibles & More | eBay";
        String actual = Driver.getDriver().getTitle();

        Assert.assertTrue(actual.equals(expected));

    }

    @When("user search for {string}")
    public void userSearchFor(String arg0) {

        ebaySearchPage.searchBox.sendKeys(arg0+ Keys.ENTER);

    }

    @Then("user should see {string} title as expected")
    public void userShouldSeeTitleAsExpected(String arg0) {

    String expected = arg0;
    String actual = Driver.getDriver().getTitle();
    Assert.assertTrue(actual.contains(expected));


    }
}
