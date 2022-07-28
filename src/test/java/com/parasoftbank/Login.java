package com.parasoftbank;

import Base.CommonAPI;
import org.testng.annotations.Test;
import pages.LogInPage;

public class Login extends CommonAPI {
    @Test
    public void ClickLogin(){
        LogInPage logInPage = new LogInPage(driver);

        logInPage.EnterUserName("BabuNepali");
        logInPage.passwordField("subrat123");
        logInPage.ClickLoginButton();

    }
}
