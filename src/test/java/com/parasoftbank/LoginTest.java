package com.parasoftbank;

import Base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class LoginTest extends CommonAPI {


    @Test
    public void loginTest2() {
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
