package com.parasoftbank;

import Base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WelcometoNewpage extends CommonAPI {

    @Test
    public void test(){

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Devraj\\IdeaProjects\\ParabankParasoftCom\\ChromeDriver\\New.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://parabank.parasoft.com/");



        WebElement homeButton = driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/p/b"));
        homeButton.click();
        System.out.println("You are in Home");

        WebElement SignOutButton = driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[8]/a"));
        SignOutButton.click();
        System.out.println("You are signout!!!");
    }
}
