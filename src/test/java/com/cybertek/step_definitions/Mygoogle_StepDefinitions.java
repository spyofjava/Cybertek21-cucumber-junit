package com.cybertek.step_definitions;

import com.cybertek.pages.MyGoogleSearchPage;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class Mygoogle_StepDefinitions {
    MyGoogleSearchPage myGoogleSearchPage = new MyGoogleSearchPage();



    @When("User types {string} in the google search box")
    public void user_types_in_the_google_search_box(String string) {

            myGoogleSearchPage.searchBox.sendKeys(string + Keys.ENTER);

    }


    @Then("User sees {string} is in the google title")
    public void user_sees_is_in_the_google_title(String string) {

        String expectedTitle = string+" - Google Search";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertTrue(actualTitle.equals(expectedTitle));


         }

}
