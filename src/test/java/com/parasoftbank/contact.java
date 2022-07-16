package com.parasoftbank;

import Base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class contact extends CommonAPI {

    @Test
    public void test13(){
        WebElement homeclick = driver.findElement(By.linkText("contact"));
        homeclick.click();
        System.out.println("click on contact success");

    }
}
