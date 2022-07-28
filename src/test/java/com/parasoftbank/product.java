package com.parasoftbank;

import Base.CommonAPI;
import org.testng.annotations.Test;
import pages.LogInPage;

public class product extends CommonAPI {

    @Test
    public void ClickProduct(){
        LogInPage logInPage = new LogInPage(driver);
        logInPage.ClickProduct();
        driver.navigate().back();
    }
}
