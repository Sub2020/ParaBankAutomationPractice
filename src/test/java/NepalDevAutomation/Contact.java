package NepalDevAutomation;

import NepalDevAutomation.base.CommonAPI;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Contact extends CommonAPI {

    @Test
    public void contact() {
        WebElement ConButton = driver.findElement(By.xpath("//*[@id=\"headerPanel\"]/ul[2]/li[3]/a"));
        ConButton.click();

        WebElement ConField = driver.findElement(By.id("name"));
        ConField.sendKeys("Subrat Devkota");
        System.out.println("Name entered to contact");

        WebElement EmailField = driver.findElement(By.id("email"));
        EmailField.sendKeys("NepalDev@USA.com");
        System.out.println("Email Entered");
    }
}

