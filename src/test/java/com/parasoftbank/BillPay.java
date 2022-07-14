package com.parasoftbank;

import Base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BillPay extends CommonAPI {

    @Test
    public void test7() {
        type("username","BabuNepal");
        System.out.println("Username entered");

        type("password", "subrat123");
        System.out.println("password entered");

        WebElement clickLogIn = driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input"));
        clickLogIn.click();
        System.out.println("Login Success!!");

        WebElement clickBillPay = driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[4]/a"));
        clickBillPay.click();
        System.out.println("Click on Bill Pay success!!");
    }
}
