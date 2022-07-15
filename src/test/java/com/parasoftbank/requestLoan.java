package com.parasoftbank;

import Base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class requestLoan extends CommonAPI {

    @Test
    public void test11(){

        type("username", "BabuNepali");
        System.out.println("Username entered");

        type("password", "subrat123");
        System.out.println("Password entered");

        WebElement clickLogIn = driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input"));
        clickLogIn.click();
        System.out.println("Login Success.");

        WebElement ClickRequestLoan = driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[7]/a"));
        ClickRequestLoan.click();

        WebElement EnterLoanAmount = driver.findElement(By.xpath("//*[@id=\"amount\"]"));
        EnterLoanAmount.sendKeys("1000000");
        System.out.println("Loan amount entered.");

        WebElement EnterDownpayment = driver.findElement(By.xpath("//*[@id=\"downPayment\"]"));
        EnterDownpayment.sendKeys("500000");
        System.out.println("Account no. entered.");

        WebElement LoanAccount = driver.findElement(By.xpath("//*[@id=\"fromAccountId\"]"));
        LoanAccount.sendKeys("19227");
        System.out.println("Down payment loan amount entered.");

        WebElement ClickSendLoan = driver.findElement(By.className("button"));
        ClickSendLoan.click();
        System.out.println("Click on loan button success.");
    }
}
