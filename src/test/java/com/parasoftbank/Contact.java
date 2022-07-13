package com.parasoftbank;

import Base.CommonAPI;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Contact extends CommonAPI {

    @Test
    public void contact() {
        WebElement ConButton = driver.findElement(By.xpath("//*[@id=\"headerPanel\"]/ul[2]/li[3]/a"));
        ConButton.click();

        type("name", "Subrat Devkota");
        System.out.println("Name entered to contact");

        type("email", "NepalDev@USA.com");
        System.out.println("Email Entered");
    }
}

