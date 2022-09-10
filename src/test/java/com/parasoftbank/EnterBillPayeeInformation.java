package com.parasoftbank;

import Base.CommonAPI;
import org.testng.annotations.Test;
import pages.LogInPage;

public class EnterBillPayeeInformation extends CommonAPI {

    @Test
    public void ClickBillPayeeInformation(){
        LogInPage logInPage = new LogInPage(driver);

        logInPage.EnterUserName("BabuNepali");
        logInPage.EnterPassword("subrat123");
        logInPage.ClickLoginButton();

        logInPage.ClickOnBillPay();


        logInPage.EnterPayeeName1("James Bond");
        //type("payee.name", "James Bond");
        //System.out.println("Payee Name entered.");

        logInPage.EnterPayeeAddSt("7918 Ave. St.");
        //type("payee.address.street", "7918 Ave. St.");
        //System.out.println("Payee address entered.");

        logInPage.EnterPayeeAddressCity("Elmhurst.");
        //type("payee.address.city", "Elmhurst");
        //System.out.println("Payee city entered.");


        logInPage.EnterPayeeAddressState("New-York");
        //type("payee.address.state", "New York");
        //System.out.println("Payee State entered.");

        logInPage.EnterpayeeAddressZipCode("11373");
        //type("payee.address.zipCode", "11373");
        //System.out.println("Payee ZipCode entered.");

        logInPage.EnterPayeePhone("191-911-0910");
        //type("payee.phoneNumber", "191-911-0910");
        //System.out.println("Payee phone no. entered.");

        logInPage.EnterVerifyAcc("1221233201");
        //type("payee.accountNumber", "1221233201");
        //System.out.println("Payee account no. entered.");

        logInPage.EnterAmount("10000");
        //type("amount", "10000");
        //System.out.println("Payee entered amount.");

        logInPage.EnterAccId("19116");
        //type("fromAccountId", "19116");
        //System.out.println("Payee entered account no..");

        logInPage.ClickService();
        //click("//*[@id='rightPanel']");
        //System.out.println("Click on send payment success.");


    }
}
