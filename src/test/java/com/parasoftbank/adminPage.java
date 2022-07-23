package com.parasoftbank;

import Base.CommonAPI;
import org.testng.annotations.Test;

public class adminPage extends CommonAPI {

    @Test
    public void ClickOnAdmiLink(){
        click(("//*[@id='headerPanel']/ul[1]/li[6]/a"));
        System.out.println("Click on AdminPage success.");
    }
}
