package com.parasoftbank;

import Base.CommonAPI;
import org.testng.annotations.Test;
import pages.LogInPage;

public class aboutUs extends CommonAPI {

    @Test
    public void ClickOnAboutUs() {
        LogInPage logInPage = new LogInPage(driver);
        logInPage.ClickAboutUs();
    }
}
