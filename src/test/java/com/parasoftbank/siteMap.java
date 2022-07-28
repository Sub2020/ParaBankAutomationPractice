package com.parasoftbank;

import Base.CommonAPI;
import org.testng.annotations.Test;
import pages.LogInPage;

public class siteMap extends CommonAPI {

    @Test
    public void ClickOnSiteMap(){
        LogInPage logInPage = new LogInPage(driver);
        logInPage.ClickOnSiteMap();
    }
}
