package com.parasoftbank;

import Base.CommonAPI;
import org.testng.annotations.Test;

public class contact extends CommonAPI {

    @Test
    public void ClickOnContact(){
        click("//*[@id='headerPanel']");
        System.out.println("click on contact success");

    }
}
