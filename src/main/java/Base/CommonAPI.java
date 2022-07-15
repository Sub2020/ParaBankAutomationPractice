package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class CommonAPI {
    public WebDriver driver;

    @BeforeMethod
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Devraj\\IdeaProjects\\ParabankParasoftCom\\ChromeDriver\\New.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://parabank.parasoft.com/");


    }
    @AfterMethod
    public String getPageTitle(){
        return driver.getTitle();
    }
    @AfterMethod
    public void tearDown()
    {
        driver.close();
    }


    public void click(String locator){
        try{
            driver.findElement(By.id(locator)).click();
        }catch (Exception e){
            driver.findElement(By.xpath(locator)).click();
        }
    }
    public void type(String locator, String text){
        try {
            driver.findElement(By.name(locator)).sendKeys(text);
        }catch (Exception e){
            driver.findElement(By.xpath(locator)).sendKeys(text);

        }
    }
    public boolean isPresent(String locator){
        try {
            return driver.findElement(By.cssSelector(locator)).isDisplayed();
        }catch(Exception e){
            return driver.findElement(By.xpath(locator)).isDisplayed();
        }
    }

}
