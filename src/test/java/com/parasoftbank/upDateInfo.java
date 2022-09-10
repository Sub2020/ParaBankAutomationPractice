package com.parasoftbank;

import Base.CommonAPI;
import org.testng.annotations.Test;
import pages.LogInPage;

public class upDateInfo extends CommonAPI {

    @Test
    public void ClickOnUpDateInfo(){
        LogInPage logInPage = new LogInPage(driver);
        logInPage.EnterUserName("BabuNepali");
        //type("username", "BabuNepali");
        //System.out.println("Username entered");

        logInPage.EnterPassword("subrat123");
        //type("password", "subrat123");
       //System.out.println("password entered");

        logInPage.ClickLoginButton();
        //click("//*[@id=\"loginPanel\"]/form/div[3]/input");
        //System.out.println("Login Success!!");

        logInPage.ClickUpdateContactInfo();
        //click("//*[@id=\"leftPanel\"]/ul/li[6]/a");
        //System.out.println("Click on Update Contact Info success.");

        logInPage.TypeCustomerFirstName("James007");
        //type("customer.firstName", "James007");
        //System.out.println("Customer entered first name.");

        logInPage.TypeCustomerLastName("Bond");
        //type("customer.lastName", "Bond");
        //System.out.println("Customer entered last name.");

        logInPage.TypeCustomerAddressStreet("79-18 st. woodside");
        //type("customer.address.street", "7918 woodside");
        //System.out.println("Customer entered street address.");

        logInPage.TypeCustomerAddressCity("Elmhurst");
        //type("customer.address.city", "Elmhurst");
        //System.out.println("Customer entered  city.");

        logInPage.TypeCustomerAddressState("New York");
        //type("customer.address.state", "New York");
        //System.out.println("Customer entered State.");

        logInPage.TypeCustomerAddressZipCode("11373");
        //type("customer.address.zipCode", "11373");
        //System.out.println("Customer entered zipCode.");

        logInPage.TypeCustomerPhoneNumber("91-911-09111");
        //type("customer.phoneNumber", "911-123-4567");
        //System.out.println("Customer entered phone #.");


        //logInPage.TypeClickRegister();
        logInPage.ClickUpdateContactSuccess();
        //click("//*[@id='rightPanel']");
        //System.out.println("Click on update success.");
    }
}
