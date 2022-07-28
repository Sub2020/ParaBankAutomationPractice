package com.parasoftbank;

import Base.CommonAPI;
import org.testng.annotations.Test;
import pages.LogInPage;

public class ForgetLogInInfo extends CommonAPI {

    @Test
    public void ClickForgetLogInInfo() {
        LogInPage logInPage = new LogInPage(driver);
        logInPage.ClickForgetLogInInfo();
    }
}
