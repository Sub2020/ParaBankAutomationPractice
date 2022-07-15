package com.parasoftbank;

import Base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class BankNews extends CommonAPI {

    @Test
    public void test5(){
        WebElement latsnewsfield = driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/ul[3]/li[2]/a"));
        latsnewsfield.click();
        System.out.println("news: " +latsnewsfield);
    }
}
