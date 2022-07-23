package com.parasoftbank;

import Base.CommonAPI;
import org.testng.annotations.Test;

public class ForgetLogInInfo extends CommonAPI {

    @Test
    public void ClickForgetLogInInfo(){
        click("//*[@id='loginPanel']");
        System.out.println("Click on Forget Login Info Success.");
    }
}
