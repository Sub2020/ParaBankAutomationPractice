package com.parasoftbank;

import Base.CommonAPI;
import org.testng.annotations.Test;
import pages.LogInPage;

public class SignOut extends CommonAPI {

    @Test
    public void ClickOnSignOut(){
        LogInPage logInPage = new LogInPage(driver);

        logInPage.EnterUserName("BabuNepali");
        logInPage.EnterPassword("subrat123");
        logInPage.ClickLoginButton();
        logInPage.ClickOnSignOut();


    }
}
