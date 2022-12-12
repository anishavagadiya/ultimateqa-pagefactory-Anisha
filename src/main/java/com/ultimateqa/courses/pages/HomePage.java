package com.ultimateqa.courses.pages;

import com.ultimateqa.courses.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class HomePage extends Utility {
    @CacheLookup
    @FindBy(linkText = "Sign In")
    WebElement signInButton;


    public void clickOnSignInButton(){
        Reporter.log("Click on Sign in button");
        clickOnElement(signInButton);
    }
}
