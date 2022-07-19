package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class CommonAPI {

    String currentDir = System.getProperty("user.dir");
    public WebDriver driver;

    @Parameters({"os", "browser", "url"})
    @BeforeMethod
    public void setUp(String os, String browser, String url){
        if (os.equalsIgnoreCase("mac")) {
            if (browser.equalsIgnoreCase("chrome")){
                System.setProperty("webdriver.chrome.driver",currentDir + "\\driver\\mac\\chromedriver");
                driver = new ChromeDriver();
            } else if (browser.equalsIgnoreCase("firefox")){
                System.setProperty("webdriver.gecko.driver",currentDir +"\\driver\\mac\\geckodriver\\");
                driver = new FirefoxDriver();
            } else if (browser.equalsIgnoreCase("Edge")) {
                System.setProperty("webdriver.edge.driver", currentDir +"\\driver\\mac\\msedgedriver");
                driver = new EdgeDriver();

            }

        } else if (os.equalsIgnoreCase("windows")){
            if (browser.equalsIgnoreCase("chrome")){
                System.setProperty("webdriver.chrome.driver",currentDir + "\\driver\\windows\\chromedriver.exe");
                driver = new ChromeDriver();
            } else if (browser.equalsIgnoreCase("firefox")){
                System.setProperty("webdriver.gecko.driver",currentDir + "\\driver\\windows\\geckodriver.exe");
                driver = new FirefoxDriver();
            } else if (browser.equalsIgnoreCase("Edge")) {
                System.setProperty("webdriver.edge.driver", currentDir + "\\driver\\windows\\msedgedriver.exe" );
                driver = new EdgeDriver();

            }
        }
        driver.manage().window().maximize();
        driver.get(url);

    }

    @AfterMethod
    public String getPageTitle() {
        return driver.getTitle();
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }


    public void click(String locator) {
        try {
            driver.findElement(By.id(locator)).click();
        } catch (Exception e) {
            driver.findElement(By.xpath(locator)).click();
        }
    }

    public void clear(String locator) {
        try {
            driver.findElement(By.cssSelector(locator)).clear();
        } catch (Exception e) {
            driver.findElement(By.xpath(locator)).clear();
        }

    }

    public void type(String locator, String text) {
        try {
            driver.findElement(By.name(locator)).sendKeys(text);
        } catch (Exception e) {
            driver.findElement(By.xpath(locator)).sendKeys(text);

        }
    }

    public boolean isPresent(String locator) {
        try {
            return driver.findElement(By.name(locator)).isDisplayed();
        } catch (Exception e) {
            return driver.findElement(By.id(locator)).isDisplayed();
        }
    }

    public String getElementText(String locator) {
        try {
            return driver.findElement(By.cssSelector(locator)).getText();
        } catch (Exception e) {
            return driver.findElement(By.xpath(locator)).getText();
        }
    }


    public static void main(String[] args) {
        String path = System.getProperty("user.dir");
        System.out.println(path);
    }
}


