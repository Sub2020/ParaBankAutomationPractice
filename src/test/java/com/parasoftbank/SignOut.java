package com.parasoftbank;

import Base.CommonAPI;
import org.testng.annotations.Test;

public class SignOut extends CommonAPI {

    @Test
    public void ClickOnSignOut(){
        type("username", "BabuNepali");
        System.out.println("Username entered");

        type("password", "subrat123");
        System.out.println("password entered");

        click("//*[@id='loginPanel']");
        System.out.println("Login Success!!");

        click("//*[@id='leftPanel']");
        System.out.println("Sign Out success");

    }
}
