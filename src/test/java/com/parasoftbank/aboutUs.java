package com.parasoftbank;

import Base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class aboutUs extends CommonAPI {

    @Test
    public void test6(){
        click("//*[@id='headerPanel']");
        System.out.println("Click on About us success.");
    }
}