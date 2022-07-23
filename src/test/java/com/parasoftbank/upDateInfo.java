package com.parasoftbank;

import Base.CommonAPI;
import org.testng.annotations.Test;

public class upDateInfo extends CommonAPI {

    @Test
    public void ClickOnUpDateInfo(){
        type("username", "BabuNepali");
        System.out.println("Username entered");

        type("password", "subrat123");
        System.out.println("password entered");

        click("//*[@id=\"loginPanel\"]/form/div[3]/input");
        System.out.println("Login Success!!");

        click("//*[@id=\"leftPanel\"]/ul/li[6]/a");
        System.out.println("Click on Update Contact Info success.");

        type("customer.firstName", "James007");
        System.out.println("Customer entered first name.");

        type("customer.lastName", "Bond");
        System.out.println("Customer entered last name.");

        type("customer.address.street", "7918 woodside");
        System.out.println("Customer entered street address.");

        type("customer.address.city", "Elmhurst");
        System.out.println("Customer entered  city.");

        type("customer.address.state", "New York");
        System.out.println("Customer entered State.");

        type("customer.address.zipCode", "11373");
        System.out.println("Customer entered zipCode.");

        type("customer.phoneNumber", "911-123-4567");
        System.out.println("Customer entered phone #.");


        click("//*[@id='rightPanel']");
        System.out.println("Click on update success.");
    }
}
