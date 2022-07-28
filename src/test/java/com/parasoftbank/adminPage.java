package com.parasoftbank;

import Base.CommonAPI;
import org.testng.annotations.Test;
import pages.LogInPage;

public class adminPage extends CommonAPI {

    @Test
    public void ClickOnAdmiLink(){
        LogInPage logInPage = new LogInPage(driver);
        logInPage.ClickAdminPage();
    }
}
