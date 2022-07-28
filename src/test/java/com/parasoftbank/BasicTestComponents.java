package com.parasoftbank;

import Base.CommonAPI;
import org.testng.annotations.Test;
import pages.LogInPage;

;


public class BasicTestComponents extends CommonAPI {


    @Test
    public void UserNamePasswordFieldDispalyed() {
        LogInPage logInPage = new LogInPage(driver);

        //boolean nameFieldDisplayed = isPresent("username");
//        System.out.printf("Check if UserName field is displayed: %s%n"+ logInPage.checkUserNameFieldPresence());
//        assertTrue(logInPage.checkUserNameFieldPresence());

        //boolean passwordFieldIsDisplayed = isPresent("password");
//        System.out.println("Check if password field is displayed: " + logInPage.checkPasswordFieldPresence());
//        assertTrue(logInPage.checkPasswordFieldPresence());

        //boolean loginPanellIsDisplayed = isPresent("loginPanel");
//        System.out.println("Check if Login Button field is displayed: " + logInPage.checkLoginButtonFieldPresence());
//        Assert.assertTrue(logInPage.checkLoginButtonFieldPresence());
    }
}






