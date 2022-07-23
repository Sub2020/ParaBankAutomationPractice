package com.parasoftbank;

import Base.CommonAPI;
import org.testng.annotations.Test;

public class locations extends CommonAPI {

    @Test
    public void ClickOnlocations(){
        click("//*[@id='headerPanel']");
        System.out.println("Click on locations success.");
        driver.navigate().back();
    }
}
