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

        click("//*[@id='loginPanel']");
        System.out.println("Login Success!!");

        click("//*[@id='leftPanel']");
        System.out.println("Click on Find Transactions success.");

    }

}
