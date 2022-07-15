package com.parasoftbank;

import Base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
;import static org.testng.AssertJUnit.assertTrue;


public class BasicTestComponents extends CommonAPI {


    @Test
    public void firstPageTest1() {

        WebElement nameField = driver.findElement(By.name("username"));
        boolean nameFieldDisplayed = nameField.isDisplayed();
        System.out.printf("Check if UserName field is displayed " +nameFieldDisplayed);
        assert (nameFieldDisplayed);

        WebElement passwordField = driver.findElement(By.name("password"));
        boolean passwordFieldIsDisplayed = passwordField.isDisplayed();

        System.out.println("Check if password field is displayed " +passwordFieldIsDisplayed);
        assertTrue(passwordFieldIsDisplayed);

        WebElement loginPanell = driver.findElement(By.id("loginPanel"));
        boolean loginPanellIsDisplayed = loginPanell.isDisplayed();

        System.out.println("Check if Login Button field is displayed: " + loginPanellIsDisplayed);
        Assert.assertTrue(loginPanellIsDisplayed);
    }
}






