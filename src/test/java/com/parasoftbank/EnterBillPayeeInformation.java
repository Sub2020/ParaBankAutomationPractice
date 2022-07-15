package com.parasoftbank;

import Base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class EnterBillPayeeInformation extends CommonAPI {

    @Test
    public void test10(){
        type("username", "BabuNepal");

        type("password", "subrat123");

        WebElement clickLogIn = driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input"));
        clickLogIn.click();

        WebElement clickBillPay = driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[4]/a"));
        clickBillPay.click();

        type("payee.name", "James Bond");
        System.out.println("Payee Name entered.");

        type("payee.address.street", "7918 Ave. St.");
        System.out.println("Payee address entered.");

        type("payee.address.city", "Elmhurst");
        System.out.println("Payee city entered.");

        type("payee.address.state", "New York");
        System.out.println("Payee State entered.");

        type("payee.address.zipCode", "11373");
        System.out.println("Payee ZipCode entered.");

        type("payee.phoneNumber", "191-911-0910");
        System.out.println("Payee phone no. entered.");

        type("payee.accountNumber", "1221233201");
        System.out.println("Payee account no. entered.");

        type("verifyAccount", "1221233201");
        System.out.println("Payee account verified no. entered.");

        type("amount", "10000");
        System.out.println("Payee entered amount.");

        WebElement AmountAccId = driver.findElement(By.name("fromAccountId"));
        type("fromAccountId", "19116");
        System.out.println("Payee entered account no..");

        WebElement sendPaymentClick = driver.findElement(By.className("button"));
        sendPaymentClick.click();

    }
}
