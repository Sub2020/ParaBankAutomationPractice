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
        String Title = driver.getTitle();
        System.out.println("Login Page tile: " + title);


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
        WebElement nameField = driver.findElement(By.name("username"));
        boolean nameFieldDisplayed = nameField.isDisplayed();
        System.out.printf("Check if UserName field is displayed: %s%n", nameFieldDisplayed);
        assertTrue(nameFieldDisplayed);

        WebElement passwordField = driver.findElement(By.name("password"));
        boolean passwordFieldIsDisplayed = passwordField.isDisplayed();
        System.out.println("Check if password field is displayed: " + passwordFieldIsDisplayed);
        assertTrue(passwordFieldIsDisplayed);

        WebElement loginBtn = driver.findElement(By.name("login"));
        boolean loginBtnIsDisplayed = loginBtn.isDisplayed();
        System.out.println("Check if Login Button field is displayed: " + loginBtnIsDisplayed);
        Assert.assertTrue(loginBtnIsDisplayed);

    }

    @Test
    public void test3() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Devraj\\IdeaProjects\\ParabankParasoftCom\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://parabank.parasoft.com/");
        String title = driver.getTitle();
        System.out.println("Title");
        Assert.assertEquals("ParaBank | Welcome | Online Banking", title);
        String Title = driver.getTitle();
        System.out.println("Login Page tile: " + title);

        WebElement nameField = driver.findElement(By.name("username"));
        nameField.sendKeys("Dev2050");
        System.out.println("Username entered");

        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("4364922subratA");


    }
}


