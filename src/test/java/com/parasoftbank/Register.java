package com.parasoftbank;

import Base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Register extends CommonAPI {

    @Test
    public void test20(){
        click("//*[@id='loginPanel']");
        System.out.println("Click on Register Success.");

    }

    public void test21(){

        type("customer.firstName", "KingQueen");
        System.out.println("Customer First Name entered.");

        type("customer.lastName", "Albert");
        System.out.println("Customer Last Name entered.");

        type("customer.address.street", "79-18 st.");
        System.out.println("Customer address street entered.");

        type("customer.address.city", "Elmhurst");
        System.out.println("Customer city entered.");

        type("customer.address.state", "New York");
        System.out.println("Customer State entered.");

        type("customer.address.zipCode", "11373");
        System.out.println("Customer zipCode entered.");

        type("customer.phoneNumber", "91-911-09111");
        System.out.println("Customer phone no. entered.");

        type("customer.ssn", "000-00-0000");
        System.out.println("Customer SSN entered.");

        type("customer.username", "JohnSmith2025");
        System.out.println("Customer created new username.");

        type("customer.password", "smith2025@");
        System.out.println("Customer entered password.");

        type("repeatedPassword", "smith2025@");
        System.out.println("Customer confirmed password.");

        click("//*[@id='customerForm']");
        System.out.println("Register success.");


    }
}
