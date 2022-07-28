package com.parasoftbank;

import Base.CommonAPI;
import org.testng.annotations.Test;
import pages.LogInPage;

public class contact extends CommonAPI {

    @Test
    public void ClickOnContact(){
        LogInPage logInPage = new LogInPage(driver);
        logInPage.ClickContact();
    }
}
