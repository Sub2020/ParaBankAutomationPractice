package com.parasoftbank;

import Base.CommonAPI;
import org.testng.annotations.Test;
import pages.LogInPage;

public class Register extends CommonAPI {

    @Test
    public void test20(){
        LogInPage logInPage = new LogInPage(driver);
        logInPage.ClickRegister();
        //click("//*[@id='loginPanel']");
        //System.out.println("Click on Register Success.");


        logInPage.TypeCustomerFirstName("Raja");
        //type("customer.firstName", "KingQueen");
        //System.out.println("Customer First Name entered.");

        logInPage.TypeCustomerLastName("Albert");
        //type("customer.lastName", "Albert");
        //System.out.println("Customer Last Name entered.");

        logInPage.TypeCustomerAddressStreet("79-18 st.");
        //type("customer.address.street", "79-18 st.");
        //System.out.println("Customer address street entered.");

        logInPage.TypeCustomerAddressCity("Elmhurst");
        //type("customer.address.city", "Elmhurst");
        //System.out.println("Customer city entered.");

        logInPage.TypeCustomerAddressState("New York");
        //type("customer.address.state", "New York");
        //System.out.println("Customer State entered.");

        logInPage.TypeCustomerAddressZipCode("11373");
        //type("customer.address.zipCode", "11373");
        System.out.println("Customer zipCode entered.");

        logInPage.TypeCustomerPhoneNumber("91-911-09111");
        //type("customer.phoneNumber", "91-911-09111");
        //System.out.println("Customer phone no. entered.");

        logInPage.TypeCustomerSsn("000-00-0000");
        //type("customer.ssn", "000-00-0000");
        //System.out.println("Customer SSN entered.");

        logInPage.TypeCustomerUsername("JohnSmith2025");
        //type("customer.username", "JohnSmith2025");
        //System.out.println("Customer created new username.");

        logInPage.TypeCustomerPassword("smith2025@");
        //type("customer.password", "smith2025@");
        //System.out.println("Customer entered password.");

        logInPage.TypeRepeatedPassword("smith2025@");
        //type("repeatedPassword", "smith2025@");
        //System.out.println("Customer confirmed password.");


        logInPage.TypeClickRegister();
        logInPage.ClickRegisterSuccess();
        //click("//*[@id='customerForm']");
        //System.out.println("Register success.");


    }
}
