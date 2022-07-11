package NepalDevAutomation;

import NepalDevAutomation.base.CommonAPI;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class EnterCredetial extends CommonAPI {
    @Test
    public void test(){
        WebElement nameField = driver.findElement(By.name("username"));
        nameField.sendKeys("BabuNepali");
        System.out.println("Username entered " + nameField);

        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("subrat123");
        System.out.println("password entered " + passwordField);

        WebElement loginBtnField = driver.findElement(By.xpath("//*[@id='loginPanel']/form/div[3]/input"));
        loginBtnField.click();
        System.out.println("Click on login Button Success");
    }
}
