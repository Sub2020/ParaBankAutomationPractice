package NepalDevAutomation;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AppTest {
    @Test
    public void test1() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Devraj\\IdeaProjects\\ParabankParasoftCom\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://parabank.parasoft.com/");
        String title = driver.getTitle();
        System.out.println("Title");
        Assert.assertEquals("ParaBank | Welcome | Online Banking", title);

    }

    @Test
    public void test2() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Devraj\\IdeaProjects\\ParabankParasoftCom\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://parabank.parasoft.com/");
        String title = driver.getTitle();
        System.out.println("Title");
        Assert.assertEquals("ParaBank | Welcome | Online Banking", title);
        //WebElement userField = driver.findElement(By.id("Customer Login"));
        //boolean userFieldIsDisplayed = CustomerLogin.isDisplayed();
    }
}


