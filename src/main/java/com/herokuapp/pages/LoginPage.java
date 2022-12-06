package com.herokuapp.pages;

import com.herokuapp.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By loginpage = By.xpath("//h2[@xpath='1']");
    By userName = By.name("username");
    By password = By.name("password");
    By loginButton = By.xpath("//button[@class = 'radius']");
    By errorMessage=By.xpath("//div[@class = 'flash error']");

    public void enterUserName(String userNameText){
        sendTextToElement(userName,userNameText);
    }
    public void enterPassword(String passwordText){
        sendTextToElement(password,passwordText);
    }
    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }
    public String getErrorMessage(){
        return getTextFromElement(errorMessage);
    }
}
