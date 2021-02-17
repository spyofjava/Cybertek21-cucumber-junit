package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyGoogleSearchPage {

    public MyGoogleSearchPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(name = "q")
    public WebElement searchBox;
}
