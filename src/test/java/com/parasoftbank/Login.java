package com.parasoftbank;

import Base.CommonAPI;
import org.testng.annotations.Test;

public class Login extends CommonAPI {
    @Test
    public void test3(){
        type("username","BabuNepali" );
        System.out.println("Username entered ");

        type("password", "subrat123");
        System.out.println("password entered ");

        click("//*[@id='loginPanel']");
        System.out.println("Click on login Button Success");
    }
}
