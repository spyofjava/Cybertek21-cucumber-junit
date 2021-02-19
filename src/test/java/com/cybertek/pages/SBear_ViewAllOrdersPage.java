package com.cybertek.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SBear_ViewAllOrdersPage extends SBear_BasePage{

    // this is child of SBear_Base that's why it does not necessary to add PageFactory, child is already taken from the family class


    @FindBy(xpath = "//tr[2]/td[2]")
    public WebElement newCustomerCell; //it will show us the costumer that we add current one


}