package com.ultimateqa.courses.testsuite;
import com.ultimateqa.courses.pages.HomePage;
import com.ultimateqa.courses.pages.SignInPage;
import com.ultimateqa.courses.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    HomePage homePg = new HomePage();
    SignInPage signInPg = new SignInPage();

    @Test
    public void userShouldNavigateToLoginPageSuccessfully(){
        homePg.clickOnSignInLink();
        String actualMessage = signInPg.getWelcomeBackText();
        Assert.assertEquals(actualMessage,"Welcome Back!", "Signing in unsuccessful");
    }

    @Test
    public void verifyTheErrorMessage(){
        homePg.clickOnSignInLink();
        signInPg.enterEmailField("Asdfg33@gmail.com");
        signInPg.enterPasswordField("SuperSecretPassword!");
        signInPg.clickOnSignInButton();
        String actualMessage = signInPg.getErrorMessageText();
        Assert.assertEquals(actualMessage,"Invalid email or password.", "Signing in unsuccessful");
    }
}
