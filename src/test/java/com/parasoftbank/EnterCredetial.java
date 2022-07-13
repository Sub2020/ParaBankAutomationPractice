package com.parasoftbank;

import Base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class EnterCredetial extends CommonAPI {
    @Test
    public void test(){
        type("username","BabuNepali" );
        System.out.println("Username entered ");

        type("password", "subrat123");
        System.out.println("password entered ");

        WebElement loginBtnField = driver.findElement(By.xpath("//*[@id='loginPanel']/form/div[3]/input"));
        loginBtnField.click();
        System.out.println("Click on login Button Success");
    }
}
