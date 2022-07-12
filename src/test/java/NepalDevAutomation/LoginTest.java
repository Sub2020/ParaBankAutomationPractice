package NepalDevAutomation;

import NepalDevAutomation.base.CommonAPI;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static org.junit.Assert.assertTrue;

public class LoginTest extends CommonAPI {


    @Test
    public void login() {
        WebElement nameField = driver.findElement(By.name("username"));
        boolean nameFieldDisplayed = nameField.isDisplayed();
        System.out.printf("Check if UserName field is displayed: %s%n", nameFieldDisplayed);
        assertTrue(nameFieldDisplayed);

        WebElement passwordField = driver.findElement(By.name("password"));
        boolean passwordFieldIsDisplayed = passwordField.isDisplayed();
        System.out.println("Check if password field is displayed: " + passwordFieldIsDisplayed);
        assertTrue(passwordFieldIsDisplayed);

        WebElement loginPanell = driver.findElement(By.id("loginPanel"));
        boolean loginPanellIsDisplayed = loginPanell.isDisplayed();
        System.out.println("Check if Login Button field is displayed: " + loginPanellIsDisplayed);
        Assert.assertTrue(loginPanellIsDisplayed);
    }
}
