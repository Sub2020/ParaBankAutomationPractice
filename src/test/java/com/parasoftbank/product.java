package com.parasoftbank;

import Base.CommonAPI;
import org.testng.annotations.Test;

public class product extends CommonAPI {

    @Test
    public void test7(){
        click("//*[@id='headerPanel']");
        System.out.println("Click on Product success.");
        driver.navigate().back();
    }
}
