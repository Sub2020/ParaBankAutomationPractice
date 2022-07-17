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

        click("//*[@id=\"loginPanel\"]/form/div[3]/input");
        System.out.println("Login Success.");

        click("//*[@id=\"leftPanel\"]/ul/li[7]/a");
        System.out.println("Click on loan Button success.");

        WebElement EnterLoanAmount = driver.findElement(By.xpath("//*[@id='amount']"));
        EnterLoanAmount.sendKeys("10000000");
        System.out.println("Loan amount entered.");

        WebElement EnterDownpayment = driver.findElement(By.xpath("//*[@id='downPayment']"));
        EnterDownpayment.sendKeys("500000");
        System.out.println("Down payment loan amount entered..");

        WebElement LoanAccount = driver.findElement(By.xpath("//*[@id='fromAccountId']"));
        LoanAccount.sendKeys("13344");
        System.out.println("Loan account entered.");


        click("//*[@id='rightPanel']");
        System.out.println("Click on loan button success.");
    }
}
