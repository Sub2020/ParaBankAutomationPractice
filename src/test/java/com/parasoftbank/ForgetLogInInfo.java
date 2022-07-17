package com.parasoftbank;

import Base.CommonAPI;
import org.testng.annotations.Test;

public class ForgetLogInInfo extends CommonAPI {

    @Test
    public void Test20(){
        click("//*[@id='loginPanel']");
        System.out.println("Click on Forget Login Info Success.");
    }
}
