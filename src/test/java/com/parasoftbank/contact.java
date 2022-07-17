package com.parasoftbank;

import Base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class contact extends CommonAPI {

    @Test
    public void test13(){
        click("//*[@id='headerPanel']");
        System.out.println("click on contact success");

    }
}
