package com.parasoftbank;

import Base.CommonAPI;
import org.testng.annotations.Test;

public class product extends CommonAPI {

    @Test
    public void ClickProduct(){
        click("//*[@id='headerPanel']");
        System.out.println("Click on Product success.");
        driver.navigate().back();
    }
}
