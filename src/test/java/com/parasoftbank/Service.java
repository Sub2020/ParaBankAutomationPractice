package com.parasoftbank;

import Base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Service extends CommonAPI {
    @Test
    public void test6(){
        WebElement ClickOnService = driver.findElement(By.xpath("//*[@id=\"headerPanel\"]/ul[1]/li[3]/a"));
        ClickOnService.click();
        System.out.println("Click on Service success.");
    }
}
