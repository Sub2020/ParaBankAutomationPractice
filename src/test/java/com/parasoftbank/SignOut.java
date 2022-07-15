package com.parasoftbank;

import Base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SignOut extends CommonAPI {

    @Test
    public void test19(){
        type("username", "BabuNepali");
        System.out.println("Username entered");

        type("password", "subrat123");
        System.out.println("password entered");

        WebElement clickLogIn = driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input"));

        clickLogIn.click();
        System.out.println("Login Success!!");

        WebElement SignOutButton = driver.findElement(By.linkText("Log Out"));
        SignOutButton.click();

        System.out.println("Sign Out success");

    }
}
