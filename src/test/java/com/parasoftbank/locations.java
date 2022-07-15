package com.parasoftbank;

import Base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class locations extends CommonAPI {

    @Test
    public void test8(){
        WebElement ClickOnlocations = driver.findElement(By.xpath("//*[@id=\"headerPanel\"]/ul[1]/li[5]/a"));
        ClickOnlocations.click();
        System.out.println("Click on locations success.");
        driver.navigate().back();
    }
}
