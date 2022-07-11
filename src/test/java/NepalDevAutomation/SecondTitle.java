package NepalDevAutomation;

import NepalDevAutomation.base.CommonAPI;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SecondTitle extends CommonAPI {

    @Test
    public void test(){
        String title = driver.getTitle();
        Assert.assertEquals("ParaBank | Accounts Overview", title);
        String Title = driver.getTitle();
        System.out.println("Login Page tile: " + title);

        WebElement homeButton = driver.findElement(By.xpath("//*[@id=\"footerPanel\"]/ul[1]/li[1]/a"));
        homeButton.click();
        System.out.println("You are in Home");

        WebElement SignOutButton = driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[8]/a"));
        SignOutButton.click();
        System.out.println("You are signout!!!");
    }
}
