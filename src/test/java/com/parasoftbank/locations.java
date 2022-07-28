package com.parasoftbank;

import Base.CommonAPI;
import org.testng.annotations.Test;
import pages.LogInPage;

public class locations extends CommonAPI {

    @Test
    public void ClickOnlocations(){
        LogInPage logInPage = new LogInPage(driver);
        logInPage.ClickOnlocations();
        //click("//*[@id='headerPanel']");
        System.out.println("Click on locations success.");
        driver.navigate().back();
    }
}
