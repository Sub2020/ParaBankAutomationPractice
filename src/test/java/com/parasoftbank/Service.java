package com.parasoftbank;

import Base.CommonAPI;
import org.testng.annotations.Test;

public class Service extends CommonAPI {
    @Test
    public void ClickOnService(){
        click("//*[@id='headerPanel']");
        System.out.println("Click on Service success.");
    }
}
