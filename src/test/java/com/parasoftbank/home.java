package com.parasoftbank;

import Base.CommonAPI;
import org.testng.annotations.Test;
import pages.LogInPage;

public class home extends CommonAPI {

    @Test
    public void ClickHomeBtn(){
        LogInPage logInPage = new LogInPage(driver);
        logInPage.ClickHomeButton();
    }
}
