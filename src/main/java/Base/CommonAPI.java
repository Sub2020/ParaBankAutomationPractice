package Base;


import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.*;
import reporting.ExtentManager;
import reporting.ExtentTestManager;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.Date;

public class CommonAPI {


    String currentDir = System.getProperty("user.dir");
    String browserstackUsername = "subrat_GRk4Pm";
    String browserstackPassword = "qVofjq3S4DoWizRLmPiZ";
    String saucelabsUsername = "";
    String saucelabsPassword = "";


    public WebDriver driver;
    public static com.relevantcodes.extentreports.ExtentReports extent;

    @BeforeSuite
    public void extentSetup(ITestContext context) {
        ExtentManager.setOutputDirectory(context);
        extent = ExtentManager.getInstance();
    }

    @BeforeMethod
    public void startExtent(Method method) {
        String className = method.getDeclaringClass().getSimpleName();
        String methodName = method.getName().toLowerCase();
        ExtentTestManager.startTest(method.getName());
        ExtentTestManager.getTest().assignCategory(new String[]{className});
    }

    protected String getStackTrace(Throwable t) {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        t.printStackTrace(pw);
        return sw.toString();
    }

    @AfterMethod
    public void afterEachTestMethod(ITestResult result) {
        ExtentTestManager.getTest().getTest().setStartedTime(this.getTime(result.getStartMillis()));
        ExtentTestManager.getTest().getTest().setEndedTime(this.getTime(result.getEndMillis()));
        String[] var2 = result.getMethod().getGroups();
        int var3 = var2.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            String group = var2[var4];
            ExtentTestManager.getTest().assignCategory(new String[]{group});
        }

        if (result.getStatus() == 1) {
            ExtentTestManager.getTest().log(LogStatus.PASS, "Test Passed");
        } else if (result.getStatus() == 2) {
            ExtentTestManager.getTest().log(LogStatus.FAIL, this.getStackTrace(result.getThrowable()));
        } else if (result.getStatus() == 3) {
            ExtentTestManager.getTest().log(LogStatus.SKIP, "Test Skipped");
        }

        ExtentTestManager.endTest();
        extent.flush();



        this.driver.quit();
    }

    @AfterSuite
    public void generateReport() {
        extent.close();
    }

    private Date getTime(long millis) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(millis);
        return calendar.getTime();}


    public void getCloudDriver(String envName, String username, String password, String os, String osVersion, String browser, String browserVersion) throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("os", os);
        cap.setCapability("os_version", osVersion);
        cap.setCapability("browser", browser);
        cap.setCapability("browser_version", browserVersion);
        if (envName.equalsIgnoreCase("browserstack")) {
            cap.setCapability("resolution", "1024x768");
            this.driver = new RemoteWebDriver(new URL("http://" + username + ":" + password + "@hub-cloud.browserstack.com:80/wd/hub"), cap);
        } else if (envName.equalsIgnoreCase("saucelabs")) {
            this.driver = new RemoteWebDriver(new URL("http://" + username + ":" + password + "@ondemand.saucelabs.com:80/wd/hub"), cap);

        }
    }

    public void getLocalDriver(String os, String browser) {

        if (os.equalsIgnoreCase("mac")) {
            if (browser.equalsIgnoreCase("chrome")) {
                System.setProperty("webdriver.chrome.driver", currentDir + "\\driver\\mac\\chromedriver");
                driver = new ChromeDriver();
            } else if (browser.equalsIgnoreCase("firefox")) {
                System.setProperty("webdriver.gecko.driver", currentDir + "\\driver\\mac\\geckodriver\\");
                driver = new FirefoxDriver();
            } else if (browser.equalsIgnoreCase("Edge")) {
                System.setProperty("webdriver.edge.driver", currentDir + "\\driver\\mac\\msedgedriver");
                driver = new EdgeDriver();

            }

        } else if (os.equalsIgnoreCase("windows")) {
            if (browser.equalsIgnoreCase("chrome")) {
                System.setProperty("webdriver.chrome.driver", currentDir + "\\driver\\windows\\chromedriver.exe");
                driver = new ChromeDriver();
            } else if (browser.equalsIgnoreCase("firefox")) {
                System.setProperty("webdriver.gecko.driver", currentDir + "\\driver\\windows\\geckodriver.exe");
                driver = new FirefoxDriver();
            } else if (browser.equalsIgnoreCase("Edge")) {
                System.setProperty("webdriver.edge.driver", currentDir + "\\driver\\windows\\msedgedriver.exe");
                driver = new EdgeDriver();
            }
        }
    }


    @Parameters({"useCloudEnv", "envName", "os", "osVersion", "browser", "browserVersion", "url"})
    @BeforeMethod
    public void setUp(@Optional("false") boolean useCloudEnv, @Optional("browserstack") String envName, @Optional("mac") String os, @Optional("Sierra") String osVersion, @Optional("chrome") String browser, @Optional("100") String browserVersion, @Optional("http://www.google.com") String url) throws MalformedURLException {
        if (useCloudEnv) {
            if (envName.equalsIgnoreCase("browserstack")) {
                this.getCloudDriver(envName, this.browserstackUsername, this.browserstackPassword, os, osVersion, browser, browserVersion);
            } else if (envName.equalsIgnoreCase("saucelabs")) {
                this.getCloudDriver(envName, this.saucelabsUsername, this.saucelabsPassword, os, osVersion, browser, browserVersion);
            }
        } else {
            this.getLocalDriver(os, browser);
        }
        driver.manage().window().maximize();
        driver.get(url);


    }
    public WebDriver getDriver() {
        return this.driver;
    }

    public String getPageTitle() {
        return this.driver.getTitle();
    }



//    @AfterMethod
//    public void tearDown() {
//        driver.close();
//    }


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
