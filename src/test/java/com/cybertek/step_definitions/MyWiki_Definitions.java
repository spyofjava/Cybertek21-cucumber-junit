package com.cybertek.step_definitions;

import com.cybertek.pages.MyWikiPage;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MyWiki_Definitions {

    MyWikiPage myWikiPage = new MyWikiPage();

    @Given("User is on wikipedia home page")
    public void user_is_on_wikipedia_home_page() {

        String url = ConfigurationReader.getProperty("wikiUrl");
        Driver.getDriver().get(url);
    }


    @When("User user types {string} in the wikipedia search box")
    public void user_user_types_search_vale_in_the_wikipedia_search_box(String string) {

        myWikiPage.searchBox.sendKeys(string);

    }

    @When("User clicks the search button")
    public void user_clicks_the_search_button() {
        myWikiPage.searchButton.click();
    }

    @Then("User sees {string} in main header")
    public void user_sees_expected_main_header_in_main_header() {

        Assert.assertTrue(myWikiPage.mainHeader.isDisplayed());

    }


    @Then("User sees {string} in wiki title")
    public void user_sees_expected_title_in_wiki_title(String arg0) {

        String expectedTitle = arg0 + " - Wikipedia";
        String actualTitle = Driver.getDriver().getTitle();
        System.out.println(actualTitle);

        Assert.assertTrue(actualTitle.equals(expectedTitle));

    }



}