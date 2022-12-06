package com.herokuapp.testsuite;

import com.herokuapp.pages.LoginPage;
import com.herokuapp.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {

    LoginPage loginPage = new LoginPage();

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        loginPage.enterUserName("tomsmith");
        loginPage.enterPassword("SuperSecretPassword");
        loginPage.clickOnLoginButton();
    }
    @Test
    public void verifyTheUsernameErrorMessage(){
        loginPage.enterUserName("");
        loginPage.enterPassword("SuperSecretPassword");
        loginPage.clickOnLoginButton();
        String expectedErrorMessage = " Your username is invalid!";
       // Assert.assertEquals(loginPage.getErrorMessage(),expectedErrorMessage," Your username is invalid!");
    }
    @Test
    public void verifyThePasswordErrorMessage(){
        loginPage.enterUserName("tomsmith");
        loginPage.enterPassword("");
        loginPage.clickOnLoginButton();
        String expectedErrorMessage = " Your password is invalid!";
    }
}
