package com.ultimateqa.courses.pages;

import com.ultimateqa.courses.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    By signInLink = By.linkText("Sign In");

    public void clickOnSignInLink(){
        clickOnElement(signInLink);
    }
}
