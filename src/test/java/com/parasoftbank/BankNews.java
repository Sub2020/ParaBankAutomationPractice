package com.parasoftbank;

import Base.CommonAPI;
import org.testng.annotations.Test;

public class BankNews extends CommonAPI {

    @Test
    public void ClickOnBankNews(){
        click("//*[@id='rightPanel']");
        System.out.println("Click on latest Bank News Success.");
    }
}
