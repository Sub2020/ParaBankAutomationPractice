package com.parasoftbank;

import Base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Title extends CommonAPI {
    @Test
    public void ClickOnTitle(){
        String title = getPageTitle();
        System.out.println(title);
        Assert.assertEquals("ParaBank | Welcome | Online Banking", title);
    }
}
