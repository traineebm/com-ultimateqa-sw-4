package com.ultimateqa.courses.pages;

import com.ultimateqa.courses.utility.Utility;
import org.openqa.selenium.By;

public class SignInPage extends Utility {

    By emailField = By.id("user[email]");
    By passwordField = By.id("user[password]");
    By signInLink = By.linkText("Sign In");
    By welcomeBackText = By.xpath("//h1[contains(text(),'Welcome Back!')]");
    By errorMessageText = By.xpath("//li[contains(text(),'Invalid email or password.')]");
    By signInButton = By.cssSelector("input[value='Sign in']");

    public void enterEmailField(String email) {
        sendTextToElement(emailField, email);
    }

    public void enterPasswordField(String password) {
        sendTextToElement(passwordField, password);
    }

    public void clickOnSignInLink() {
        clickOnElement(signInLink);
    }

    public String getWelcomeBackText() {
        return getTextFromElement(welcomeBackText);
    }

    public String getErrorMessageText() {
        return getTextFromElement(errorMessageText);
    }

    public void clickOnSignInButton() {
        clickOnElement(signInButton);
    }
}

