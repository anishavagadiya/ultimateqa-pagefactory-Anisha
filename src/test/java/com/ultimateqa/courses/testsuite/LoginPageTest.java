package com.ultimateqa.courses.testsuite;

import com.ultimateqa.courses.customlisteners.CustomListeners;
import com.ultimateqa.courses.pages.HomePage;
import com.ultimateqa.courses.pages.SignInPage;
import com.ultimateqa.courses.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {
    HomePage homepage;
    SignInPage loginPage;

    @BeforeMethod
    public void inIt(){
        homepage = new HomePage();
        loginPage = new SignInPage();
    }


    @Test
    public void userShouldNavigateToLoginPageSuccessfully(){
        homepage.clickOnSignInButton();
        String expectedSignInText = "Welcome Back!";
        Assert.assertEquals(loginPage.getWelcomeMessage(),expectedSignInText,"Welcome Back! is not displayed");
    }
    @Test
    public void verifyTheErrorMessage() throws InterruptedException {
        homepage.clickOnSignInButton();
        loginPage.enterEmailAddress("test11@yahoo.com");
        loginPage.enterPassword("test123");
        Thread.sleep(5000);
        loginPage.clickOnSignInButton();
        String expectedErrormessage = "Invalid email or password.";
        Assert.assertEquals(loginPage.getErrorMessage(),expectedErrormessage,"Invalid email or password message not displayed ");

    }

}
