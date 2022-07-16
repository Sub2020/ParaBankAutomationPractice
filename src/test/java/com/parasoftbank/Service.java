package com.parasoftbank;

import Base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Service extends CommonAPI {
    @Test
    public void test6(){
        WebElement ClickOnService = driver.findElement(By.xpath("//*[@id='headerPanel']"));
        ClickOnService.click();
        System.out.println("Click on Service success.");
    }
}
