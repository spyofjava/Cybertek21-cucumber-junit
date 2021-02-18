package com.cybertek.pages;

import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SmartBearLoginPage {


    public SmartBearLoginPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "ctl00_MainContent_username")
    public WebElement inputUsername ;

    @FindBy(id = "ctl00_MainContent_password")
    public WebElement inputPassWord;

    @FindBy(id = "ctl00_MainContent_login_button")
    public WebElement loginButton;

    public void loginToSmartBear(){
        inputUsername.sendKeys("Tester");
        inputPassWord.sendKeys("test");
        loginButton.click();
    }

    public void loginToSmartBear(String username, String password){
        inputUsername.sendKeys(username);
        inputPassWord.sendKeys(password);
        loginButton.click();
    }

    public void loginToSmartBear_Config(){

        inputUsername.sendKeys(ConfigurationReader.getProperty("sbUsername"));
        inputPassWord.sendKeys(ConfigurationReader.getProperty("sbPassword"));
        loginButton.click();

    }


}
