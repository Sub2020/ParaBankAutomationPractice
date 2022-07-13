package com.parasoftbank;

import Base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WelcometoNewpage extends CommonAPI {

    @Test
    public void test(){

//        WebElement accountView = driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/div/div/h1"));
//        System.out.println("Welcome text with given name is displayed");
        //String title = driver.getTitle();
        //Assert.assertEquals("Welcome", title);
        //String Title = driver.getTitle();
        //System.out.println("Login Page tile: " + title);

//        WebElement titleField = driver.findElement(By.xpath("titleFieldDisplayed"));
//        boolean titleField = titleField.isDisplayed();
//        System.out.printf("Check if title field is displayed: %s%n", titleFieldDisplayed);
//        assert (titleFieldDisplayed);




        WebElement homeButton = driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/p/b"));
        homeButton.click();
        System.out.println("You are in Home");

        WebElement SignOutButton = driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[8]/a"));
        SignOutButton.click();
        System.out.println("You are signout!!!");
    }
}
