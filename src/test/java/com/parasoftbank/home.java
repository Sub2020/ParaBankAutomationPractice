package com.parasoftbank;

import Base.CommonAPI;
import org.testng.annotations.Test;

public class home extends CommonAPI {

    @Test
    public void ClickOnHome(){
        click("//*[@id='headerPanel']");
        System.out.println("clicked on Home button success.");
    }
}
