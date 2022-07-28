package com.parasoftbank;

import Base.CommonAPI;
import org.testng.annotations.Test;
import pages.LogInPage;

public class requestLoan extends CommonAPI {

    @Test
    public void ClickRequestLoanForm(){

        LogInPage logInPage = new LogInPage(driver);

        logInPage.EnterUserName("BabuNepali");
        logInPage.EnterPassword("subrat123");
        logInPage.ClickLoginButton();
        logInPage.ClickUpdateContactSuccess();
        logInPage.TypeLoanAmountSuccess("100000000");
        logInPage.TypeDownPaymentLoan("500000");
        logInPage.TypeLoanAccountNo("13344");
        logInPage.LoanButtonClick();
    }
}
