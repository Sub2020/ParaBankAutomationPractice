package com.parasoftbank;

import Base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class product extends CommonAPI {

    @Test
    public void test7(){
        WebElement ClickOnProduct = driver.findElement(By.xpath("//*[@id=\"headerPanel\"]/ul[1]/li[4]/a"));
        ClickOnProduct.click();
        System.out.println("Click on Product success.");
        driver.navigate().back();
    }
}
