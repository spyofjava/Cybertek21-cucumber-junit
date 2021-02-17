package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EbaySearchPage {
    public EbaySearchPage() {
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(id = "gh-ac")
    public WebElement searchBox;
}
