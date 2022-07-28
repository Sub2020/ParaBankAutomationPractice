package com.parasoftbank;

import Base.CommonAPI;
import org.testng.annotations.Test;
import pages.LogInPage;

public class BankNews extends CommonAPI {

    @Test
    public void ClickOnBankNews(){
        LogInPage logInPage = new LogInPage(driver);
        logInPage.ClickOnBankNews();
    }
}
