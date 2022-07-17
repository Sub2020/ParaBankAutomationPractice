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

        click("//*[@id='loginPanel']");
        System.out.println("Login Success.");


        click("//*[@id='leftPanel']");


        //WebElement EnterLoanAmount = driver.findElement(By.xpath("//*[@id='amount']"));
        type("//*[@id='amount']", "1000000");
        //click("//*[@id='amount']");
        //EnterLoanAmount.sendKeys("1000000");
        System.out.println("Loan amount entered.");

        WebElement EnterDownpayment = driver.findElement(By.xpath("//*[@id='downPayment']"));
        EnterDownpayment.sendKeys("500000");
        System.out.println("Account no. entered.");

        WebElement LoanAccount = driver.findElement(By.xpath("//*[@id='fromAccountId']"));
        //click("//*[@id='fromAccountId']");
        LoanAccount.sendKeys("19227");
        System.out.println("Down payment loan amount entered.");

        WebElement ClickSendLoan = driver.findElement(By.className("button"));
        ClickSendLoan.click();
        System.out.println("Click on loan button success.");
    }
}
