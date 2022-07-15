package com.parasoftbank;

import Base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FindTransactions extends CommonAPI {

    @Test
    public void test14(){
        type("username", "BabuNepali");
        System.out.println("Username entered");

        type("password", "subrat123");
        System.out.println("password entered");

        WebElement clickLogIn = driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input"));
        clickLogIn.click();
        System.out.println("Login Success!!");

        WebElement ClickTransactions = driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[5]/a"));
        ClickTransactions.click();
        System.out.println("Click on Find Transactions success.");

    }

}
