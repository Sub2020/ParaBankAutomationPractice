package com.parasoftbank;

import Base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class locations extends CommonAPI {

    @Test
    public void test8(){
        click("//*[@id='headerPanel']");
        System.out.println("Click on locations success.");
        driver.navigate().back();
    }
}
