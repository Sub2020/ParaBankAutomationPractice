package com.parasoftbank;

import Base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class adminPage extends CommonAPI {

    @Test
    public void test15(){
        WebElement ClickOnAdminPage = driver.findElement(By.xpath("//*[@id=\"headerPanel\"]/ul[1]/li[6]/a"));
        ClickOnAdminPage.click();
        System.out.println("Click on AdminPage success.");
    }
}
