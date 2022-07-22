package com.parasoftbank;

import Base.CommonAPI;
import org.testng.annotations.Test;

public class siteMap extends CommonAPI {

    @Test
    public void test9(){
        click("//*[@id='footerPanel']");
        System.out.println("clicked on Site Map button success");
    }
}
