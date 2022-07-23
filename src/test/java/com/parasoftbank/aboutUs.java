package com.parasoftbank;

import Base.CommonAPI;
import org.testng.annotations.Test;

public class aboutUs extends CommonAPI {

    @Test
    public void ClickOnAboutUs(){
        click("//*[@id='headerPanel']");
        System.out.println("Click on About us success.");

    }
}
