package com.parasoftbank;

import Base.CommonAPI;
import org.testng.annotations.Test;
import pages.LogInPage;

public class Service extends CommonAPI {
    @Test
    public void ClickOnService(){
        LogInPage logInPage = new LogInPage(driver);
        logInPage.ClickService();
    }
}
