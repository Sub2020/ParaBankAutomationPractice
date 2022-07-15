package com.parasoftbank;

import Base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class home extends CommonAPI {

    @Test
    public void test16(){
        WebElement homeclick = driver.findElement(By.xpath("//*[@id=\"headerPanel\"]/ul[2]/li[1]/a"));
        homeclick.click();
        System.out.println("clicked on Home button success.");
    }
}
