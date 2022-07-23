package com.parasoftbank;

import Base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

;


public class BasicTestComponents extends CommonAPI {


    @Test
    public void UserNamePasswordFieldDispalyed() {

        boolean nameFieldDisplayed = isPresent("username");
        System.out.printf("Check if UserName field is displayed: %s%n", nameFieldDisplayed);
        assertTrue(nameFieldDisplayed);

        boolean passwordFieldIsDisplayed = isPresent("password");
        System.out.println("Check if password field is displayed: " + passwordFieldIsDisplayed);
        assertTrue(passwordFieldIsDisplayed);

        boolean loginPanellIsDisplayed = isPresent("loginPanel");
        System.out.println("Check if Login Button field is displayed: " + loginPanellIsDisplayed);
        Assert.assertTrue(loginPanellIsDisplayed);
    }
}






