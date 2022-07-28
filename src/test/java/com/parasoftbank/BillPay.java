package com.parasoftbank;

import Base.CommonAPI;
import org.testng.annotations.Test;
import pages.LogInPage;

public class BillPay extends CommonAPI {

    @Test
    public void ClickOnBillPay() {
        LogInPage logInPage = new LogInPage(driver);

        logInPage.EnterUserName("BabuNepali");
        logInPage.EnterPassword("subrat123");
        logInPage.ClickLoginButton();
        logInPage.ClickOnBillPay();
    }
}
