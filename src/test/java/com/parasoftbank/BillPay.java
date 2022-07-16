package com.parasoftbank;

import Base.CommonAPI;
import org.testng.annotations.Test;

public class BillPay extends CommonAPI {

    @Test
    public void test4() {
        type("username","BabuNepali");
        System.out.println("Username entered");

        type("password", "subrat123");
        System.out.println("password entered");


        click("//*[@id=\"loginPanel\"]/form/div[3]/input");
        System.out.println("Login Success!!");


        click("//*[@id=\"leftPanel\"]/ul/li[4]/a");
        System.out.println("Click on Bill Pay success!!");
    }
}
