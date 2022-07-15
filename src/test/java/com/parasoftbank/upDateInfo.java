package com.parasoftbank;

import Base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class upDateInfo extends CommonAPI {

    @Test
    public void test18(){
        type("username", "BabuNepali");
        System.out.println("Username entered");

        type("password", "subrat123");
        System.out.println("password entered");

        WebElement clickLogIn = driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input"));
        clickLogIn.click();
        System.out.println("Login Success!!");

        WebElement ClickUpdateInfo = driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[6]/a"));
        ClickUpdateInfo.click();
        System.out.println("Click on Update Contact Info success.");

        type("customer.firstName", "James");
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

        WebElement ClickOnUpdate = driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/div/div/form/table/tbody/tr[8]/td[2]/input"));
        ClickOnUpdate.click();


    }
}
