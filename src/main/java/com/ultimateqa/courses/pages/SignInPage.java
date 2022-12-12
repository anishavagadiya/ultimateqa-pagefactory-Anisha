package com.ultimateqa.courses.pages;

import com.ultimateqa.courses.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class SignInPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Welcome Back!')]")
    WebElement welcomeText;
    @CacheLookup
    @FindBy(id = "user[email]")
    WebElement emailField;
    @CacheLookup
    @FindBy(name = "user[password]")
    WebElement passwordField;
    @CacheLookup
    @FindBy(xpath = "//body[1]/main[1]/div[1]/div[1]/article[1]/form[1]/div[5]/button[1]")
    WebElement signInButton;
    @CacheLookup
    @FindBy(css = ".form-error__list-item")
    WebElement getErrorMessage;


    public void enterEmailAddress(String email) {
        Reporter.log("Enter email " + email + " to email field " + emailField.toString());
        sendTextToElement(emailField, email);
    }

    public void enterPassword(String password) {
        Reporter.log("Enter password " + password + " to password field " + passwordField.toString());
        sendTextToElement(passwordField, password);
    }

    public void clickOnSignInButton() {
        Reporter.log("user click on sign in button");
        clickOnElement(signInButton);
    }

    public String getWelcomeMessage() {
        Reporter.log("Welcome Message displayed");
        return getTextFromElement(welcomeText);
    }

    public String getErrorMessage() {
        Reporter.log("Error Message Displayed");
        return getTextFromElement(getErrorMessage);
    }


}
