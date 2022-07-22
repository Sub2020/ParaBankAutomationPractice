package com.parasoftbank;

import Base.CommonAPI;
import org.testng.annotations.Test;

public class TransferFund extends CommonAPI {

    @Test
    public void test12(){

        type("username", "BabuNepali");
        System.out.println("Username entered");

        type("password", "subrat123");
        System.out.println("password entered");

        click("//*[@id='loginPanel']");
        System.out.println("Login Success!!");

        click("//*[@id='leftPanel']");
        System.out.println("Click on transfer founds success!!");

    }
}
